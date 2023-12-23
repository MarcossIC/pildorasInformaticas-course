
package poopild;

import java.util.Date;
import java.util.GregorianCalendar;

public class Principal {
    public static void main(String[] args) {
        
        Empleado poo[] = new Empleado[4];
        
        poo[0] = new Empleado("Soila Cerda", 10000, 2020, 5, 13);
        poo[1] = new Empleado("Sor Rita", 10550, 2004, 4, 8);                     
        poo[2] = new Empleado("Rosa Melano", 30200, 2001, 12, 20);
        poo[3] = new Jefatura("Penelope Luda", 45000, 1995, 8, 16);
        
        Jefatura jefe1 = (Jefatura) poo[3];
        
        jefe1.incent(5000);
        
        for(Empleado i: poo){
            
            System.out.println(i.toString());
            System.out.println("");
        
        }
        
        System.out.println("");
        
        for(Empleado i: poo){
            
            i.subirS(5);
            System.out.println("Empleado: "+ i.getNombre() + "\nNuevo sueldo: " +i.getSueldo());
            System.out.println("");
        }
        
        System.out.println(poo[3].getNombre() + " Por ser jefe tiene un aumento de:  " + jefe1.getIncentivo()
                           + "\nSu nuevo sueldo es: " + jefe1.getSueldo());
        
    }
}

class Empleado{
    
            
    public Empleado(String nombre, double sueldo, int año, int mes, int dia){
        this.sueldo = sueldo;
        this.nombre = nombre;
        GregorianCalendar calendar = new GregorianCalendar(año, mes-1, dia);
        fecha = calendar.getTime();
        IdSig++;
        Id = IdSig;
        
    }
    
    public Empleado(String nombre){
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public String getNombre() {
        return nombre + " Id: " + Id;
    }
    
    
    
    public void subirS(double porcentaje){
        double aumento = sueldo * porcentaje / 100;
        sueldo += aumento;
    }

    @Override
    public String toString() {
        return "Empleado:\n" + nombre + " Id: " + Id + "\nsueldo: " + sueldo + "\nfecha contrato: " + fecha;
    }
    
    private Double sueldo;
    private String nombre;
    private Date fecha;
    private static int IdSig;
    private int Id;

}

class Jefatura extends Empleado{

    public Jefatura(String nombre, double sueldo, int año, int mes, int dia) {
        super(nombre, sueldo, año, mes, dia);
    }

    public void incent(double b){
        incentivo = b;
    }

    public double getIncentivo() {
        return incentivo;
    }
    
    public double getSueldo() {
        
        double sueldoJ = super.getSueldo();
        
        return (sueldoJ + incentivo);
    }

    private double incentivo;
    
}

