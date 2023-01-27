/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetoyoutube;

/**
 *
 * @author bruno
 */
public class ProjetoYoutube {

    public static void main(String[] args) {
        Video[] v = new Video[5];
        v[0] = new Video("Amoeba");
        v[1] = new Video("Venoninho extue");
        //System.out.println(v[0].toString());
        Gafanhoto g = new Gafanhoto("Bruno","Masculino", 18, "brunohp");
        //System.out.println(g.toString());
        Visualizacao vis = new Visualizacao(g, v[0]);
        Visualizacao vis2 = new Visualizacao(g, v[1]);
        v[0].play();
        v[1].play();
        vis.avaliar(85.5f);
        vis.avaliar();
        vis.avaliar(9);
        v[0].like();
        v[1].like();
        System.out.println(vis.toString());
        vis2.avaliar();
        vis2.avaliar(10);
        vis2.avaliar(80.2f);
        System.out.println(vis2.toString());
    }
}
