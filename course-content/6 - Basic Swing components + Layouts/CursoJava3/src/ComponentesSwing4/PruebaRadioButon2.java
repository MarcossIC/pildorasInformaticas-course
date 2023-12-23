

package ComponentesSwing4;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class PruebaRadioButon2 {
    public static void main(String[] args) {
        Marco2 m1 = new Marco2();
        m1.setVisible(true);
    }
}

class Marco2 extends JFrame{
    
    public Marco2(){
        setTitle("Ejemplo Practico Radio Boton");
        setBounds(350, 150, 650, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        add(new Panel2() );
        
    }
}

class Panel2 extends JPanel{
    
    private JLabel label1;
    private ButtonGroup grupo1;
    private JPanel panel2;
    
    public Panel2(){
        setLayout(new BorderLayout());
        
        panel2 = new JPanel();
        grupo1 = new ButtonGroup();

        label1 = new JLabel("Habia una vez un gato montez", JLabel.CENTER);
        label1.setFont(new Font("Serif", Font.PLAIN, 15) );
        
        add(label1, BorderLayout.CENTER );

        iniciarRadioB("Pequeño", false, 12);
        iniciarRadioB("Normal", true, 15);
        iniciarRadioB("Grande", false, 18);
        iniciarRadioB("Pequeño", false, 24);
        
        add(panel2, BorderLayout.SOUTH);
    }
    
    public void iniciarRadioB(String nombre, boolean select, final int tama){
        
        JRadioButton botonR = new JRadioButton(nombre, select); 
        grupo1.add(botonR);
        panel2.add(botonR);
        
        botonR.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label1.setFont(new Font("Serif", Font.PLAIN, tama) );
                
            }
        });
  
    }

}