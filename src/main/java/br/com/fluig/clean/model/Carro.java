package br.com.fluig.clean.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;


import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
@Data
@Entity
@Table(name = "carros")
public class Carro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String modelo;
	private String marca;
	// String to JSON
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern="dd/MM/yyyy") 
	private LocalDate dataFabricacao;
	private BigDecimal consumoMedioCidade;
	private BigDecimal consumoMedioRodovia;
	@OneToMany()
	@JoinColumn(name = "ID_CARRO")
	private List<Gasto> listaGastos;

	/*
	 * Estou usando o Lombok, então os getters,setters, hashCode and Equals ja estão gerados
	 */
}
