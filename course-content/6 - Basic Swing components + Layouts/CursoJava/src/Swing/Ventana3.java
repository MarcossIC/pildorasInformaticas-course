
package Swing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Ventana3 {
    public static void main(String[] args) {
        VentanaText vent1 = new VentanaText();
        
        vent1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class VentanaText extends JFrame{
    public VentanaText(){
        setResizable(false);
        setVisible(true);
        setBounds(400, 200, 600, 450);
        setTitle("Ventana con Texto 1");
        
        Panel1 panel1 = new Panel1();
        add(panel1);
    }
    
}
class Panel1 extends JPanel{
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.drawString("Tu vieja", 200, 150);
        
        setBackground(new Color(220, 220, 220));
    }
}

