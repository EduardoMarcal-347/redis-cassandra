package com.imobiliaria.cassandraredis.dtos;

public class ImovelDto {

    private String endereco;
    private String tipoImovel;
    private Double area;
    private Double preco;

    public ImovelDto() {
    }

    public ImovelDto(String endereco, String tipoImovel, Double area, Double preco) {
        this.endereco = endereco;
        this.tipoImovel = tipoImovel;
        this.area = area;
        this.preco = preco;
    }
}
