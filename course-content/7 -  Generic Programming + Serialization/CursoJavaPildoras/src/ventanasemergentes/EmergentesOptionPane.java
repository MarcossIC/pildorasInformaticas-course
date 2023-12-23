package ventanasemergentes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class EmergentesOptionPane {

    public static void main(String[] args) {
        CuadroDialogo marco = new CuadroDialogo();
        marco.run();
    }
}

class CuadroDialogo extends JFrame {

    public CuadroDialogo() {
        iniComponent();
    }

    private void iniComponent() {
        setBounds(500, 300, 400, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new PanelCuadroDialogo());
    }

    public void run() {
        setVisible(true);
    }

}

class PanelCuadroDialogo extends JPanel {

    private JButton boton1, boton2, boton3, boton4;

    public PanelCuadroDialogo() {
        iniBotones();
    }
    
    private void iniBotones(){
        boton1 = new JButton("boton 1");
        boton2 = new JButton("boton 2");
        boton3 = new JButton("boton 3");
        boton4 = new JButton("boton 4");

        boton1.addActionListener(new AccionBotones());
        boton2.addActionListener(new AccionBotones());
        boton3.addActionListener(new AccionBotones());
        boton4.addActionListener(new AccionBotones());

        add(boton1);
        add(boton2);
        add(boton3);
        add(boton4);
    }

    private class AccionBotones implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(e.getSource() == boton1){
//                JOptionPane.showMessageDialog(PanelCuadroDialogo.this, "Mensaje Prueba");
                JOptionPane.showMessageDialog(PanelCuadroDialogo.this, "Mensaje 2", "Tu mama", 2);
                
            } else if(e.getSource() == boton2){
                System.out.println("Haz pulsado el boton 2");
                
            } else if(e.getSource() == boton3){
                System.out.println("Haz pulsado el boton 3");
                
            } else if(e.getSource() == boton4){
                System.out.println("Haz pulsado el boton 4");
                
            }
            
            
        }

    }

}
