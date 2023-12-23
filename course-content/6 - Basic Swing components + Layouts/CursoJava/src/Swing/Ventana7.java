
package Swing;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Ventana7 {
    public static void main(String[] args) {
        MarcoImagen frame1 = new MarcoImagen();
        
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoImagen extends JFrame{
    
    public MarcoImagen(){
        
        setBounds(750, 300, 500, 500);
        setTitle("Prueba de Imagenen");
        
        Panel5 pane = new Panel5();
        
        add(pane);
    }
    
}

class Panel5 extends JPanel{
    
    private Image imagen1;
    
    public Panel5(){
        
        try {
            imagen1 = ImageIO.read(new File("src/Swing/punto.gif"));
            
        } catch (IOException e) {  
            System.out.println("La imagen no se encuentra en esa ruta");    
        }  
        
    }
    
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        
        g.drawImage(imagen1, 0, 0, null);
        
        int ancho = imagen1.getWidth(this);
        
        int altura = imagen1.getHeight(this);
        
        for(int i = 0; i<500; i++){
            for(int j = 0; j < 500; j++){
                if(i+j > 0){
                g.copyArea(0, 0, ancho, altura, ancho*i, altura*j); 
                }
            }
        }

           
        
    }
    
    
}
