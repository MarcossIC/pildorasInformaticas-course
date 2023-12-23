
package Layouts1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class TipoFlow {
    public static void main(String[] args) {
        Marco m1 = new Marco();
        m1.setVisible(true);
        m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}

class Marco extends JFrame{
    
    public Marco(){
        setSize(600, 600);
        setLocationRelativeTo(null);
        //setResizable(false);

        add(new panel1(), BorderLayout.NORTH);
        add(new panel2(), BorderLayout.SOUTH);
        
    }
    
}

class panel1 extends JPanel{
    
    public panel1(){
        
        setLayout(new FlowLayout(FlowLayout.LEFT));
        
        add(new JButton("Centro")); 
        add(new JButton("Norte"));

        
    }
    
}

class panel2 extends JPanel{
    
    public panel2(){
        setLayout(new BorderLayout(10, 10));
        
        add(new JButton("Sur"), BorderLayout.SOUTH);
        add(new JButton("Este"), BorderLayout.EAST);
        add(new JButton("Oeste"), BorderLayout.WEST);
        add(new JButton("Norte"), BorderLayout.NORTH);
    }
}
