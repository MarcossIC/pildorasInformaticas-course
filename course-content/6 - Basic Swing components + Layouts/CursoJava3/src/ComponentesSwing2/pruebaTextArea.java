
package ComponentesSwing2;

import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class pruebaTextArea {
    public static void main(String[] args) {
        Marco1 m1 = new Marco1();
        m1.setVisible(true);
    }
}

class Marco1 extends JFrame{
    
    public Marco1(){
        setTitle("Prueba TextArea");
        setBounds(300, 150, 500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        add(new Panel1());
        
    }
    
}

class  Panel1 extends JPanel{
    
    private JTextArea areaT;
    
    public Panel1(){
        
        areaT = new JTextArea(8, 20);
        areaT.setLineWrap(true);
        
        JScrollPane PanelS = new JScrollPane(areaT);
        
        add(PanelS);
        
        JButton boton1 = new JButton("Dale");
        boton1.addActionListener(new GestionB());
        
        add(boton1);
        
    }
    
    private class GestionB implements ActionListener{

        
        public void actionPerformed(ActionEvent e) {
           
            
            
            System.out.println(areaT.getText());
            
        }
        
        
        
    }
}