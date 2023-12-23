
package juegonumale;

import java.util.Scanner;


public class JuegoNumAle {

    public static void main(String[] args) {
        Scanner ing = new Scanner(System.in);
        int numA, numT = 0;
        numA = (int) (Math.random()*100);
        
        System.out.println("Este es un juego en el que tendras que adivinar el numero aleatorio");
        System.out.println("");
        do{
            System.out.print("Adivina el numero aleatorio: ");
            numT = ing.nextInt();
        
            if(numA < numT){
                System.out.println("El numero es menor");
                System.out.println("Vuelve a intentarlo");
            } 
            if(numA > numT){
                System.out.println("El numero es mayor");
                System.out.println("Vuelve a intentarlo");
            }
            if(numA == numT){
                System.out.println("Has acertado, felicidades");
            }
            
        }while(numT != numA);

        System.out.println("");
        System.out.println("Fin del programa");
    }
    
}
