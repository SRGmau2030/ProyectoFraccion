/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author valem
 */
public class Fraccion {
    private int numerador;
    private int denominador;
    
    /* Metodos */
    public Fraccion (int num, int denom){
        asignaNumerador(num);
        asignaDenominador(denom);
    }
    
    public Fraccion (int num){
        asignaNumerador(num);
        asignaDenominador(1);
    }
    
    public Fraccion (){
        asignaNumerador(0);
        asignaDenominador(1);
    }
    
    public Fraccion(Fraccion frac){
        asignaNumerador(frac.obtenNumerador());
        asignaDenominador(frac.obtenDenominador());
    }

    private void asignaNumerador(int num) {
        numerador = num;
    }

    private void asignaDenominador(int denom) {
        if(denom == 0){
            System.err.println("No está definido");
            System.exit(1);
        }
            denominador = denom;
    }
    
    public int obtenNumerador(){
        return numerador;
    } 
    
    public int obtenDenominador(){
        return denominador;
    }
    
    public String aString(){
        return numerador + "/" + denominador;
        //return obtenNumerador() + "/" + obtenDenominador();
    }

    //Método 1
    public Fraccion sumarFraccion(int num, int denom){
        int numeradorResultado = 0;
        int denominadorResultado = 0;
        
        numeradorResultado = (numerador * denom)+(denominador * num);
        denominadorResultado = denominador * denom;
        
        Fraccion fraccionResultado = new Fraccion(numeradorResultado, denominadorResultado);
        
        return fraccionResultado;
    }
    
    public Fraccion restarFraccion(int num, int denom){

        int numeradorResultado = 0;
        int denominadorResultado = 0;
        
        numeradorResultado = (numerador * denom) - (denominador * num);
        denominadorResultado = (denominador * denom);
        
        Fraccion fraccionResultado = new Fraccion(numeradorResultado, denominadorResultado);
        
        return fraccionResultado;
    }
    
    public Fraccion multiplicarFraccion(int num, int denom){
        int numeradorResultado = 0;
        int denominadorResultado = 0;
        
        numeradorResultado = numerador * num;
        denominadorResultado = denominador * denom;
        
        Fraccion fraccionResultado = new Fraccion(numeradorResultado, denominadorResultado);
        
        return fraccionResultado;
        
    }
    
    public Fraccion dividirFraccion(int num, int denom){
        int numeradorResultado = 0;
        int denominadorResultado = 0;
        
        numeradorResultado = numerador * denom;
        denominadorResultado = denominador * num;
        
        Fraccion fraccionResultado = new Fraccion(numeradorResultado, denominadorResultado);
        
        return fraccionResultado;
       
    }
    
    //Método 2
    public void sumarFraccion(Fraccion fraccion) {
        //numerador = (numerador * fraccion.denominador)+(denominador * fraccion.numerador);
        //denominador = denominador * fraccion.denominador;
        int numeradorResultado = 0;
        int denominadorResultado = 0;
        
        numeradorResultado = (this.numerador * fraccion.obtenDenominador())+(this.denominador * fraccion.obtenNumerador());
        denominadorResultado = this.denominador * fraccion.obtenDenominador();
        
        System.out.println("La fraccion sumada es: " + numeradorResultado + "/" + denominadorResultado);
    }
    
    public void restarFraccion(Fraccion fraccion){
        //numerador = (numerador * fraccion.denominador)-(denominador * fraccion.numerador);
        //denominador = denominador * fraccion.denominador;
        
        int numeradorResultado = 0;
        int denominadorResultado = 0;
        
        numeradorResultado = (this.numerador * fraccion.obtenDenominador())-(this.denominador * fraccion.obtenNumerador());
        denominadorResultado = this.denominador * fraccion.obtenDenominador();
        
        System.out.println("La fraccion restada es: " + numeradorResultado + "/" + denominadorResultado);
    }
    
    public void multiplicarFraccion(Fraccion fraccion){
        int numeradorResultado = 0;
        int denominadorResultado = 0;
        
        numeradorResultado = this.numerador * fraccion.obtenNumerador();
        denominadorResultado = this.denominador * fraccion.obtenDenominador();
        
        System.out.println("La fraccion multiplicada es: " + numeradorResultado + "/" + denominadorResultado);
    }
     
     public void dividirFraccion(Fraccion fraccion){
        int numeradorResultado = 0;
        int denominadorResultado = 0;
        
        numeradorResultado = this.numerador * fraccion.obtenDenominador();
        denominadorResultado = this.denominador * fraccion.obtenNumerador();
        
        System.out.println("La fraccion dividida es: " + numeradorResultado + "/" + denominadorResultado);
    }
   
    
}
