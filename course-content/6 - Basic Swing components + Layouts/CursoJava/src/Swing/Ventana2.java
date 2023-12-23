
package Swing;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Ventana2 {
    public static void main(String[] args) {
         VentCentrada vent1 = new VentCentrada();
         
         vent1.setVisible(true);
         vent1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}

class VentCentrada extends JFrame{
    public JPanel panel;
    
    public VentCentrada(){ 
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        
        Dimension TamñoP = pantalla.getScreenSize();
        int anchoP =  TamñoP.width;
        int altoP = TamñoP.height;        
        setBounds(anchoP/4, altoP/4, anchoP/2, altoP/2);
        setTitle("Venta prueba 2");
        
        Image icon = pantalla.getImage("src/graficos/icon.png");      
        setIconImage(icon);
        
        //setIconImage(new ImageIcon(getClass().getResource("icon.png")).getImage());     
    }
}