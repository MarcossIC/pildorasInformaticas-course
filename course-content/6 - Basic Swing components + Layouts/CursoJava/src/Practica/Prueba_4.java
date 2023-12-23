
package Practica;


public class Prueba_4 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int num = 0;
        for(int i=0; i<10;i++){
            num+=+3;
            array[i] = num;
        }
        for(int i=0; i<10;i++){
            System.out.println("Poscicion "+ (i+1) +": "+ array[i]);
        }

    }
}
