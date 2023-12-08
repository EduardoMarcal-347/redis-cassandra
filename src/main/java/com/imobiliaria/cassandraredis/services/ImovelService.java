package com.imobiliaria.cassandraredis.services;

import com.imobiliaria.cassandraredis.dtos.ImovelDto;
import com.imobiliaria.cassandraredis.entities.Imovel;
import com.imobiliaria.cassandraredis.repositories.ImovelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Service
public class ImovelService {

    @Autowired
    private ImovelRepository repository;

    public ResponseEntity<ImovelDto[]> findAll() {

    }

    public ResponseEntity<ImovelDto> findById(UUID id) {

    }

    public ResponseEntity<ImovelDto> update(UUID id, ImovelDto reqBody) {

    }

    public ResponseEntity<ImovelDto> save(ImovelDto reqBody) {

    }

    public void delete(UUID id) {

    }

}
