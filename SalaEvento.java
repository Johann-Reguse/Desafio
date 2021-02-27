/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.desafio.trabalho;


import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author johan
 */
public class SalaEvento {
    private String nome;
    private int lotacao;
    private int Qpessoas=0;
    List<Pessoa> ls = new LinkedList();

    public SalaEvento() {
    }

    public String getNome() {
        return nome;
    }

    public int getLotacao() {
        return lotacao;
    }
    
    public SalaEvento(String nome, int lotacao) {
        this.nome = nome;
        this.lotacao = lotacao;
    }
    
    public void adicionaPessoa(Pessoa p){
        ls.add(p);
        Qpessoas++;
}

    public int getQpessoas() {
        return Qpessoas;
    }

    public List<Pessoa> getLs() {
        return ls;
    }
    
    
    
    
    
}
