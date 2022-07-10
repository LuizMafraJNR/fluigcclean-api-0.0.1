package br.com.fluig.clean.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@Table(name = "gastos")
public class Gasto {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal valorGasolina;
    private BigDecimal kmRodadosCidade;
    private BigDecimal kmRodadosRodovia;
    private BigDecimal valorGasto;
    @ManyToOne()
    @JoinColumn(name = "ID_CARRO")
    private Carro carro;

}
