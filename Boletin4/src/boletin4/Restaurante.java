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
public class Restaurante {
    //atributos
    private int kilos_pulpo=0,kilos_patatas=0;
    
    //Constructor
    public Restaurante(){
        
    }
    
    public Restaurante(int a,int b){
        kilos_pulpo=a;kilos_patatas=b;
        
    }
    //Metodos
    public int get_clientes(){
        int personaspulpo=(kilos_pulpo/2)*3;
        int personas_patatas=kilos_patatas*3;
        if(personaspulpo<personas_patatas){
            System.out.println("Hay suficiente materia prima para servir a "+personaspulpo+" personas");
            return personaspulpo;
            } else{
            System.out.println("Hay suficiente materia prima para para servir a "+personaspulpo+" personas");
            return personas_patatas;
        }
        
    }
    
    public void añadir_pulpo(int a){
        kilos_pulpo=kilos_pulpo+a;
    }
    
    public void añadir_patatas(int a){
        kilos_patatas=kilos_patatas+a;
    }
    
    public void ver_pulpo(){
        System.out.println(kilos_pulpo+"Kg de pulpo");
    }
    
    public void ver_patatas(){
        System.out.println(kilos_patatas+"Kg de patatas");
    }
}
