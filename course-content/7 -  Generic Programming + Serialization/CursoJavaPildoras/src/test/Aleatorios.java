
package test;

import javax.swing.JOptionPane;


public class Aleatorios {
    public static void main(String[] args) {
        int indice = Integer.parseInt(JOptionPane.showInputDialog("Introduce cantidad de elementos de la matriz"));
        
        int numAls[] = new int[indice];
        
        for (int i = 0; i < numAls.length; i++) {
            numAls[i] = (int) (Math.random() * 100);
            
        }
        
        for (int n : numAls) {
            System.out.println("Numero: " + n);
        }
    }
}
