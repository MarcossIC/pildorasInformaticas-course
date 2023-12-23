
package eventosFoco;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Marco extends JFrame{
    
    
    
    public Marco(){
       setBounds(0, 0, 650, 550);
       setResizable(false);
       setLocationRelativeTo(null);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       
        add(new focoE());
    }
}

class focoE extends JPanel{

    private JTextField field1;
    private JTextField field2;
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        setLayout(null);
        field1 = new JTextField();
        field1.setBounds(120, 20, 150, 20);
        add(field1);
        
        field2 = new JTextField();
        field2.setBounds(120, 70, 150, 20);
        add(field2);
        
        field1.addFocusListener(new eventoF());

        
    }
    

    private class eventoF implements FocusListener{

        @Override
        public void focusGained(FocusEvent e) {
        
        }

        @Override
        public void focusLost(FocusEvent e) {
            
            
            String email = field1.getText();
            
            
            if(email.contains("@") == false){
                System.out.println("Incorrecto");
            }  
            
            /*
            boolean comprobacion = false;
            for(int i = 0; i < email.length(); i++){
                
                if(email.charAt(i) == '@'){
                     comprobacion = true;
                }
                
            }
           
            if(comprobacion){
                System.out.println("Correcto");
            } else{
                System.out.println("Incorrecto");
            }
             */

            
        }
    
    }  
    
}
