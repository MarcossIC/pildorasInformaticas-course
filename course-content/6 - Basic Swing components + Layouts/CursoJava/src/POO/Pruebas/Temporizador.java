package POO.Pruebas;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Temporizador {

    public static void main(String[] args) {

        Hora oyente = new Hora();
        Timer tempo = new Timer(5000, oyente);

        tempo.start();
        
        JOptionPane.showMessageDialog(null, "Pulsa ok para detenr temporizador", "Mensaje Importante", 2);
        
        System.exit(0);
    }
}

class Hora implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        Date ahora = new Date();
        System.out.println("Te pongo la Hora cada 5 seg: " + ahora);
        
        Toolkit.getDefaultToolkit().beep();

    }

  
   

}
