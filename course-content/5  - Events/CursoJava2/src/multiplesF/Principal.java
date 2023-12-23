
package multiplesF;

import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;


public class Principal {
    public static void main(String[] args) {
        MarcoA m1 = new MarcoA();
        m1.setVisible(true);
        m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}

class  MarcoA extends JFrame{
    
    public MarcoA(){
        setTitle("Prueba de Multiples fuentes");
        setBounds(300, 175, 600, 300);
        
        add(new PanelA());
    }
}

class PanelA extends JPanel{
    
    
    public PanelA(){
        
        AccionC acAmarilo = new AccionC("Amarillo", new ImageIcon("src/multiplesF/Amarillo.png"), new Color(255, 244, 63));
        add(new JButton(acAmarilo));
        
        AccionC acAzul = new AccionC("Azul", new ImageIcon("src/multiplesF/Azul.png"), new Color(18, 72, 178));
        add(new JButton(acAzul));
        
        AccionC acRojo = new AccionC("Rojo", new ImageIcon("src/multiplesF/Rojo.png"), new Color(246, 47, 1));
        add(new JButton(acRojo));
            
        
        InputMap mEntrada = getInputMap(JComponent.WHEN_FOCUSED);
        ActionMap mAccioN = getActionMap();
        
        mEntrada.put(KeyStroke.getKeyStroke("ctrl A"), "fondoAmarillo");
        mAccioN.put("fondoAmarillo", acAmarilo);
        
        mEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "fondoAzul");
        mAccioN.put("fondoAzul", acAzul);
        
        mEntrada.put(KeyStroke.getKeyStroke("ctrl R"), "fondoRojo");
        mAccioN.put("fondoRojo", acRojo);
        
    }
    
    private class AccionC extends AbstractAction{
    
        public AccionC(String nombre, Icon icono, Color colorB){
        
            putValue(Action.NAME , nombre);
            putValue(Action.SMALL_ICON, icono);
            putValue(Action.SHORT_DESCRIPTION, "Poner el panel de color: " + nombre);
            putValue("colorF", colorB);  
        }

        public void actionPerformed(ActionEvent e) {
            Color c = (Color) getValue("colorF");
        
            setBackground(c);
        }
    
    }       
}
