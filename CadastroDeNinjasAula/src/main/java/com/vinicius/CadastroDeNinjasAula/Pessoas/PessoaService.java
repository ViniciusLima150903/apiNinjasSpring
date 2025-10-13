package com.vinicius.CadastroDeNinjasAula.Pessoas;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    private final PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public List<PessoaModel> getAllPessoas() {
        return pessoaRepository.findAll();
    }

    public PessoaModel salvarPessoa(PessoaModel pessoaModel) {
        return pessoaRepository.save(pessoaModel);
    }

}
