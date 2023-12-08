package com.imobiliaria.cassandraredis.controllers;


import com.imobiliaria.cassandraredis.dtos.ImovelDto;
import com.imobiliaria.cassandraredis.services.ImovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController()
@RequestMapping("api/v1/imovel")
public class ImovelController {

    @Autowired
    private ImovelService service;

    @GetMapping()
    public ResponseEntity<ImovelDto[]> findAll() {
        return service.findAll();
    }

    @GetMapping("id/{id}")
    public ResponseEntity<ImovelDto> findById(@PathVariable("id") UUID id) {
        return service.findById(id);
    }

    @PutMapping("id/{id}")
    public ResponseEntity<ImovelDto> update(@PathVariable("id") UUID id, @RequestBody() ImovelDto reqBody) {
        return service.update(id, reqBody);
    }

    @PostMapping()
    public ResponseEntity<ImovelDto> save(@RequestBody ImovelDto reqBody) {
        return service.save(reqBody);
    }

    @DeleteMapping("id/{id}")
    public void delete(@PathVariable("id") UUID id) {
        service.delete(id);
    }
}
