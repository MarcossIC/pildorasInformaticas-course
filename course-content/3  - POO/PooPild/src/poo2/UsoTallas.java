
package poo2;

import java.util.Scanner;


public class UsoTallas {
   
   // enum Talla{MINI, MEDIANO, GRANDE, MUY_GRANDE};
   
    enum Talla{
        
        MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
        
        private String abre;
        
        private Talla(String abre){
          this.abre = abre;
        }

        public String getAbre() {
            return abre;
        }
        
        
        
    }
    
    public static void main(String[] args) {

        Scanner ing = new Scanner(System.in);
        
        System.out.println("Escribe una talla: \nMINI \nMEDIANO \nGRANDE \nMUY_GRANDE ");
        System.out.print("Opcion: ");
        String datos = ing.next().toUpperCase();
        
        Talla laTalla = Enum.valueOf(Talla.class, datos);
        
        System.out.println("Talla: " + laTalla);
        System.out.println("Abreviatura: " + laTalla.getAbre());
    }
}
