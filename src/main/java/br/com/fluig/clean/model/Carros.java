package br.com.fluig.clean.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
@Data
@Entity
public class Carros {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String modelo;
	private String marca;
	/*
	 * PARA PODER PASSAR COMO STRING NO JSON
	 */
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern="dd/MM/yyyy") 
	private LocalDate dataFabricacao;
	
	private BigDecimal consumoMedioCidade;

	private BigDecimal consumoMedioRodovia;

	private BigDecimal precoLitro;

	private BigDecimal consumoCidade;

	private BigDecimal ConsumoRodovia;

	
	/*
	 * Estou usando o Lombok, então os getters,setters, hashCode and Equals ja estão gerados
	 */
	
	
	

	/**
	 * 
	 * AQUI EU CRIEI O METODO QUE FARIA O CALCULO DOS GASTOS.
	 * 
	 * POR MAIS QUE EU NÃO TENHA CONSEGUIDO IMPLEMENTAR ELE, A LOGICA EU ACREDITO ESTAR CORRETA.
	 * 
	 * 
	 * @param preco - PREÇO DA GASOLINA NO.
	 * @param consumoCidade - TOTAL DE KM PERCORRIDO DENTRO DA CIDADE.
	 * @param consumoRodovia -  TOTAL DE KM PERCORRIDO DENTRO DA RODOVIA.
	 * @return - DEVERÁ RETORNA UM VALOR DO TIPO BIGDECIMAL.
	 */
	public BigDecimal gastos(BigDecimal preco, BigDecimal consumoCidade, BigDecimal consumoRodovia) {

		this.precoLitro = preco;
		this.consumoCidade = consumoCidade;
		this.ConsumoRodovia = consumoRodovia;
		
		BigDecimal litrosGastoCidade = consumoCidade.divide(consumoMedioCidade);
		BigDecimal litrosGastoRodovia = consumoRodovia.divide(consumoMedioRodovia);
		BigDecimal somaTotalLitros = litrosGastoCidade.add(litrosGastoRodovia);
		
		BigDecimal gastos = somaTotalLitros.multiply(preco);
		
		return gastos;
		
	}

}
