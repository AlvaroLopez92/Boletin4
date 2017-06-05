/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4;

/**
 *
 * @author alvar
 */
public class Satelite {
    
    private double meridiano,paralelo,distanciaTerra;
    
    //asignando todos los valores en la misma linea
    public Satelite(){
        meridiano = 0; paralelo=0; distanciaTerra=0;
    }
    
    public Satelite (double m, double p, double d){
        meridiano=m;
        paralelo=p;
        distanciaTerra=d;
    }
    //colocado en varias lineas para verlo entero
    public void posicionar(){
        System.out.println("El satélite se encuantra en el paralelo "
                +paralelo+" meridiano "+meridiano+" a una distancia de la Tierra de "
                +distanciaTerra);
    }
    
}
