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
public class SalaCafe {
    private int Lotação;
    private String nome;
    private List<Pessoa> l1 = new LinkedList();
    private int QPessoas=0;

    public SalaCafe() {
    }

    public List<Pessoa> getL1() {
        return l1;
    }

    
    public SalaCafe(String nome,int Lot) {
        this.nome = nome;
        this.Lotação = Lot;
    }
    
    public int getLotação() {
        return Lotação;
    }
    
    
    public void Adicionar(Pessoa p){
        l1.add(p);
        QPessoas++;
    }
    public int MostraQPessoas(){
        return this.QPessoas;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
    
}
