
package eventoFoco2;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import javax.swing.JFrame;


public class Principal2 extends JFrame implements WindowFocusListener{
    
    Principal2 marco1;
    Principal2 marco2;
    
    public void iniciar(){
        marco1 = new Principal2();
        marco1.setVisible(true);
        marco1.setBounds(80, 100, 500, 350);
        marco1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        marco1.addWindowFocusListener(this);
        
        marco2 = new Principal2();
        marco2.setVisible(true);
        marco2.setBounds(680, 100, 500, 350);
        marco2.setDefaultCloseOperation(EXIT_ON_CLOSE);
        marco2.addWindowFocusListener(this);
        
    }
    
    public void windowGainedFocus(WindowEvent e) {
        
        if(e.getSource() == marco1){
            marco1.setTitle("Tengo el foco");
        } else {
            marco2.setTitle("Tengo el foco");
        }
    }

    public void windowLostFocus(WindowEvent e) {
        
        if(e.getSource() == marco1){
            marco1.setTitle("");
        } else {
            marco2.setTitle("");
        }
        
    }
    
    public static void main(String[] args) {
        Principal2 miV = new Principal2();
        
        miV.iniciar();
    }  
    
}
