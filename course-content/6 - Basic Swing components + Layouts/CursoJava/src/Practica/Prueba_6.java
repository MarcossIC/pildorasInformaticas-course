
package Practica;


public class Prueba_6 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][5];
        int cantidad = 0;
        for(int i=0; i<4;i++){
            cantidad++;
            for(int h=0; h<5;h++){
                cantidad++;
                matriz[i][h] = cantidad;
            }
        }
        
        for(int i=0; i<4;i++){
            System.out.println();
            for(int h=0; h<5;h++){
                System.out.print("[ " + matriz[i][h] + " ]" + " ");
            }
            
        }
    }
}
