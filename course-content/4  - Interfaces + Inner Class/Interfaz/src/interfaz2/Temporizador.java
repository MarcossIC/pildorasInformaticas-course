
package interfaz2;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class Temporizador{
    
    public static void main(String[] args) {
  
        DarHora oyente = new DarHora();
        
        Timer temporizador = new Timer(5000, oyente);
        
        temporizador.start();
        JOptionPane.showMessageDialog(null, "Pulsa ok para terminar");
                
        
    }
    
}

class DarHora implements ActionListener{
    
    public void actionPerformed(ActionEvent e){
        Date ahora = new Date();
        
        System.out.println("Te muestro la hora cada 5 segundos: " + ahora);
        
        Toolkit.getDefaultToolkit().beep();
        
    }
    
        
}
