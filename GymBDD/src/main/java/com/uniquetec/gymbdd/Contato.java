/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uniquetec.gymbdd;

/**
 *
 * @author Vinicius
 */
public class Contato {
    
    //atributos
    private int id;
    private String nome;
    private String telefone;

    
    public Contato(int id, String nome, String telefone){
    this.id = id;
    this.nome = nome;
    this.telefone = telefone;
    
    
}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Contato{" + "id=" + id + ", nome=" + nome + ", telefone=" + telefone + '}';
    }
    
    
}