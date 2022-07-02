package br.com.fluig.clean.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fluig.clean.model.Carro;

/**
 * Server para conecatar ou passar dados d banco de dados
 * @author luizm
 * 
 * Responsavel por interagir com o banco de dados
 *
 */

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {

}
