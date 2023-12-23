
package ComponentesSwing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class pruebaTextField {
    public static void main(String[] args) {
        Marco1 m1 = new Marco1();
        m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class Marco1 extends JFrame{
    
    public Marco1(){
        setTitle("Prueba JTextField");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);
        
        
        add(new Panel1());
    }
    
}

class  Panel1 extends JPanel{
    
    
    private JTextField campo1;
    private JLabel result;
    
    public Panel1(){    
        
        setLayout(new BorderLayout());
        
        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        
        result = new JLabel("", JLabel.CENTER);
        add(result, BorderLayout.CENTER);
        
        JLabel label =  new JLabel("Email:");
        panel2.add(label);
        
        campo1 = new JTextField(20);
        panel2.add(campo1);     
         
        JButton boton1 = new JButton("Comprobar");
        boton1.addActionListener(new Rtxt());
        panel2.add(boton1);
        
        add(panel2, BorderLayout.NORTH);
        
    }

    private class Rtxt implements ActionListener{
        public void actionPerformed(ActionEvent e) {      
            Comprobacion();
         
        }       
    }
    
    public void Comprobacion(){
        
        String email = campo1.getText().trim();
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int contador2 = 0;
        int contador3 = 0;
        
        for(int i = 0; i < email.length(); i++){
                if (email.charAt(i) == '@' ){
                    num1 = i;
                    contador2++;
                }
                if (email.charAt(i)== '.' ) {
                    num2 = i;
                    contador3++;
                }
            }
            
            if(contador2 == 1){
                if (num1 > 0) {
                    if (num1 < email.length()-1) {    
                        num3++;
                    }
                }
            }
            if (contador3 == 1) {
                if (num2 > 0) {
                    if (num2 < email.length()-1 ) {
                        num3++;
                    }
                }
            }
           
            if (num3 == 2) {
                result.setText("Correo valido");
            } else{
                result.setText("Correo Invalido");
            }
    }

}
