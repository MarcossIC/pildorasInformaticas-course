
package Swing;

import javax.swing.JFrame;

public class Ventana1{
    
    public static void main(String[] args) {
        
       Ventana marco1 = new Ventana();
       marco1.setVisible(true);
       marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class Ventana extends JFrame{
    
    public Ventana(){  
        setBounds(450, 230, 450,350);
        setTitle("Venta Prueba 1");
        
    }
    
}
