
package Practica;


public class Prueba_7 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][5];
        
        for(int i=0; i<4;i++){
            for(int h=0; h<5;h++){
                
                matriz[i][h] = (int)(Math.random()*100);
            }
        }
        
        for(int[]z:matriz){
            System.out.println();
            
            for(int x: z){
                System.out.print("[ " + x + " ]" + " ");
            }           
        }
        
    }
}
