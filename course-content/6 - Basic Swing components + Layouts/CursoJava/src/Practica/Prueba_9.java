
package Practica;

import java.util.Scanner;


public class Prueba_9 {
    
    // enum Talla { MINI, MEDIANO, GRANDE, MUY_GRANDE  };
    
    enum Talla {
        
        MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
    
        private String abreviatura;
        
        private Talla(String abreviatura){
            
            this.abreviatura = abreviatura;
        }

        public String getAbreviatura() {
            return abreviatura;
        }
   
    }
      
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Opciones de talle: \n- MINI \n- MEDIANO \n- GRANDE \n- MUY_GRANDE");
        System.out.print("Escribe una talla: ");
        String entradaD = entrada.next().toUpperCase();
        
        Talla talle1 = Enum.valueOf(Talla.class, entradaD);
        
        System.out.println("");
        System.out.println("TALLA: " + talle1);
        System.out.println("Abreviatura: " + talle1.getAbreviatura());
                

    }
}
