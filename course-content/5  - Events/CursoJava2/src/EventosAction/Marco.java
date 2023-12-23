
package EventosAction;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.text.StyleConstants;


public class Marco extends JFrame{
    
    private JButton boton1;
    
    public Marco(){
        setSize(500, 500);
        setTitle("Probando mi primer evento");
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        panel pn1 = new panel();
        add(pn1);

    }
}

class panel extends JPanel{
    private JButton boton1, boton2, boton3;
    
    public panel(){    
        boton1 = new JButton("Rojo");
        add(boton1);
        
        boton2 = new JButton("Azul");
        add(boton2);

        boton3 = new JButton("Amarillo");
        add(boton3);
        
        ColorF Rojo = new ColorF(Color.RED);
        ColorF Azul = new ColorF(Color.BLUE);
        ColorF Amarilo = new ColorF(Color.YELLOW);
        
        boton1.addActionListener(Rojo);
        boton2.addActionListener(Azul);
        boton3.addActionListener(Amarilo);
        
    }
    
    private class ColorF implements ActionListener{
    
        private Color ClF;
    
        public ColorF(Color c){
        
        ClF = c;
    }
    
        @Override
    public void actionPerformed(ActionEvent e){
            
        setBackground(ClF);

    }
    
    }  

}


