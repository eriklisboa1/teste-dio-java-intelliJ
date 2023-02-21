package br.com.dio.model;

import java.util.Objects;

public class Pessoa {
    private String nome1;
    private String sobrenome;
    private Integer idade;

    public Pessoa() {
    }

    public Pessoa(String nome, String sobrenome, Integer idade) {
        this.nome1 = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }

    public String getNome1() {
        return nome1;
    }

    public void setNome1(String nome1) {
        this.nome1 = nome1;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nome1, pessoa.nome1) && Objects.equals(sobrenome, pessoa.sobrenome) && Objects.equals(idade, pessoa.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome1, sobrenome, idade);
    }

    @Override
    public String toString() {
        return "Seu nome é "
                 + nome1  +
                 " " + sobrenome +
                " e voce tem " + idade +
                " anos, agora escolha seu livro: ";
    }
}
