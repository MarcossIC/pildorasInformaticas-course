
package layutsAvanzado;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Spring;
import javax.swing.SpringLayout;


public class DispocicionSpring {
    public static void main(String[] args) {
        Marco2 m1 = new Marco2();
        m1.setVisible(true);
          
    }
}

class Marco2 extends JFrame{
    
    public Marco2(){
        setTitle("Dispocicion Spring");
        setSize(700, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        add(new Panel2());
    }
}

class Panel2 extends JPanel{
    
    public Panel2(){
        JButton boton1 = new JButton("Boton 1");
        JButton boton2 = new JButton("Boton 2");
        JButton boton3 = new JButton("Boton 3");
        
        SpringLayout lay = new SpringLayout();
        setLayout(lay);
        
        add(boton1);
        add(boton2);
        add(boton3);
        
        Spring muelle = Spring.constant(0, 0, 100);
        Spring muelleF = Spring.constant(20);
     
        lay.putConstraint(SpringLayout.WEST, boton1, muelleF, SpringLayout.WEST, this);
        lay.putConstraint(SpringLayout.WEST, boton2, muelle, SpringLayout.EAST, boton1);
        lay.putConstraint(SpringLayout.WEST, boton3, muelle, SpringLayout.EAST, boton2);
        lay.putConstraint(SpringLayout.EAST, this, muelleF, SpringLayout.EAST, boton3);
        
        
    }
}
