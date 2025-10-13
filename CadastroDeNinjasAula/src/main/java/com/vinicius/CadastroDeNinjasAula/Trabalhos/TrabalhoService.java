package com.vinicius.CadastroDeNinjasAula.Trabalhos;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrabalhoService {

    private final TrabalhoRepository trabalhoRepository;

    public TrabalhoService(TrabalhoRepository trabalhoRepository) {
        this.trabalhoRepository = trabalhoRepository;
    }

    public List<TrabalhoModel> getAllTrabalhos() {
        return trabalhoRepository.findAll();
    }

    public TrabalhoModel salvarTrabalho(TrabalhoModel trabalho) {
        return trabalhoRepository.save(trabalho);
    }
}
