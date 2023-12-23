package ejerciopractico1;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Rectangle2D;
import java.util.Date;
import javax.swing.*;

public class Marco extends JFrame {

    private JPanel panelGrid;
    private LaminaBoton laminaTipo, laminaTipoMensaje, laminaMensaje, laminaConfirmar, laminaOpcion, laminaEntrada;

    private static final String  URL= "src/ejerciopractico1/images/";
    
    private String cadena = "Mensaje";
    private Icon icono = new ImageIcon(URL+"Negro.gif");
    private Object fecha = new Date();
    private Component componente = new laminaEjemplo();

    public Marco() {
        iniMarco();
    }

    //--------------------INICIO TODO ---------------------------------------
    private void iniMarco() {
        setTitle("Ejercicio Practico");
        setBounds(400, 200, 600, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        //--------------------------------------------------------
        panelGrid = new JPanel();
        panelGrid.setLayout(new GridLayout(2, 3));

        iniBox();

        add(panelGrid, BorderLayout.CENTER);
        //--------------------------------------------------------

        iniBoton();
    }

    //------------------------------------CREO LAS CAJAS-------------------------------------
    private void iniBox() {
        this.laminaTipo = new LaminaBoton("Tipo", new String[]{
            "Mensaje",
            "Confirmar",
            "Opcion",
            "Entrada"
        });
        this.laminaTipoMensaje = new LaminaBoton("Tipo de Mensaje", new String[]{
            "ERROR_MESSAGE",
            "INFORMATION_MESSAGE",
            "WARNING_MESSAGE",
            "QUESTION_MESSAGE",
            "PLAIN_MESSAGE"
        });
        this.laminaMensaje = new LaminaBoton("Mensaje", new String[]{
            "Cadena",
            "Icono",
            "Componente",
            "Otros",
            "Object[]"
        });

        this.laminaConfirmar = new LaminaBoton("Confirmar", new String[]{
            "DEFAULT_OPTION",
            "YES_NO_OPTION",
            "YES_NO_CANCEL_OPTION",
            "OK_CANCEL_OPTION"
        });
        this.laminaOpcion = new LaminaBoton("Opcion", new String[]{
            "String[]",
            "Icon[]",
            "Object[]"
        });
        this.laminaEntrada = new LaminaBoton("Entrada", new String[]{
            "Campo de texto",
            "Combo"
        });

        this.panelGrid.add(laminaTipo);
        this.panelGrid.add(laminaTipoMensaje);
        this.panelGrid.add(laminaMensaje);
        this.panelGrid.add(laminaConfirmar);
        this.panelGrid.add(laminaOpcion);
        this.panelGrid.add(laminaEntrada);
    }

    //-------------------------------CREA EL BOTON Y LE DA FUNCIONALIDAD------------------------------------------------
    public void iniBoton() {
        JPanel panelMostrar = new JPanel();
        JButton botonMostrar = new JButton("Mostrar");
        botonMostrar.addActionListener((ActionEvent e) -> {
            switch (laminaTipo.devuelveSeleccion()) {
                case "Mensaje" -> {
                    JOptionPane.showMessageDialog(Marco.this, setMensaje(), "Titulo", setTypeMensaje());
                }
                case "Confirmar" -> {

                    JOptionPane.showConfirmDialog(Marco.this, setMensaje(), "Titulo", setOptioType(), setTypeMensaje());
                }
                case "Opcion" -> {
                    JOptionPane.showOptionDialog(Marco.this, setMensaje(), "Titulo", setOptioType(), setTypeMensaje(), null, setOptions(), setOptions()[0]);
                }
                case "Entrada" -> {
                    switch(laminaEntrada.devuelveSeleccion()){
                        case "Campo de texto" ->{
                            JOptionPane.showInputDialog(Marco.this, setMensaje(), "Titulo", setTypeMensaje());
                        }
                        case "Combo" ->{
                            JOptionPane.showInputDialog(Marco.this, setMensaje(), "Titulo", setTypeMensaje(), null, new String[]{"Amarillo", "Azul", "Negro", "Rojo"}, "Azul");
                        }
                    }
                }
                
            }
        });

        panelMostrar.add(botonMostrar);
        add(panelMostrar, BorderLayout.SOUTH);
    }

    //-------------------------------------------------------------------------------
    private Object setMensaje() {
        switch (laminaMensaje.devuelveSeleccion()) {
            case "Cadena" -> {
                return "Cadena";
            }
            case "Icono" -> {
                return icono;
            }
            case "Componente" -> {
                return componente;
            }
            case "Otros" -> {
                return fecha;
            }
            case "Object[]" -> {
                Object objeto[] = {"Cadena", icono, componente, fecha};
                return objeto;
            }
        }
        return null;
    }

    private int setOptioType() {
        switch (laminaConfirmar.devuelveSeleccion()) {
            case "DEFAULT_OPTION" -> {
                return JOptionPane.DEFAULT_OPTION;
            }
            case "YES_NO_OPTION" -> {
                return JOptionPane.YES_NO_OPTION;
            }
            case "YES_NO_CANCEL_OPTION" -> {
                return JOptionPane.YES_NO_CANCEL_OPTION;
            }
            case "OK_CANCEL_OPTION" -> {
                return JOptionPane.OK_CANCEL_OPTION;
            }
            default -> {
                return -1;
            }
        }
    }

    private int setTypeMensaje() {
        switch (laminaTipoMensaje.devuelveSeleccion()) {
            case "ERROR_MESSAGE" -> {
                return JOptionPane.ERROR_MESSAGE;
            }
            case "INFORMATION_MESSAGE" -> {
                return JOptionPane.INFORMATION_MESSAGE;
            }
            case "WARNING_MESSAGE" -> {
                return JOptionPane.WARNING_MESSAGE;
            }
            case "QUESTION_MESSAGE" -> {
                return JOptionPane.QUESTION_MESSAGE;
            }
            case "PLAIN_MESSAGE" -> {
                return JOptionPane.PLAIN_MESSAGE;
            }
            default -> {
                return -2;
            }
        }
    }
    
    private Object[] setOptions(){  
        switch(laminaOpcion.devuelveSeleccion()){
            case "String[]" ->{             
                return new String[]{"Amarillo", "Azul", "Negro", "Rojo"};
            }
            case "Icon[]" ->{
                return  (Object[]) new ImageIcon[]{
                    new ImageIcon(URL+"Amarillo.gif"), 
                    new ImageIcon(URL+"Azul.gif"),
                    new ImageIcon(URL+"Negro.gif"),
                    new ImageIcon(URL+"Rojo.gif")};
            }
            case "Object[]" ->{       
                return new Object[]{"Cadena", icono, componente, fecha };
            }
            
            default ->{
                return null;
            }
        }
    } 

    //-------------------------------------------------------------------------------
    public void run() {
        setVisible(true);
    }
}

class laminaEjemplo extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        Rectangle2D rectangulo = new Rectangle2D.Double(0, 0, getWidth(), getHeight());

        g2d.setPaint(Color.YELLOW);

        g2d.fill(rectangulo);
    }
}