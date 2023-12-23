
package ComponentesSwing8;

import java.awt.BorderLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;


public class pruebaMenus {
    public static void main(String[] args) {
        Marco1 m1 = new Marco1();
        m1.setVisible(true);
    }
}

class  Marco1 extends JFrame{

    public Marco1()  {
        
        setTitle("Prueba Menus");
        setBounds(300, 150, 500, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        add(new Panel1());
    }

}

class Panel1 extends JPanel{


    public Panel1() {
        JMenuBar menuB = new JMenuBar();
        
        setLayout(new BorderLayout());
        
        JPanel panel2 = new JPanel();
        add(panel2, BorderLayout.NORTH);
        
//----------------------------------------------------------------       
        JTextPane areaT = new JTextPane();

        areaT.getAutoscrolls();
        add(areaT, BorderLayout.CENTER);


//----------------------------------------------------------------   
        JMenu archivo = new JMenu("Archivo");
        JMenu edicion = new JMenu("Edicion");
        JMenu herramienta = new JMenu("Herramientas");
        JMenu opciones = new JMenu("Opciones");
//----------------------------------------------------------------   

        JMenuItem guardar = new JMenuItem("Guardar");
        JMenuItem guardarC = new JMenuItem("Guardar Como");
        archivo.add(guardar);
        archivo.add(guardarC);
//----------------------------------------------------------------   

        JMenuItem copiar = new JMenuItem("copiar", new ImageIcon("src/ComponentesSwing8/copy3.gif") );
        JMenuItem pegar = new JMenuItem("pegar", new ImageIcon("src/ComponentesSwing8/paste3.gif") );
        JMenuItem cortar = new JMenuItem("cortar", new ImageIcon("src/ComponentesSwing8/cut3.gif") );
        
        copiar.setHorizontalTextPosition(SwingConstants.LEFT);
        
        edicion.add(copiar);
        edicion.add(pegar);
        edicion.add(cortar);
        edicion.addSeparator();
        edicion.add(opciones);
//----------------------------------------------------------------   

        JMenuItem general = new JMenuItem("Generales");
        herramienta.add(general);
        
        JMenuItem opcion1 = new JMenuItem("Opcion 1");
        JMenuItem opcion2 = new JMenuItem("Opcion 2");
        opciones.add(opcion1);
        opciones.add(opcion2);
//----------------------------------------------------------------   

        menuB.add(archivo);
        menuB.add(edicion);
        menuB.add(herramienta);
        
        panel2.add(menuB);
        
        
    }
    
    
}