package br.com.fluig.clean.model;

import lombok.Data;
import org.hibernate.annotations.GeneratorType;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "gastos")
public class Gasto {
    @javax.persistence.Id
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private BigDecimal valorGasolina;
    @NotNull
    private BigDecimal kmRodadosCidade;
    @NotNull
    private BigDecimal kmRodadosRodovia;
}
