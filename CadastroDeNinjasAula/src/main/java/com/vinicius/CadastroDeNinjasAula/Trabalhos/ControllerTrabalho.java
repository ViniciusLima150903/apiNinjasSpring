package com.vinicius.CadastroDeNinjasAula.Trabalhos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ControllerTrabalho {

    @GetMapping("/trabalhos/welcome")
    public String boasVindas() {
        return "bom dia, boas vindas fodidos";
    }
}
