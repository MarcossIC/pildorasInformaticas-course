
package EventMouse;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

public class Marco extends JFrame{
    
    public Marco(){
        setSize(400, 400);
        setTitle("Evento de Mouse");
        setLocationRelativeTo(null);
        
        setVisible(true);
        
        addMouseListener(new EventoRaton());
        addMouseMotionListener(new EventoRaton());
        
    }
}

class EventoRaton extends MouseAdapter{

    /*
    public void mouseClicked(MouseEvent e) {

    }

    public void mousePressed(MouseEvent e){

        if(e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK){
            System.out.println("Has pulsao el izquierdo");
            
        } else if(e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK){
            System.out.println("Has pulsao el derecho");
            
        } else if(e.getModifiersEx() == MouseEvent.BUTTON2_DOWN_MASK){
            System.out.println("Has pulsao la rueda del raton");
            
        }
        
    }*/
    
    public void mouseMoved(MouseEvent e){
        System.out.println(" Estas moviendo");
    }   
    
    public void mouseDragged(MouseEvent e){
        System.out.println(" estas arrastrando");
    }    
 
}