package br.com.fluig.clean.model.dto;

import br.com.fluig.clean.model.Carro;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CarroDto {

    private String nome;
    private String modelo;
    private String marca;
    private LocalDate dataFabricação;
    private BigDecimal consumoMedioCidade;
    private BigDecimal consumoMedioRodovia;

    public CarroDto(){
    }

    public CarroDto(Carro carro) {
        this.nome = carro.getNome();
        this.modelo = carro.getModelo();
        this.marca = carro.getMarca();
        this.dataFabricação = carro.getDataFabricacao();
        this.consumoMedioCidade = carro.getConsumoMedioCidade();
        this.consumoMedioRodovia = carro.getConsumoMedioRodovia();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public LocalDate getDataFabricação() {
        return dataFabricação;
    }

    public void setDataFabricação(LocalDate dataFabricação) {
        this.dataFabricação = dataFabricação;
    }

    public BigDecimal getConsumoMedioCidade() {
        return consumoMedioCidade;
    }

    public void setConsumoMedioCidade(BigDecimal consumoMedioCidade) {
        this.consumoMedioCidade = consumoMedioCidade;
    }

    public BigDecimal getConsumoMedioRodovia() {
        return consumoMedioRodovia;
    }

    public void setConsumoMedioRodovia(BigDecimal consumoMedioRodovia) {
        this.consumoMedioRodovia = consumoMedioRodovia;
    }
}
