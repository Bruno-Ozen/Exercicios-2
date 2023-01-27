/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula12;

/**
 *
 * @author bruno
 */
public class Mamifero extends Animal{
    private String corPelo;
    @Override
    public void locomover() {
    }

    @Override
    public void alimentar() {
    }

    @Override
    public void emitirSom() {
        
    }

    public String getCorPelo() {
        return corPelo;
    }

    public float getPeso() {
        return peso;
    }

    public int getIdade() {
        return idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
    
}
