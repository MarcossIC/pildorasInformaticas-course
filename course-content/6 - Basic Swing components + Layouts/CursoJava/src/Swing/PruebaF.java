
package Swing;

import java.awt.GraphicsEnvironment;
import javax.swing.JOptionPane;

public class PruebaF {
    
    public static void main(String[] args) {
        
        String fuente = JOptionPane.showInputDialog("Introduce fuente");
        
        boolean si = false;
        
        String [] TiposF = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        
        for(String a: TiposF){
            if(fuente.equals(a)){
                si = true;
            }
        }
        if(si){

            JOptionPane.showMessageDialog(null,"La fuenta esta");
        } else {
            JOptionPane.showMessageDialog(null,"La fuente no esta");
        }
        
        
    }
}
