
package componenteSwing9;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JToolBar;



public class Principal1 {
    public static void main(String[] args) {
        MarcoA m1 = new MarcoA();
        m1.setVisible(true);
        m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       
    }
}

class  MarcoA extends JFrame{
    
    private JPanel panel;
    
    public MarcoA(){
        setTitle("Prueba de Multiples fuentes");
        setBounds(300, 175, 600, 300);
        
        panel = new JPanel();
        
        add(panel);
        
        AccionC acAmarilo = new AccionC("Amarillo", new ImageIcon("src/componenteSwing9/Amarillo.png"), new Color(255, 244, 63));
         
        AccionC acAzul = new AccionC("Azul", new ImageIcon("src/componenteSwing9/Azul.png"), new Color(18, 72, 178));
        
        AccionC acRojo = new AccionC("Rojo", new ImageIcon("src/componenteSwing9/Rojo.png"), new Color(246, 47, 1));
       
        //-----------------------------------
        JMenu menu1 = new JMenu("Color");
        
        menu1.add(acAmarilo);
        menu1.add(acAzul);
        menu1.add(acRojo);
        
        JMenuBar menuB = new JMenuBar();
        
        menuB.add(menu1);
        
        setJMenuBar(menuB);
        //------------------------------------
         
        JToolBar tolB = new JToolBar();
        
        tolB.add(acAmarilo);
        tolB.add(acAzul);
        tolB.add(acRojo);
        
        add(tolB, BorderLayout.NORTH);
        

    }
    
    private class AccionC extends AbstractAction{
    
        public AccionC(String nombre, Icon icono, Color colorB){
        
            putValue(Action.NAME , nombre);
            putValue(Action.SMALL_ICON, icono);
            putValue(Action.SHORT_DESCRIPTION, "Poner el panel de color: " + nombre);
            putValue("colorF", colorB);  
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Color c = (Color) getValue("colorF");
        
            panel.setBackground(c);
        }
    
    }       
}