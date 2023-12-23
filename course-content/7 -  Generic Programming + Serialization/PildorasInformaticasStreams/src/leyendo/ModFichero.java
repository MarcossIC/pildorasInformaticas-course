
package leyendo;

import java.io.*;



public class ModFichero {
    
     private int arrDatos[] = new int[6264];
    
    //Leyendo Y Escribiendo flujo de caracteres
    public void leerCaracter(){
        try {
            FileReader fr = new FileReader("C:/Users/Marcos/Desktop/ejemplo.txt");
            BufferedReader entrada = new BufferedReader(fr);
            String linea = entrada.readLine(); 
            
            
            while(linea != null){    
                System.out.println(linea);  
                linea =entrada.readLine(); 
            }
            
            entrada.close();
            fr.close();
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
            System.out.println("\nNo se ha encontrado el archivo");
        }
    }
    
    public void escribirCaracter(){
        var frase = "Esto es una prueba de escritura2";
        
        try {
            FileWriter escritura = new FileWriter("C:/Users/Marcos/Desktop/texto.txt", true);
            
            escritura.close();
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    //Leyendo Y Escribiendo flujo de bytes
    
    public void leerBytes(){ 
        int c = 0;
         try {
            FileInputStream acceder = new FileInputStream("C:/Users/Marcos/Pictures/Saved Pictures/dedo.jpg"); 
            boolean finalAr = false;
            
            while(!finalAr){
                if(arrDatos[c] != -1){
                   arrDatos[c] = acceder.read(); 
                }        
                if(arrDatos[c] == -1){
                    finalAr = true;
                }
                
                System.out.println(arrDatos[c]);
                ++c;
                
            }
            acceder.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
             ex.printStackTrace(System.out);
        } 
          
    }
    
    public void escribirBytes(){
        File archivo = new File("C:/Users/Marcos/Pictures/Saved Pictures/dedoCopia.jpg");
        try {
            FileOutputStream flOut = new FileOutputStream(archivo);
            for (int arr : arrDatos) {
                flOut.write(arr);
            }
            flOut.close();
           
        } catch (FileNotFoundException ex) {
             ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
         }
    }
    
    
}
