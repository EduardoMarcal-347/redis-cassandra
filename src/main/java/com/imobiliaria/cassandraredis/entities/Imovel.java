package com.imobiliaria.cassandraredis.entities;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Table()
public class Imovel {

    @PrimaryKey
    private UUID id;

    private String endereco;
    private String tipoImovel;
    private Double area;
    private Double preco;

    public Imovel() {
    }

    public Imovel(String endereco, String tipoImovel, Double area, Double preco) {
        this.endereco = endereco;
        this.tipoImovel = tipoImovel;
        this.area = area;
        this.preco = preco;
    }

    public Imovel(UUID id, String endereco, String tipoImovel, Double area, Double preco) {
        this.id = id;
        this.endereco = endereco;
        this.tipoImovel = tipoImovel;
        this.area = area;
        this.preco = preco;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTipoImovel() {
        return tipoImovel;
    }

    public void setTipoImovel(String tipoImovel) {
        this.tipoImovel = tipoImovel;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
