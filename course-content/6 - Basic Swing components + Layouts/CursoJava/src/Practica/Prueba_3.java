
package Practica;

import javax.swing.JOptionPane;


public class Prueba_3 {
    public static void main(String[] args) {
                  
            boolean arroba = false;
            int cantidad = 0;
            boolean punto = false;
            String prueba =JOptionPane.showInputDialog("Dime su correo"); 
            int tamaño = 0;
            for(int i=0; i<prueba.length(); i++){
                for(int c=0; c<prueba.length();c++){
                    tamaño = c;
                }
                
                if(prueba.charAt(i)== '@'){
                    arroba = true;
                    cantidad++;
                    if(cantidad >1){
                        arroba= false;
                    }
                 
                }
                if(prueba.charAt(tamaño) == '.'){
                     punto = false;
                } 
                if(prueba.charAt(tamaño) == '@'){
                     arroba = false;
                }  
                
                if(prueba.charAt(i) == '.'){
                    punto = true;     
                }
                for(int b=0; b<1;b++){
                    if(prueba.charAt(b)=='.'){
                        punto = false;
                    }
                }
                
                if(prueba.charAt(tamaño) == '.'){
                     punto = false;
                }               
            }
            
            if(arroba == true && punto == true){
                JOptionPane.showMessageDialog(null, "Su correo es valido");
            } else {
                JOptionPane.showMessageDialog(null, "Su correo es invalido");
            }
            
        
    }
}
