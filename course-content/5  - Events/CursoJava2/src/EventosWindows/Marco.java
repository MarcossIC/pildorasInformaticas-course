
package EventosWindows;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;



public class Marco extends JFrame{
    
    public Marco(){
         
        setVisible(true);
        
        addWindowListener(new eVentana());
        
    }
}

class eVentana  extends WindowAdapter{
        
    public void windowIconified(WindowEvent e) { 
    
        System.out.println("La ventana ha sido minimizada");
    }

    
}