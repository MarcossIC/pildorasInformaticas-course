
package ComponentesSwing7;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;


public class pruebaSpiner {
    public static void main(String[] args) {
        Marco1 m1 = new Marco1();
        m1.setVisible(true);
    }
}

class Marco1 extends JFrame{
    public Marco1(){
        setTitle("Prueba spiner");
        setBounds(300, 150, 500, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        add(new Panel1());
    }
    
}

class Panel1 extends JPanel{
    
    public Panel1(){
        
        //String lista[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        
        JSpinner control1 = new JSpinner(new SpinnerNumberModel(5, 0, 10, 1));
        control1.setPreferredSize(new Dimension(40, 20));
       
        add(control1);
        
    }
    
}
