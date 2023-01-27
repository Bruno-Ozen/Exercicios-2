/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula12;

/**
 *
 * @author bruno
 */
public class Ave extends Animal{

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Bicando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Cantando");
    }
    
    public void fazerNinho(){
        System.out.println("Fazendo ninho");
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
