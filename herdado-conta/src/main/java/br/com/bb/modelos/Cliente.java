package br.com.bb.modelos;

// abaixo comentários javadoc

/**
 * Classe que representa um cliente do BB
 * @author Víctor Teixeira
 * @version 1.0
 */

public class Cliente {

    private String nome;
    private String cpf;
    private String profissao;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

}
