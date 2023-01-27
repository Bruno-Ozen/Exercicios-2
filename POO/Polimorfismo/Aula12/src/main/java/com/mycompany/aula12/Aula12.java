/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.aula12;
/**
 *
 * @author bruno
 */
public class Aula12 {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Arara arara = new Arara();
        Lambari lambari = new Lambari();
        Lagarto lagarto = new Lagarto();
        
        cachorro.setCorPelo("Marrom");
        cachorro.setIdade(5);
        cachorro.emitirSom();
        
        cachorro.reagir("Pra fora pandora!!");
    }
}
