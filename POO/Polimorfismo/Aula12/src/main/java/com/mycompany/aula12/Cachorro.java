/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula12;

/**
 *
 * @author bruno
 */
public class Cachorro extends Mamifero{
    @Override
    public void emitirSom(){
        System.out.println("Latindo!");
    }
    
    public void reagir(String frase){
        switch(frase){
            case "Pra fora pandora!!":
                System.out.println("Sair");
                break;
            case "Bora passear":
                System.out.println("Ficar doida");
                break;
            case "Pandora":
                System.out.println("Ir até o dono");
                break;
        }
    }
    
    public void reagir(int hora){
        if(hora<5){
            System.out.println("Ficar irritada");
        }else if(hora >= 5 && hora < 12){
            System.out.println("Brincar");
        }else if(hora >= 12 && hora < 13){
            System.out.println("Pedir comida");
        }else if(hora >= 13){
            System.out.println("Dormir ou brincar");
        }
        
    }
    
    public void reagir(boolean dono){
        if(dono){
            System.out.println("Lamber");
        }else{
            emitirSom();
        }
    }
    
    public void reagir(int idade, float peso){
        if(idade < 10 && peso < 40f){
            System.out.println("Se divertir");
        }
        if(idade >= 40){
            System.out.println("Dormir");
        }
    }
}
