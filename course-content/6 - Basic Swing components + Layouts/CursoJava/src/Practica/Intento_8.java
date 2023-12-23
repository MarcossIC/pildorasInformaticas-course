
package Practica;

import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Intento_8 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Programa para sacar el area de una figura geometrica");
        
        System.out.println("Elige un opcion: \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circulo");
        System.out.print("Eleccion: ");
        int opcion = tcl.nextInt();
        
        switch(opcion){
            case 1: 
                double lado = Double.parseDouble(JOptionPane.showInputDialog("Dime la longitud del lado de su cuadrado")); 
                
                JOptionPane.showMessageDialog(null, "El area de su cuadrado es: " + Math.pow(lado, 2));
                break;
                
            case 2:
                double base2 = Double.parseDouble(JOptionPane.showInputDialog("Dime la base de su rectangulo")); 
                double altura2 = Double.parseDouble(JOptionPane.showInputDialog("Dime la altura de su rectangulo")); 
                
                JOptionPane.showMessageDialog(null, "El area de su rectangulo es: " + base2 * altura2);
                break;
                
            case 3:
                double base3 = Double.parseDouble(JOptionPane.showInputDialog("Dime la base de su triangulo")); 
                double altura3 = Double.parseDouble(JOptionPane.showInputDialog("Dime la altura de su triangulo")); 
                
                JOptionPane.showMessageDialog(null, "El area de su triangulo es: " + (base3 * altura3)/2);
                break;
                
            case 4:
                double radio4 = Double.parseDouble(JOptionPane.showInputDialog("Dime el radio de su circulo")); 
                double result = Math.PI * (Math.pow(radio4, 2));
                DecimalFormat dr = new DecimalFormat("###.##");
                
                JOptionPane.showMessageDialog(null, "El area de su circulo es: " + dr.format(result) );
                break;
                
            default:           
        }
        
    }
}
