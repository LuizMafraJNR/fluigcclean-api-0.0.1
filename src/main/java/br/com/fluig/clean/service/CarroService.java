package br.com.fluig.clean.service;

import br.com.fluig.clean.model.Carro;
import br.com.fluig.clean.model.dto.CarroDto;
import br.com.fluig.clean.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    // Ver todos
    public List<Carro> lista(){
        return carroRepository.findAll();
    }

    // Adicionar novo veiculo
    public Carro adicionar(CarroDto dto) {
        Carro carro = new Carro();
        carro.setNome(dto.getNome());
        carro.setModelo(dto.getModelo());
        carro.setMarca(dto.getMarca());
        carro.setDataFabricacao(dto.getDataFabricação());
        carro.setConsumoMedioCidade(dto.getConsumoMedioCidade());
        carro.setConsumoMedioRodovia(dto.getConsumoMedioRodovia());

        return carroRepository.save(carro);
    }

    // Ver por ID
    public Carro acharporid(Long id) {
        Optional<Carro> carro = carroRepository.findById(id);
        if (carro.isPresent()) {
            return carro.get();
        } else {
            throw new RuntimeException();
        }
    }
    // Pesquisar id e atualizar alguns dados
    public Carro atualizarporid(Carro carro, CarroDto carroDto){
        carro.setNome(carroDto.getNome());
        carro.setModelo(carroDto.getModelo());
        carro.setMarca(carroDto.getMarca());
        carro.setDataFabricacao(carroDto.getDataFabricação());
        carro.setConsumoMedioCidade(carroDto.getConsumoMedioCidade());
        carro.setConsumoMedioRodovia(carroDto.getConsumoMedioRodovia());
        return carroRepository.save(carro);
    }

    // Deletar carro por algum ID
    public void deletar(Long id) {
        carroRepository.deleteById(id);
    }
}


