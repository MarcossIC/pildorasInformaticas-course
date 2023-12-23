
package EventosWindows;

import javax.swing.JFrame;


public class Principal {
    public static void main(String[] args) {
        Marco m1 = new Marco();
        m1.setBounds(100, 100, 500, 500);
        m1.setTitle("Marco 1");
        m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Marco m2 = new Marco();
        m2.setBounds(700, 100, 500, 500);
        m2.setTitle("Marco 2");
        m2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        
        System.out.println(" 41238 ");

    }
}
