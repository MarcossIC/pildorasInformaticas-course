
package ComponentesSwing5;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class pruebaComboBoc {
    public static void main(String[] args) {
        Marco1 m1 = new Marco1();
        m1.setVisible(true);
    }
}

class Marco1 extends JFrame{
    
    public Marco1(){
        setTitle("Prueba ComboBox");
        setBounds(300, 150, 500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        add(new Panel1());
        
    }
    
}

class Panel1 extends JPanel{
    
    private JComboBox combo1;
    private JPanel panel2;
    private JLabel label1;
    
    public Panel1(){
        setLayout(new BorderLayout());
        panel2 = new JPanel();

        label1 = new JLabel("Habia una vez tu vieja montez", JLabel.CENTER);
        label1.setFont(new Font("Serif", Font.PLAIN, 18) );
        
        add(label1, BorderLayout.CENTER);
        
        iniCombo();
        
        add(panel2, BorderLayout.NORTH);
        
    }
    
    public void iniCombo(){
        combo1 = new JComboBox();
        
        combo1.addItem("Serif");
        combo1.addItem("SansSerif");
        combo1.addItem("Monospaced");
        combo1.addItem("Dialog");
        
        panel2.add(combo1);  
        
        combo1.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                
                label1.setFont(new Font( (String) combo1.getSelectedItem(), Font.PLAIN, 18) );
                
            }
        });

    }
}
