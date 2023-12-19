package com.imobiliaria.cassandraredis.controllers;


import com.imobiliaria.cassandraredis.dtos.ImovelDto;
import com.imobiliaria.cassandraredis.entities.Imovel;
import com.imobiliaria.cassandraredis.services.ImovelService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController()
@RequestMapping("api/v1/imovel")
public class ImovelController {

    @Autowired
    private ImovelService service;

    @GetMapping()
    public List<Imovel> findAll() {
        return service.findAll();
    }

    @GetMapping("id/{id}")
    public Imovel findById(@PathVariable("id") ObjectId id) {
        return service.findById(id);
    }

    @PutMapping("id/{id}")
    public Imovel update(@RequestBody() Imovel reqBody) {
        return service.update(reqBody);
    }

    @PostMapping()
    public Imovel save(@RequestBody Imovel reqBody) {
        return service.save(reqBody);
    }

    @DeleteMapping("id/{id}")
    public void delete(@PathVariable("id") ObjectId id) {
        service.delete(id);
    }
}
