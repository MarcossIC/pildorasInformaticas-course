
package Swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Ventana6 {

    public static void main(String[] args) {
        
              
        VDibujos3 vent1 = new VDibujos3();

        vent1.setVisible(true);
        vent1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}

class VDibujos3 extends JFrame {
    

    public VDibujos3( ) {
        setTitle("Prueba Dibujo en ventana");
        setBounds(455, 100, 450, 450);

        Panel4 panel = new Panel4();
        panel.setBackground(SystemColor.window);
        add(panel);

    }
}

class Panel4 extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        
        Font Fuent = new Font("Arial Black", Font.BOLD, 28);
        
        g2.setFont(Fuent);
        g2.setColor(Color.red);
        //g2.drawString("Juan", 100, 100);
        
        g2.setColor(Color.blue);
        g2.drawString("Puto el que Lee", 100, 200);
       
        //g2.setColor(Color.darkGray);
        //g2.drawString("Mas puto ese", 15, 278);

    }

}
