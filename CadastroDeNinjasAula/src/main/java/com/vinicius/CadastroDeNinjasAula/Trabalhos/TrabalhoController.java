package com.vinicius.CadastroDeNinjasAula.Trabalhos;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trabalhos")
public class TrabalhoController {

    private final TrabalhoService trabalhoService;


    public TrabalhoController(TrabalhoService trabalhoService) {
        this.trabalhoService = trabalhoService;
    }

    @GetMapping
    public List<TrabalhoModel> getAllTrabalhos() {
        return trabalhoService.getAllTrabalhos();
    }

    @PostMapping
    public TrabalhoModel cadastrarTrabalho(@RequestBody TrabalhoModel trabalho) {
        return trabalhoService.salvarTrabalho(trabalho);
    }

}
