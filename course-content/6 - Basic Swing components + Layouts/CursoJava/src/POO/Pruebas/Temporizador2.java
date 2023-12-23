
package POO.Pruebas;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Temporizador2 {
    public static void main(String[] args) {
        Reloj tempo1 = new Reloj();
        
        tempo1.StartTempo(3000);
        
        JOptionPane.showMessageDialog(null, "Pulsa ok para detenr temporizador", "Mensaje Importante", 2); 
        System.exit(0);
        
    }
}

class Reloj{  
       
//METODOS   
    public void StartTempo(int intervalo){
        ActionListener oyente = new Hora2();
        
        Timer InTempo = new Timer(intervalo, oyente);
        
        InTempo.start();
              
    }
    
    class Hora2 implements ActionListener{

       public void actionPerformed(ActionEvent evento) {
            Date ahora = new Date();
            System.out.println("Hora cada 3 Seg: " + ahora);
            
                Toolkit.getDefaultToolkit().beep();      
        } 
    }
    
}