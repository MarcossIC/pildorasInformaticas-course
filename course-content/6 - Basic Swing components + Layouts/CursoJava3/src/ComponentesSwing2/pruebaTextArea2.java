
package ComponentesSwing2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class pruebaTextArea2 {
    public static void main(String[] args) {
        Marco2 m1 = new Marco2();
        m1.setVisible(true);
    }
}

class Marco2 extends JFrame{
    
    public Marco2(){
        setTitle("Pruba 2 de TextArea");
        setBounds(250, 150, 500, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        add(new Panel2());
    }
    
}

class Panel2 extends JPanel{
    
    private JButton botonIn, botonSl;
    private  JTextArea areaT;
    
    public Panel2(){
        setLayout(new BorderLayout(5, 5));
        
        JPanel superior = new JPanel();
        superior.setLayout(new FlowLayout());
        
        botonIn = new JButton("Inserter Texto");
        botonIn.addActionListener(new ModiArea());
        superior.add(botonIn);
        
        botonSl = new JButton("On Salto");
        botonSl.addActionListener(new ModiArea());
        superior.add(botonSl);
        
        areaT = new JTextArea();
        JScrollPane scrol1 = new JScrollPane(areaT);
        add(scrol1, BorderLayout.CENTER);
        
        
        add(superior, BorderLayout.SOUTH);
        
    }
    
    private class ModiArea implements ActionListener{

        
        public void actionPerformed(ActionEvent e) {
            
            if(e.getSource() == botonIn){
                areaT.append("Habia una vez un gato montes... ");
                
            } else if(e.getSource() == botonSl){
                boolean saltar =! areaT.getLineWrap();
                
                areaT.setLineWrap(saltar);
                /*
                if (saltar) {
                    
                    botonSl.setText("Off Salto");
                } else {
                    botonSl.setText("On Salto");
                }*/
                
                botonSl.setText(saltar ? "Off Salto" : "On Salto");
                
            }
          
            
        }
        
    }
    
}