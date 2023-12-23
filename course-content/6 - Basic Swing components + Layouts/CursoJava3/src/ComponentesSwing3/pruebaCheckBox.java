
package ComponentesSwing3;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class pruebaCheckBox {
    public static void main(String[] args) {
        Marco m1 = new Marco();
        m1.setVisible(true);
    }
}

class Marco extends JFrame{
    
    public Marco(){
        
        setTitle("Prueba CheckBox");
        setBounds(250, 150, 500, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        add(new Panel1());
    }
    
}

class Panel1 extends JPanel{
    
    private JLabel label1;
    private JCheckBox check1, check2;
    
    public Panel1(){
        
        JPanel panelTxT = new JPanel();
        JPanel panelCheck = new JPanel();
        setLayout(new BorderLayout());
        
        label1 = new JLabel("Habia una vez un gato montez.....");
        label1.setFont(new Font("Serif", Font.PLAIN, 24));
        panelTxT.add(label1);
        
        add(panelTxT, BorderLayout.CENTER);
        
        check1 = new JCheckBox("Negrita");
        check1.addActionListener(new UsaChecks());
        
        check2 = new JCheckBox("Cursiva");
        check2.addActionListener(new UsaChecks());
        
        panelCheck.add(check1);
        panelCheck.add(check2);
        
        add(panelCheck, BorderLayout.SOUTH);
        
        
    }
    
    private class UsaChecks implements ActionListener{

        
        public void actionPerformed(ActionEvent e) {
            int tipo = 0;
            
            if (check1.isSelected()) tipo+= Font.BOLD;
            
            if(check2.isSelected()) tipo+= Font.ITALIC;
            
            
            label1.setFont(new Font("Serif", tipo, 24));
            
        }
        
    }
    
}
