package com.vinicius.CadastroDeNinjasAula.Pessoas;

import jakarta.persistence.*;

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

    public PessoaModel() {
    }

    public PessoaModel(String nome, int idade, String email, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }
}
