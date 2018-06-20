package com.sqliteteste.database.model;

/**
 * Created by comp8 on 06/04/2017.
 */

public class PessoaModel {

    public static final String TABELA_NOME = "pessoa";
    public static final String COLUNA_ID = "_id",
            COLUNA_NOME = "nome",
            COLUNA_CPF = "cpf",
            COLUNA_ENDERECO = "endereco",
            COLUNA_CEP = "cep";

    public static final String CREAT_TABLE = " create table " + TABELA_NOME
            +"("
            +COLUNA_ID + " integer primary key autoincrement,"
            +COLUNA_NOME + " text not null,"
            +COLUNA_CPF + " text not null,"
            +COLUNA_ENDERECO + " text not null,"
            +COLUNA_CEP + " text not null"
            +")";

    public static final String DROP_TABLE = "drop table if exists"+TABELA_NOME;

    private long id;
    private String nome;
    private String cpf;
    private String endereco;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    private String cep;

}
