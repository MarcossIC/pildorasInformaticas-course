
package Swing;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana5 {

    public static void main(String[] args) {
        
                       
        VDibujos2 vent1 = new VDibujos2();

        vent1.setVisible(true);
        vent1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class VDibujos2 extends JFrame {

    public VDibujos2() {
        setTitle("Prueba Dibujo en ventana");
        setBounds(455, 100, 450, 450);
        

        Panel3 panel = new Panel3();
        panel.setBackground(SystemColor.window);
        add(panel);


    }
}

class Panel3 extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        
        Rectangle2D rectngulo = new Rectangle2D.Double(100, 100, 200, 150);

        g2.setPaint(Color.CYAN);
        g2.draw(rectngulo);
        g2.setPaint(Color.RED);
        g2.fill(rectngulo);

        g2.setPaint(Color.BLACK);
        Ellipse2D elip = new Ellipse2D.Double();
        elip.setFrame(rectngulo);
        
        g2.setPaint(Color.BLUE);
        g2.fill(elip);


    }

}
