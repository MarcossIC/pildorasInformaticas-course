
package ComponentesSwing6;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class pruebaSlider2 {
    public static void main(String[] args) {
       Marco2 m2 = new Marco2();
       m2.setVisible(true);
    }
}

class Marco2 extends JFrame{
    
    public Marco2(){
        setTitle("Prueba Slider");
        setBounds(300, 150, 635, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        add(new Panel2());
    }
    
}

class Panel2 extends JPanel{
    
    private JSlider slider1;
    private JLabel label1;
    private JPanel pane;
    
    public Panel2(){
        setLayout(new BorderLayout());
        pane = new JPanel();
        
        label1 = new JLabel("Habia una vez un gato que no ve...");
        
        add(label1, BorderLayout.CENTER); 
        
        iniSlider();
        
        add(pane, BorderLayout.NORTH);
        
    }
    
    public void iniSlider(){
        slider1 = new JSlider(8, 40, 10);
        slider1.setMajorTickSpacing(8);
        slider1.setMinorTickSpacing(4);
        slider1.setPaintLabels(true);
        slider1.setPaintTicks(true);
        slider1.setFont(new Font("Dialog", Font.ITALIC, 10) );

        slider1.addChangeListener(new ChangeListener() {
           
            public void stateChanged(ChangeEvent e) {
               label1.setFont(new Font("Dialog", Font.ITALIC, slider1.getValue()) );
            }
        });
        
        pane.add(slider1);
    }
    
    
}
