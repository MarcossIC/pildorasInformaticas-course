
package ComponentesSwing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


public class pruebaTextField2 {
    public static void main(String[] args) {
        Marco2 m1 = new Marco2();
        m1.setVisible(true);
    }
}

class Marco2 extends JFrame{
    public Marco2(){
        setTitle("Prueba Evento Document");
        setBounds(300, 150, 500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        add(new Panel2());
    }
    
}

class Panel2 extends JPanel{
    
    private JPasswordField campoC;
    
    
    public Panel2(){
        
        setLayout(new BorderLayout());
        
        JPanel Psuperior = new JPanel();
        Psuperior.setLayout(new GridLayout(2, 2));
        add(Psuperior, BorderLayout.NORTH);
        
        JLabel label1 = new JLabel("Usuario");   
        JLabel label2 = new JLabel("Contraseña");
        JTextField campoU = new JTextField(15);
        campoC = new JPasswordField(15);
        
        Psuperior.add(label1);
        Psuperior.add(campoU);
        Psuperior.add(label2);
        Psuperior.add(campoC); 
        
        campoC.getDocument().addDocumentListener(new EventD());
        
        JButton boton1 = new JButton("Enviar"); 
        add(boton1, BorderLayout.SOUTH);
        
    }
    
    private class EventD implements DocumentListener{

        public void insertUpdate(DocumentEvent e) {
            char[] contra;
            
            contra = campoC.getPassword();
            
            if (contra.length < 8 || contra.length > 12) {
                campoC.setBackground(Color.RED);
            } else {
                campoC.setBackground(Color.WHITE);
                
            }
        }

        public void removeUpdate(DocumentEvent e) {
            char[] contra;
            
            contra = campoC.getPassword();
            
            if (contra.length < 8 || contra.length > 12) {
                campoC.setBackground(Color.RED);
            } else {
                campoC.setBackground(Color.WHITE);
                
            }
        }

        public void changedUpdate(DocumentEvent e) {
            
        }
        
    }
    
}
