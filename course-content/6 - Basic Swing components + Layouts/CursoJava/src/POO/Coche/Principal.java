
package POO.Coche;

import javax.swing.JOptionPane;


public class Principal {
    public static void main(String[] args) {
        
        coche coche1 = new coche();
        furgoneta furgoneta1 = new furgoneta(10, 7);
        
        furgoneta1.setColor("azul");
        furgoneta1.setAscientos("Si");
        furgoneta1.setAcondicionador("si");
        
        coche1.setAcondicionador("no");
        coche1.setColor("rojo");
        coche1.setAscientos("si");
        
        System.out.println("Caracteristicas del coche");
        System.out.println(" " + coche1.getGeneral());
        System.out.println(" " + coche1.getColor());  
        System.out.println(" " + coche1.getAsientos());
        System.out.println(" " + coche1.getClimatizador());
        System.out.println(" " + coche1.getPesoTotal());
        System.out.println(" " + coche1.getPrecio());
        
        System.out.println("");

        System.out.println("Caracteristicas de la furgoneta");
        System.out.println(" " + furgoneta1.getGeneral());
        System.out.println(" " + furgoneta1.getColor());  
        System.out.println(" " + furgoneta1.getAsientos());
        System.out.println(" " + furgoneta1.getClimatizador());
        System.out.println(" " + furgoneta1.getPesoTotal());
        System.out.println(" " + furgoneta1.getDatos());
        System.out.println(" " + furgoneta1.getPrecio());
        
    }
}
