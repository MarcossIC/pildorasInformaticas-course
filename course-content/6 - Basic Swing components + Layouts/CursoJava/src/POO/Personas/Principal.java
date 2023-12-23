
package POO.Personas;

import java.time.LocalTime;
import java.util.Arrays;



public class Principal {
    public static void main(String[] args) {
//CREANDO OBJETOS 
        Empleado[] empleados = new Empleado[4];
        persona[] alumnos = new persona[2];
        
        empleados[0] = new Empleado("Juan", 22000, 2009, 3, 10);
        empleados[1] = new Empleado("Maria", 33500, 2011, 1, 15);
        
        empleados[2] = new Jefe("Paco", 50000, 2006, 8, 14);
        empleados[3] = new Jefe("Leticia", 50000, 2005, 5 , 15);
        
        alumnos[0] = new Alumno("Antonio", LocalTime.of(8, 00), "Informatica");
        alumnos[1] = new Alumno("Carlos", LocalTime.of(10, 0), "Gestion");
        
        
//Metodos y funciones utilizados
        Jefe jefe1 = (Jefe) empleados[2]; 
        Jefe jefe2 = (Jefe) empleados[3]; 

        jefe1.setIncent(5000);
        jefe2.setIncent(5000);         

        for(Empleado e: empleados){
            e.setAumento(5);
        }
        
        Arrays.sort(empleados);
        
//Mostrar datos
        
        System.out.println(jefe1.TomaDecisiones("Dar mas dia de vacaciones a los empleados"));  
        System.out.println(empleados[3].getNom() + " Tiene un bonus de: " + empleados[3].EstableceBonus(800));
        System.out.println(empleados[1].getNom() + " Tiene un bonus de: " + empleados[1].EstableceBonus(500));
        
        System.out.println("");

        int a=1;  
        for(Empleado e: empleados){
            System.out.println("Tabla de la Persona " + a);
            System.out.println(e.getDescripcion());
            System.out.println();
            a++;
        }
        
        for(persona e: alumnos){
            System.out.println("Tabla de Alumnos " + a);
            System.out.println(e.getDescripcion());
            System.out.println();
            a++;
        }
        
    }
}
