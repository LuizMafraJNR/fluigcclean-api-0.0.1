package br.com.fluig.clean.controller;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import br.com.fluig.clean.model.Carros;
import br.com.fluig.clean.repository.CarroRepository;

@RestController // é um controlador rest
@RequestMapping("/carros")
public class CarroController {
	
	@Autowired // vai injetar uma isntancia de carro repository
	private CarroRepository carroRepository;
	
	/**
	 * Listar
	 * @return
	 */
	@GetMapping
	public List<Carros> listar() {
		return carroRepository.findAll();
	}
	
	
	/**
	 * Cadastrar
	 * @param carros
	 * @return
	 */
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED) // Muda de 200 para 201 de criado
	@Transactional
	public Carros adicionar(@RequestBody @Valid Carros carros) {
		return carroRepository.save(carros);
	}
	

}
