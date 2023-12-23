package Swing;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana4 {

    public static void main(String[] args) {
        
                       
        VentanaDibujos vent1 = new VentanaDibujos();

        vent1.setVisible(true);
        vent1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class VentanaDibujos extends JFrame {

    public VentanaDibujos() {
        setTitle("Prueba Dibujo en ventana");
        setBounds(450, 100, 500, 500);

        Panel2 panel = new Panel2();

        add(panel);

    }
}

class Panel2 extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        Graphics2D g2 = (Graphics2D) g;
        
        Rectangle2D rectngulo = new Rectangle2D.Double(100, 100, 200, 150);
        
        g2.draw(rectngulo);

        Ellipse2D elipse = new Ellipse2D.Double();
        elipse.setFrame(rectngulo);
        
        g2.draw(elipse);      
        
       g2.draw(new Line2D.Double(100, 100, 300, 250));
       g2.draw(new Line2D.Double(100, 250, 300, 100));
       
       double cordX = rectngulo.getCenterX();
       double cordY = rectngulo.getCenterY();
       
       double radio = 150;
       
       elipse.setFrameFromCenter(cordX, cordY, cordX+150, cordY+100);
       
       g2.draw(elipse);
    }

}
