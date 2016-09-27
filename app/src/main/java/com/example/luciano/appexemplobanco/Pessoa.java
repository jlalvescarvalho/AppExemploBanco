package com.example.luciano.appexemplobanco;

import com.orm.SugarRecord;

/**
 * Created by Luciano on 20/09/2016.
 */
public class Pessoa extends SugarRecord{

    private String Nome;
    private String Sobrenome;

    public Pessoa(String nome, String sobrenome) {
        Nome = nome;
        Sobrenome = sobrenome;
    }

    public Pessoa() {
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        Sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return "Nome: "+this.Nome+"\nSobrenome: "+this.Sobrenome;
    }
}
