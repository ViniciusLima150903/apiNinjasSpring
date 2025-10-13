package com.vinicius.CadastroDeNinjasAula.Pessoas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "/pessoas")
public class PessoaController {

    private final PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @GetMapping
    public List<PessoaModel> getAllPessoas() {
        return pessoaService.getAllPessoas();
    }

    @PostMapping
    public PessoaModel cadastrarPessoa(@RequestBody PessoaModel pessoa) {
        return pessoaService.salvarPessoa(pessoa);
    }
}
