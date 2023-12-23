
package Practica;

import javax.swing.JOptionPane;


public class Prueba_1 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Programa para adivinar un numero aleatorio");
        int aleatorio = (int)(Math.random()*100);
        int intentos = 0;
        int respuesta = 0;
        
        do{
            respuesta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            
            if(respuesta > aleatorio){
                JOptionPane.showMessageDialog(null, "El numero es menor");
                
            } else if(respuesta < aleatorio){
                JOptionPane.showMessageDialog(null, "El numero es mayor");
            } 
            intentos++;
        }while(respuesta != aleatorio);
        
        JOptionPane.showMessageDialog(null, "!Felicidades¡ Has adivinado el numero \n Te ha costado: " + intentos);
    }
}
