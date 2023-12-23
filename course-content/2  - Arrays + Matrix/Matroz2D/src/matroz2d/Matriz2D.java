
package matroz2d;


public class Matriz2D {

    public static void main(String args[]) {
        float matriz[][] = new float[6][6];
        
        int va = 10;
        int vs = 1;
        
        for(int j = 0; j < 6; j++){
            matriz[1][j] = 10000;
        }
        
        for(int j = 0; j < 6; j++){
            matriz[0][j] = va;
            va++;
        }
        
        for(int i = 2; i < 6; i++){
            float acu = (float) 0.10;

            for(int j = 0; j < 6; j++){
                matriz[i][j] = matriz[vs][j] + (matriz[vs][j] * acu);
                acu += 0.01;
            }
            vs++;
        }
        
        for(int j = 0; j < 6; j++){
            System.out.print("[    " + matriz[0][j] + "     ]");
        }
        System.out.println("");
        for(int i = 1; i < 6; i++){
            for(int j = 0; j < 6; j++){
                System.out.print(" [   " + matriz[i][j] + "  ]");
            }
            System.out.println("");
        }
        
    } 
}