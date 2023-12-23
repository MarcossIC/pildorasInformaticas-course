
package Layout2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Principal {
    public static void main(String[] args) {
        MarcoC m1 = new MarcoC();
        
        m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m1.setVisible(true);
    }
}

class MarcoC extends JFrame{
    
    public MarcoC(){
        
        setTitle("Calculadora");
        setBounds(250, 150, 370, 400);
        setResizable(false);
        
        add(new PanelC());   
        //pack();
    }
    
}

class PanelC extends JPanel{
    
    private JPanel panel2 = new JPanel();
    private JButton pantalla;
    private  boolean inicio;
    private double resultado;
    private String ultimaOp;
    private int contador;

    public PanelC(){   
        inicio = true;
        ultimaOp = "=";
        contador = 0;
        setLayout(new BorderLayout());
        
        pantalla = new JButton("0");
        pantalla.setEnabled(false);
        pantalla.setBackground(new Color(200, 200, 200));
        add(pantalla, BorderLayout.NORTH);
        
         panel2.setLayout(new GridLayout(5,4));
         
        BotonesC("^", new Operaciones() );
        BotonesC("None", new Operaciones() );
        BotonesC("/", new Operaciones() );
        BotonesC("<=", new CambiarN() );
        
        BotonesC("7", new CambiarN());
        BotonesC("8", new CambiarN());
        BotonesC("9", new CambiarN());
        BotonesC("*", new Operaciones());
        
        BotonesC("4", new CambiarN());
        BotonesC("5", new CambiarN());
        BotonesC("6", new CambiarN());
        BotonesC("-", new Operaciones() );
        
        BotonesC("1", new CambiarN());
        BotonesC("2", new CambiarN());
        BotonesC("3", new CambiarN());
        BotonesC("+", new Operaciones());
        
        BotonesC("-/+", new CambiarN());
        BotonesC("0", new CambiarN());
        BotonesC(".", new CambiarN());
        BotonesC("=", new Operaciones());
        
        add(panel2, BorderLayout.CENTER);
    }
    
    public void BotonesC(String rotulo, ActionListener oyente){
        
        JButton botones = new JButton(rotulo);
        panel2.add(botones);
        botones.addActionListener(oyente);
        
    }
    
    private class CambiarN implements ActionListener{
        
        public void actionPerformed(ActionEvent e) {
            
            String entrada = e.getActionCommand();
                        
            if(inicio){
                pantalla.setText("");
                inicio = false;
            }
            
            if(entrada.equals("-/+")){
                pantalla.setText("-"+ pantalla.getText());
                
            } 
            else if(entrada.equals("<=")){
                String delete = pantalla.getText();
                contador--;  
                delete = delete.substring(0, contador);
                pantalla.setText(delete);
            
            } else{
                pantalla.setText(pantalla.getText() + entrada);
                contador++;  
            }
        }
        
    }
    
    private class Operaciones implements ActionListener{
        
        
        public void calcular(double numero){
            
            if(ultimaOp.equals("+")){
                resultado += numero;
 
            } else if(ultimaOp.equals("-")){
                resultado -= numero;
                
            } else if(ultimaOp.equals("/")){
                resultado /= numero;
                
            } else if(ultimaOp.equals("*")){
                resultado *= numero;
                
            }else if(ultimaOp.equals("=")){   
                resultado = numero;
            }
            
            pantalla.setText(""+resultado);
           
        }
  
        public void actionPerformed(ActionEvent e) {
            
            String operacion = e.getActionCommand();  
            
            calcular(Double.parseDouble( pantalla.getText()));
            ultimaOp = operacion;
            inicio = true;
            contador = 0;
           
        }
        
    }
    
}