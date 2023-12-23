
package Practica;

import javax.swing.JOptionPane;


public class Prueba_5 {
    public static void main(String[] args) {
        String[] pais = new String[5];
        
        for(int i=0; i<5;i++){
            pais[i] = JOptionPane.showInputDialog("Igrese un pais");
        }
        
        for(String i:pais){
            System.out.println("Pais: " + i);
        }
        
    }
}
