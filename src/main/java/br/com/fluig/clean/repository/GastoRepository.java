package br.com.fluig.clean.repository;

import br.com.fluig.clean.model.Carro;
import br.com.fluig.clean.model.Gasto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
@Repository
public interface GastoRepository extends JpaRepository<Gasto, Long> {
/**
    @Query("INSERT into Gasto (valorGasolina, kmRodadosCidade, kmRodadosRodovia) " +
            "VALUES(:valorGasolina, :kmRodadosCidade, :kmRodadosRodovia)")
    public Gasto adicionarGasto(Carro carro, BigDecimal valorGasolina, BigDecimal kmRodadosCidade, BigDecimal kmRodadosRodovia);
    */
}
