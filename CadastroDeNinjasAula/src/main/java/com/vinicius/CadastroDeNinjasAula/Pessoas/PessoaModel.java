package com.vinicius.CadastroDeNinjasAula.Pessoas;

import com.vinicius.CadastroDeNinjasAula.Trabalhos.TrabalhoModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "DB_PESSOAS")
public class PessoaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int idade;
    private String email;
    private String sexo;

    @ManyToOne
    @JoinColumn(name = "trabalho_id")
    private TrabalhoModel trabalho;

}
