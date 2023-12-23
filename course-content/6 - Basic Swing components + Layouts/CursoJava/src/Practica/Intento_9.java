
package Practica;

import javax.swing.JOptionPane;


public class Intento_9 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Prueba bucle While");
        
        String clave = "tuvieja";
        String contraseña = "";
       
        while(contraseña.equalsIgnoreCase(clave) == false ){
                       
            contraseña = JOptionPane.showInputDialog("Igrese su contraseña");
              
            if(contraseña.equalsIgnoreCase(clave) == false){
                JOptionPane.showMessageDialog(null, "Su contraseña es incorrecta");
                
            } else {
                JOptionPane.showMessageDialog(null, "Su contraseña es correcta");
            }
            
        }

    }
}
