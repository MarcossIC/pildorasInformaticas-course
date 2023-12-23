
package ejerciopractico1;

import javax.swing.*;

public class LaminaBoton extends JPanel{
    
    private ButtonGroup grupo;
    
    public LaminaBoton(String titulo, String[]opciones){
        run(titulo, opciones);
        
    }
    
    private void run(String titulo, String[]opciones){  
        setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), titulo));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        grupo = new ButtonGroup();
        
        for (int i = 0; i < opciones.length; i++) {
            JRadioButton bot = new JRadioButton(opciones[i]);
            bot.setActionCommand(opciones[i]);
            add(bot);
            grupo.add(bot); 
            bot.setSelected(i == 0);
        }
        
    }
    
    public String devuelveSeleccion(){    
        
        return grupo.getSelection().getActionCommand();
    }

}
