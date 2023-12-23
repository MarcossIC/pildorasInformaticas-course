
package EventoWindows2;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import javax.swing.JFrame;


public class Marco extends JFrame{
    
    public Marco(){
        
        setVisible(true);
        
        addWindowStateListener(new EstadoC());
        
    }
    
}

class EstadoC implements WindowStateListener{

       public void windowStateChanged(WindowEvent e){
           
           if(e.getNewState() ==  Frame.MAXIMIZED_BOTH){
               System.out.println("Pantalla Completa");
           } else if(e.getNewState() == Frame.ICONIFIED){
               System.out.println("Pantalla Minimizada");
               
           } else if(e.getNewState() == Frame.NORMAL){
               System.out.println("Pantalla en estado Normal");
               
           }
            
       }

    
    
}
