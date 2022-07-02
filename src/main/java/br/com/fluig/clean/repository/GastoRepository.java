package br.com.fluig.clean.repository;

import br.com.fluig.clean.model.Gasto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GastoRepository extends JpaRepository<Gasto, Long> {
}
