
package interfaz2;

import javax.swing.*;
import javax.swing.Timer;

import java.awt.event.*;
import java.awt.Toolkit;

import java.util.*;
public class TemporizadorBeep {
    
    public static void main(String[] args) {
        
        Reloj reloj1 = new Reloj();
        
        reloj1.marcha(3000, true);
        JOptionPane.showMessageDialog(null, "Para terminar pulse ok");
        
        System.exit(0);
    }
}

class Reloj{
    
    public void marcha(int intervalo, final boolean sonido){
        
        class Darhora2 implements ActionListener{
        
            public void actionPerformed(ActionEvent e){
                Date hora = new Date();
            
                System.out.println("La hora es: " + hora);
            
                if(sonido){
                    Toolkit.getDefaultToolkit().beep();
                }
            }
       }
        
        ActionListener oyente = new Darhora2();
        Timer contador = new Timer(intervalo, oyente);
        
        contador.start();
    }
    
}