
package componenteSwing9;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.text.StyledEditorKit;


public class Principal2 {
    public static void main(String[] args) {
        Marco1 m1 = new Marco1();
        m1.setVisible(true);
        
    }
}

class Marco1 extends JFrame{

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Marco1(){

        setSize(550, 400);
        setLocationRelativeTo(null);
        setTitle("Prueba");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        add(new Panel2());
    }

}

class Panel2 extends JPanel{
    
    private static final String URL = "src/componenteSwing9/";
    
    private JPanel paneMenu;
    private JTextPane areaT;
    private JMenu fuent, estilos, tama;
    private JMenuBar menuB;
    private JMenuItem menuI; 
    private ButtonGroup grupo1;
    private JToolBar bar;
    
    public Panel2(){
        setLayout(new BorderLayout());
        
        grupo1 = new ButtonGroup();
        menuB = new JMenuBar();
        paneMenu = new JPanel();
        
        paneMenu.setLayout(new FlowLayout());
        
        add(paneMenu, BorderLayout.NORTH);
        
        areaT = new JTextPane();
        areaT.setFont(new Font("Arial", Font.PLAIN, 12));
        add(areaT, BorderLayout.CENTER);

        iniciarMenu();
        iniPoP();
        iniciarBarra();
        
    }
    

    private void inItems(String rotulo, String menu, String tipoL, int estilo, int tamaF, String ruta){

        switch (menu) {
            case "fuente":
                menuI = new JMenuItem(rotulo);
                fuent.add(menuI);
                menuI.addActionListener(new StyledEditorKit.FontFamilyAction("ModTipoL", tipoL));
                break;
                
            case "estilo":
                menuI = new JMenuItem(rotulo, new ImageIcon(ruta));      
                estilos.add(menuI);
                menuI.addActionListener((estilo == 1) ? new StyledEditorKit.BoldAction() : new StyledEditorKit.ItalicAction());
                
                switch(rotulo){
                    case "Negrita":  menuI.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
                    break;
                    
                    case "Cursiva": menuI.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_DOWN_MASK));
                    break;
                }
                break;
                
            case "tamaño":
                menuI = new JRadioButtonMenuItem(rotulo);
                grupo1.add(menuI); 
                tama.add(menuI);
                menuI.addActionListener(new StyledEditorKit.FontSizeAction("ModTam", tamaF) );
                break;
        }
    }
    
    private JButton iniBotones(String ruta){
        return (JButton) bar.add(new JButton(new ImageIcon(ruta)));
    }
    
    
    private void iniPoP(){
        JPopupMenu emerg = new JPopupMenu();
       
        JMenuItem negrita = new JMenuItem("Negrita");
        JMenuItem cursiva = new JMenuItem("cursiva");
        
        negrita.addActionListener(new StyledEditorKit.BoldAction());
        cursiva.addActionListener(new StyledEditorKit.ItalicAction());
        
        emerg.add(negrita);
        emerg.add(cursiva);

        areaT.setComponentPopupMenu(emerg);
    }
    
    private void iniciarMenu(){
        fuent = new JMenu("Fuente");
        
        inItems("Arial", "fuente", "Arial", 9, 1, "") ;
        inItems("Serif", "fuente", "Serif", 9, 1, "") ;
        inItems("Verdana", "fuente", "Verdana", 9, 1, "");
        //------------------------------------------------------
        
        estilos = new JMenu("Estilos");
        inItems("Cursiva", "estilo", "", Font.ITALIC, 1, URL+"copy3.gif") ;
        inItems("Negrita", "estilo", "", Font.BOLD, 1, URL+"copy3.gif") ;
        
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
    
    private void iniciarBarra(){
        bar = new JToolBar();
        
        iniBotones(URL+"Cursiva.gif").addActionListener(new StyledEditorKit.ItalicAction());
        iniBotones(URL+"Negrita.gif").addActionListener(new StyledEditorKit.BoldAction());
        iniBotones(URL+"Subrayado.gif").addActionListener(new StyledEditorKit.UnderlineAction());
        bar.addSeparator();
        
        iniBotones(URL+"Rojo.gif").addActionListener(new StyledEditorKit.ForegroundAction("PonRojo", Color.RED));
        iniBotones(URL+"Azul.gif").addActionListener(new StyledEditorKit.ForegroundAction("PonAzul", Color.BLUE));
        iniBotones(URL+"Amarillo.gif").addActionListener(new StyledEditorKit.ForegroundAction("PonAmarillo", Color.YELLOW));
        iniBotones(URL+"Negro.gif").addActionListener(new StyledEditorKit.ForegroundAction("PonAzul", Color.BLACK));
        bar.addSeparator();
        
        iniBotones(URL+"Izquierda.gif").addActionListener(new StyledEditorKit.AlignmentAction("AliniarIzq", 0));
        iniBotones(URL+"Centrada.gif").addActionListener(new StyledEditorKit.AlignmentAction("AlinearCent", 1));
        iniBotones(URL+"Derecha.gif").addActionListener(new StyledEditorKit.AlignmentAction("AlinearDere", 2));
        iniBotones(URL+"Justificada.gif").addActionListener(new StyledEditorKit.AlignmentAction("AlinearJust", 3));
        bar.setOrientation(1);
        
        add(bar, BorderLayout.WEST);     
    }
}