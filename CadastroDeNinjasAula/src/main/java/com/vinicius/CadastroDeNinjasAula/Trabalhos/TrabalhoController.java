package com.vinicius.CadastroDeNinjasAula.Trabalhos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(name = "/trabalhos")
public class TrabalhoController {

    private final TrabalhoService trabalhoService;


    public TrabalhoController(TrabalhoService trabalhoService) {
        this.trabalhoService = trabalhoService;
    }

    @GetMapping
    public List<TrabalhoModel> getAllTrabalhos() {
        return trabalhoService.getAllTrabalhos();
    }

    @GetMapping
    public TrabalhoModel cadastrarTrabalho(@RequestBody TrabalhoModel trabalho) {
        return trabalhoService.salvarTrabalho(trabalho);
    }

}
