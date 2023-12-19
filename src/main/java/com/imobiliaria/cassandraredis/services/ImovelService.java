package com.imobiliaria.cassandraredis.services;

import com.imobiliaria.cassandraredis.dtos.ImovelDto;
import com.imobiliaria.cassandraredis.entities.Imovel;
import com.imobiliaria.cassandraredis.repositories.ImovelRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Service
public class ImovelService {

    @Autowired
    private ImovelRepository repository;

    @Cacheable(cacheNames = "all-imovel")
    public List<Imovel> findAll() {
        return repository.findAll();
    }

    @Cacheable(cacheNames = "single-imovel", key = "#id")
    public Imovel findById(ObjectId id) {
        return repository.findById(id).orElse(null);
    }

    @CacheEvict(value = {"all-imovel", "single-imovel"}, allEntries = true)
    public Imovel save(Imovel imovel) {
        return repository.save(imovel);
    }

    @CacheEvict(value = {"all-imovel", "single-imovel"}, allEntries = true)
    public Imovel update(Imovel imovel) {
        var imovelDb = repository.findById(imovel.getId()).orElseThrow();

        imovelDb.setEndereco(imovel.getEndereco());
        imovelDb.setArea(imovel.getArea());
        imovelDb.setPreco(imovel.getPreco());

        return repository.save(imovelDb);
    }

    @CacheEvict(value = {"all-imovel", "single-imovel"}, allEntries = true)
    public String delete(ObjectId objectId) {
        repository.findById(objectId).orElseThrow();

        repository.deleteById(objectId);

        return "Imovel deletado com sucesso";
    }
}
