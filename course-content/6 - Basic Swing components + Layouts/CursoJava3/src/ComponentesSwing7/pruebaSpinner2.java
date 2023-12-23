package ComponentesSwing7;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

public class pruebaSpinner2 {
    public static void main(String[] args) {
        Marco2 m1 = new Marco2();
        m1.setVisible(true);
    }
}

class Marco2 extends JFrame{
    public Marco2(){
        setTitle("Prueba spiner");
        setBounds(300, 150, 500, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        add(new Panel2());
    }
    
}

class Panel2 extends JPanel{
    
    public Panel2(){
        
        //String lista[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        
        JSpinner control1 = new JSpinner(new SpinnerNumberModel(5, 0, 10,1 ){
            
            public Object getNextValue(){
            return super.getPreviousValue() ;
            }
        
            public Object getPreviousValue(){
            return super.getNextValue() ;
            } 
        });
        
        control1.setPreferredSize(new Dimension(40, 20));
       
        add(control1);
        
    }
    
    /*
    private class ModelSpin extends SpinnerNumberModel{
        
        public ModelSpin(){
            super(5, 0, 10, 1);
            
            
        }
        
        public Object getNextValue(){
            
            return super.getPreviousValue() ;
        }
        
        public Object getPreviousValue(){
            
            return super.getNextValue() ;
        }
        
        
    }
    */
    
}