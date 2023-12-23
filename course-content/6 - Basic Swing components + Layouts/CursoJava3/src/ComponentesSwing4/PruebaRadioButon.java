
package ComponentesSwing4;

import java.awt.Button;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class PruebaRadioButon {
    public static void main(String[] args) {
        Marco m1 = new Marco();
        m1.setVisible(true);
    }
}

class Marco extends JFrame{
    
    public Marco(){
        setTitle("Prueba Radio Boton");
        setBounds(300, 150, 500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        
        
        add(new Panel1());
    }
}

class  Panel1 extends JPanel{
    
    public Panel1(){
        ButtonGroup grupo1 = new ButtonGroup();
        ButtonGroup grupo2 = new ButtonGroup();
        
        JRadioButton botonR1 = new JRadioButton("Azul", false);
        JRadioButton botonR2 = new JRadioButton("Rojo", true);
        JRadioButton botonR3 = new JRadioButton("Verde", false);
        
        JRadioButton botonR4 = new JRadioButton("Masculino", false);
        JRadioButton botonR5 = new JRadioButton("Femenino", false);
        
        grupo1.add(botonR1);
        grupo1.add(botonR2);
        grupo1.add(botonR3);
        
        grupo2.add(botonR4);
        grupo2.add(botonR5);
        
        add(botonR1);
        add(botonR2);
        add(botonR3);
        
        add(botonR4);
        add(botonR5);
        
        
    }
}
