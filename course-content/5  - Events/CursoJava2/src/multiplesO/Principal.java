
package multiplesO;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Principal {
    
    public static void main(String[] args) {
        Marco m1 = new Marco();
        m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m1.setVisible(true);
    }
    
}

class Marco extends JFrame{
    
    public Marco(){
        setSize(400, 250);
        setTitle("Prueba multiples fuentes");
        setLocationRelativeTo(null);
        
        add(new panel1());
    }
    
}

class panel1 extends JPanel {
    
    JButton botonNuevo, botonCerrar;
    
    public panel1(){
        
        botonNuevo = new JButton("Nuevo");
        add(botonNuevo);
        botonNuevo.addActionListener(new OyenteN());
                
        
        botonCerrar = new JButton("Cerrar Todo");
        add(botonCerrar);
        
        
    }

    private class OyenteN implements ActionListener{
        
        public void actionPerformed(ActionEvent e) {
                MarcoE m2 = new MarcoE(botonCerrar);
                m2.setVisible(true);

        }    
    }
        
}

class MarcoE extends JFrame{
    
    private static int contador = 0;
    
    public MarcoE(JButton boton1){
        contador++;
        setTitle("Ventana " + contador);
        setBounds(20*contador, 20*contador, 150, 150);
        setResizable(false);
        
        boton1.addActionListener(new cierraT());
        
        
        
    }
    
    private class cierraT implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            dispose();
            contador = 0;
        }
        
        
    }
    
    
}
