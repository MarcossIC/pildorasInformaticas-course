
package Practica;

import javax.swing.JOptionPane;


public class Intento_7 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Programa para decir si dos numero son iguales o distintos");
        
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digame el primer numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digame el segundo numero"));
        
        if(num1 < num2){
            JOptionPane.showMessageDialog(null, "El numero " + num2 + " es mayor al numero " + num1);
            
        } else if(num1 > num2) {
             JOptionPane.showMessageDialog(null, "El numero " + num1 + " es mayor al numero " + num2);
             
        } else {
            JOptionPane.showMessageDialog(null, "Los numeros " + num1 + " y " + num2 + " Son iguales");
        }
    }
}
