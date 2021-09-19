package br.com.nossacasacodigo.modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Autor {

    private String nome;
    private String email;
    private String descricao;
    private LocalDate dataCadastro;

    public Autor(String nome, String email, String descricao) {
        setNome(nome);
        setEmail(email);
        setDescricao(descricao);
        this.dataCadastro = LocalDate.now();
    }

    public void setNome(String nome) {
        if(nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome inválido!");
        }

        this.nome = nome;
    }

    public void setEmail(String email) {
        String validacao = "^([\\w\\.\\-]+)@([\\w\\-]+)((\\.(\\w){2,3})+)$";
        boolean emailValido = email.matches(validacao);

        if(!emailValido) {
            throw new IllegalArgumentException("E-mail inválido!");
        }

        this.email = email;
    }

    public void setDescricao(String descricao) {
        if(descricao == null || descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("Descrição inválida!");
        }

        if(descricao.length() > 400) {
            throw new IllegalArgumentException("A descrição deve conter no máximo 400 caracteres!");
        }

        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Autor{ nome='" + this.nome + ", email='" + this.email + ", descricao='" + this.descricao + ", dataCadastro=" + this.dataCadastro + "}";
    }
}
