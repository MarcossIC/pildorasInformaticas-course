
package layutsAvanzado;

import java.awt.BorderLayout;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class DispocicionBox {


    public static void main(String[] args) {
        Marco m1 = new Marco();
        
        m1.setVisible(true);
        m1.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}

class Marco extends JFrame{
    
    public Marco(){
        setTitle("Prueba Layout");
        setBounds(400, 350, 250, 250);
        
        JLabel rotulo1 = new JLabel("Nombre");
        JTextField text1 = new JTextField(10);
        text1.setMaximumSize(text1.getPreferredSize());
        
        Box cajaH1 =  Box.createHorizontalBox();
        cajaH1.add(rotulo1);
        cajaH1.add(Box.createHorizontalStrut(10));
        cajaH1.add(text1);
        
        JLabel rotulo2 = new JLabel("Contraseña");
        
        JTextField text2 = new JTextField(10);
        text2.setMaximumSize(text1.getPreferredSize());
        
        Box cajaH2 =  Box.createHorizontalBox();
        cajaH2.add(rotulo2);
        cajaH2.add(Box.createHorizontalStrut(10));
        cajaH2.add(text2);
        
        JButton boton1 = new JButton("Ok");
        JButton boton2 = new JButton("Cancelar");
        
        Box cajaH3 =  Box.createHorizontalBox();
        cajaH3.add(boton1);
        cajaH3.add(Box.createGlue());
        cajaH3.add(boton2);
        
        Box cajaVert = Box.createVerticalBox();
        
        cajaVert.add(cajaH1);
        cajaVert.add(cajaH2);
        cajaVert.add(cajaH3);
        
        add(cajaVert);
        
    }
    
}
