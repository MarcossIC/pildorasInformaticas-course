
package test;

import clasespropias.Pareja;


public class UsoPareja {
    public static void main(String[] args) {
        Pareja<String> pareja1 = new Pareja<>();
        
        pareja1.setPrimero("Primer objeto de clase generica");
        
        System.out.println(pareja1.getPrimero());
        
        Persona pers1 = new Persona("Ana");
        
        Pareja<Persona> parejaDos = new Pareja<>();
        
        parejaDos.setPrimero(pers1);
        
        System.out.println(parejaDos.getPrimero());
    }
}

class Persona{
    
    private String nombre;
    
    public Persona(String nombre){
        this.nombre = nombre;
    }
}
