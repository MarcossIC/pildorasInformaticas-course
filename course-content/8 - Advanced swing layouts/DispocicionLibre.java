
package layutsAvanzado;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class DispocicionLibre {
    public static void main(String[] args) {
        Marco3 m1 = new Marco3();
        m1.setVisible(true);
        
        
    }
}

class Marco3 extends JFrame{
    
    public Marco3(){
        setTitle("Dispocicion Libre");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        add(new Panel3());
    }
}

class Panel3 extends JPanel{
    
    public Panel3(){
        setLayout(new Columnas());
        
        JLabel nombre = new JLabel("Nombre:");
        //nombre.setBounds(70, 70, 75, 10);
        
        JLabel apellido = new JLabel("Apellido:");
        //apellido.setBounds(70, 100, 75, 15);
        
        JTextField cNombre = new JTextField();
        //cNombre.setBounds(150, 69, 100, 20);
        
        JTextField cApellido = new JTextField();
        //cApellido.setBounds(150, 99, 100, 20);
        
        add(nombre);
        add(cNombre);
        
        add(apellido); 
        add(cApellido);
        
    }
    
}

class Columnas implements LayoutManager{
    
    private int x= 20;
    private int y =20;

    @Override
    public void addLayoutComponent(String name, Component comp) {}

    @Override
    public void removeLayoutComponent(Component comp) { }

    @Override
    public Dimension preferredLayoutSize(Container parent) {
        return null;
       
    }

    @Override
    public Dimension minimumLayoutSize(Container parent) {
        return null;   
    }

    @Override
    public void layoutContainer(Container contenedor) {
        int contador = 0;
        int n = contenedor.getComponentCount();
        
        for (int i = 0; i < n; i++) {
            contador++;
            
            Component c = contenedor.getComponent(i);
            
            c.setBounds(x, y, 100, 20);
            

            x+= 100;
            if(contador%2 == 0){
                x=20;
                y+=40;
            }
        }
        
    }
    
    
}