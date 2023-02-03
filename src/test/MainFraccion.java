/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dominio.Fraccion;
import java.util.Scanner;

public class MainFraccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Fraccion f1 = new Fraccion(4, 5);
        Fraccion f2 = new Fraccion(3, 4); 
        
        System.out.println("Fracción 1: "+ f1.aString());
        System.out.println("Fracción 2: "+ f2.aString());
        
        f1.sumarFraccion(f2);
        
        f1.restarFraccion(f2);
        
        f1.multiplicarFraccion(f2);
        
        f1.dividirFraccion(f2);
        
        Fraccion fracResult = f1.multiplicarFraccion(3, 4);
        System.out.println("Multiplicar método 2: " + fracResult.aString());
        
        //System.out.println(f1.multiplicarFraccion(3, 4).aString());
        
        f1.dividirFraccion(f2);
        
           
    }
    
}
