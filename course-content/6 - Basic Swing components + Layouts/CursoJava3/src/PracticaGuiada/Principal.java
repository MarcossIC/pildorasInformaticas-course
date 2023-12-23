package PracticaGuiada;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextPane;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.text.StyledEditorKit;

public class Principal {
    public static void main(String[] args) {
        ProcesadorT m1 = new ProcesadorT();
        m1.setVisible(true);

    }
}

class ProcesadorT extends JFrame{
    
    public ProcesadorT(){
        setTitle("Procesadro de texto 2");
        setBounds(300, 150, 500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new panelT());
    }
    
}

class panelT extends JPanel{
    private JPanel paneMenu;
    private JTextPane areaT;
    private JMenu fuent, estilos, tama;
    private JMenuBar menuB;
    private JMenuItem menuI; 
    private ButtonGroup grupo1;

    public panelT() {
        //------------------------------------------------------
        grupo1 = new ButtonGroup();
        
        setLayout(new BorderLayout());
        menuB = new JMenuBar();
        paneMenu = new JPanel();
        
        add(paneMenu, BorderLayout.NORTH);
        //------------------------------------------------------
        
        areaT = new JTextPane();
        areaT.setFont(new Font("Arial", Font.PLAIN, 12) {
        });
        add(areaT, BorderLayout.CENTER);
        
        //------------------------------------------------------
        fuent = new JMenu("Fuente");
        
        inItems("Arial", "fuente", "Arial", 9, 1, "") ;
        inItems("Serif", "fuente", "Serif", 9, 1, "") ;
        inItems("Verdana", "fuente", "Verdana", 9, 1, "");
        //------------------------------------------------------
        
        estilos = new JMenu("Estilos");
        inItems("Cursiva", "estilo", "", Font.ITALIC, 1, "src/ComponentesSwing8/copy3.gif") ;
        inItems("Negrita", "estilo", "", Font.BOLD, 1, "src/ComponentesSwing8/copy3.gif") ;
        
        //------------------------------------------------------
        tama = new JMenu("Tamaño");
        inItems("12", "tamaño", "", 9, 12, "") ;
        inItems("16", "tamaño", "", 9, 16, "") ;
        inItems("20", "tamaño", "", 9, 20, "") ;
        inItems("24", "tamaño", "", 9, 24, "") ;
        
        //------------------------------------------------------
       
        menuB.add(fuent);
        menuB.add(estilos);
        menuB.add(tama);
        paneMenu.add(menuB);
    }
 
    public void inItems(String rotulo, String menu, String tipoL, int estilo, int tamaF, String ruta){

       
        switch (menu) {
            case "fuente":
                menuI = new JMenuItem(rotulo);
                fuent.add(menuI);
                menuI.addActionListener(new StyledEditorKit.FontFamilyAction("ModTipoL", tipoL));
                break;
                
            case "estilo":
                menuI = new JCheckBoxMenuItem(rotulo, new ImageIcon(ruta));
                estilos.add(menuI);
                menuI.addActionListener((estilo == 1) ? new StyledEditorKit.BoldAction() : new StyledEditorKit.ItalicAction());
                break;
                
            case "tamaño":
                menuI = new JRadioButtonMenuItem(rotulo);
                grupo1.add(menuI);
                
                tama.add(menuI);
                menuI.addActionListener(new StyledEditorKit.FontSizeAction("ModTam", tamaF) );
                break;
                
            default:
                break;
        }

    }
}