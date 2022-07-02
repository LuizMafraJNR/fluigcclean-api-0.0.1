package br.com.fluig.clean.controller;

import java.util.List;

import javax.validation.Path;
import javax.validation.Valid;

import br.com.fluig.clean.model.dto.CarroDto;
import br.com.fluig.clean.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;


import br.com.fluig.clean.model.Carro;
import br.com.fluig.clean.repository.CarroRepository;

@RestController // é um controlador rest
@RequestMapping("/carros")
public class CarroController {
	
	@Autowired
	private CarroService carroService;

	//Listar todos
	@GetMapping
	public List<Carro> listar() {
		return carroService.lista();
	}

	// Adicionar carro
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	@Transactional
	public Carro adicionar(@RequestBody CarroDto dto){
		return carroService.adicionar(dto);
	}

	// Encontrar carro por ID
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Carro encontrarPorID(@PathVariable Long id){
		return carroService.acharporid(id);
	}

	// Atualizar dados pelo ID
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	@Transactional
	public Carro atualizarPorId(@RequestBody CarroDto carroDto, @PathVariable Long id){
		Carro carro = carroService.acharporid(id);
		return carroService.atualizarporid(carro, carroDto);
	}

	// Deletar algum carro por ID
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	@Transactional
	public void deletarCarro(@PathVariable Long id){
		carroService.deletar(id);
	}
}
