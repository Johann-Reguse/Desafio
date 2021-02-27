/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.desafio.trabalho;

/**
 *
 * @author johan
 */
public class Pessoa {
    private String nome;
    private String sobrenome;

    public Pessoa() {
    }
    
    
    public Pessoa(String n, String m){
        this.nome = n;
        this.sobrenome = m;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

   

    /**
     * @return the sobrenome
     */
    public String getSobrenome() {
        return sobrenome;
    }

    
}