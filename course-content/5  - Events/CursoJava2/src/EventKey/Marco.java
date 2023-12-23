
package EventKey;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;


public class Marco extends JFrame{

    public Marco(){
        setSize(400, 400);
        setLocationRelativeTo(null);
        setVisible(true);
             
        addKeyListener(new EventoTeclado());
    }
    
    
}

class EventoTeclado implements KeyListener{

    public void keyTyped(KeyEvent e) {
        
        
    }

    public void keyPressed(KeyEvent e) {
        

    }

    public void keyReleased(KeyEvent e) {
        System.out.println("Se presiono: " + e.getKeyChar());
    }
    
}