package com.vinicius.CadastroDeNinjasAula;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {


    @GetMapping("/welcome")
    public String boasVindas() {
        return "bom dia, boas vindas fodidos";
    }
}
