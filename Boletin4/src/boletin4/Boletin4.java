/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author alvar
 */
public class Boletin4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
            Coche coche = new Coche();
            System.out.println(coche.getVelocidad());
            coche.acelerar(40);
            System.out.println(coche.getVelocidad());
            coche.acelerar(200);
            System.out.println(coche.getVelocidad());
            coche.frenar(100);
            System.out.println(coche.getVelocidad());

            
            Satelite s1= new Satelite();
            s1.posicionar();
            Satelite s2=new Satelite(21.45,31.87,1958746);
            s2.posicionar();

            
            Circulo c1=new Circulo();
            c1.setRadio(Float.parseFloat(JOptionPane.showInputDialog("Introduce el valor del radio del circulo")));
            System.out.println("el radio es "+c1.getRadio());
            System.out.println("la longitud es de "+c1.calcularlongitud());
            System.out.println("el area es de "+c1.calculararea());
            Circulo c2 = new Circulo(10);
            System.out.println(c2.calculararea());
            System.out.println(c2.calcularlongitud());

            
            Restaurante rest1=new Restaurante(100,50);
            Scanner sc1=new Scanner(System.in);
            rest1.get_clientes();
            rest1.añadir_pulpo(sc1.nextInt());
            rest1.get_clientes();
            rest1.añadir_patatas(sc1.nextInt());
            rest1.get_clientes(); 
            rest1.ver_patatas();

            
    }
    
}
    

