package com.vinicius.CadastroDeNinjasAula.Pessoas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ControllerPessoa {


    @GetMapping("/pessoas/welcome")
    public String boasVindas() {
        return "bom dia, boas vindas fodidos";
    }
}
