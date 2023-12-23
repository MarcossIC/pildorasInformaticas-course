
package ComponentesSwing6;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;


public class pruebaSlider {
    public static void main(String[] args) {
        
        Marco1 m1 = new Marco1();
        m1.setVisible(true);
    }
}

class Marco1 extends JFrame{
    
    public Marco1(){
        setTitle("Bienvenida");
        setBounds(300, 150, 500, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        add(new Panel1());
    }
    
}

class Panel1 extends JPanel{
    
    private JSlider slider1;
    
    public Panel1(){
        slider1 = new JSlider(0, 100, 25);
        
        slider1.setMajorTickSpacing(50);
        slider1.setMinorTickSpacing(25);
        
        slider1.setPaintTicks(true);
        
        slider1.setFont(new Font("SansSerif", Font.ITALIC, 12));
        
        slider1.setPaintLabels(true);
        slider1.setSnapToTicks(true);
        
        add(slider1);
    }
    
}