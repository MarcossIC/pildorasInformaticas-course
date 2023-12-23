
package Practica;

import java.math.MathContext;


public class Intento_5 {
    public static void main(String[] args) {
        double raiz = Math.sqrt(10);
        double pote = Math.pow(4, 2);
        
        System.out.println("La raiz es: " + raiz);
        System.out.println("La potencia es: " + pote);
        System.out.println("");
        
        int redon = (int)Math.round(raiz);
        
        System.out.println("La raiz redondeada es: " + redon);
    }
}