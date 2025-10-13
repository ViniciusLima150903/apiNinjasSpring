package com.vinicius.CadastroDeNinjasAula.Trabalhos;

import com.vinicius.CadastroDeNinjasAula.Pessoas.PessoaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "DB_TRABALHOS")
public class TrabalhoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cargo;
    private String descricao;
    private BigDecimal salario;

    @OneToMany(mappedBy = "trabalho")
    private List<PessoaModel> pessoas;

}
