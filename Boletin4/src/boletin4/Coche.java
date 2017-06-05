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
public class Coche {
    
    private int velocidad;
    
    public Coche(){
        velocidad = 0;
    }
    
    public int getVelocidad(){
        return velocidad;
    }
    
    public void acelerar(int aceleracion){
        velocidad= velocidad+aceleracion;
    }
    
    public void frenar(int frenado){
        velocidad= velocidad - frenado;
    }
}
