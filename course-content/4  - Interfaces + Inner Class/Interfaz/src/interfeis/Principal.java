
package interfeis;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class Principal {
    
    public static void main(String[] args) {
        
        Empleado poo[] = new Empleado[4];
        
        poo[0] = new Empleado("Soila Cerda", 12000, 2020, 5, 13);
        poo[1] = new Empleado("Sor Rita", 10550, 2004, 4, 8);                     
        poo[2] = new Empleado("Rosa Melano", 30200, 2001, 12, 20);
        poo[3] = new Jefatura("Penelope Luda", 45000, 1995, 8, 16);
        
        Jefatura jefe1 = (Jefatura) poo[3];
        
        System.out.println(jefe1.tomarDeci("Dar menos dias de vacaciones"));
        System.out.println("");
        
        for(Empleado i: poo){
            
            i.subirS(5);

        }
        
        jefe1.incent(50000);      
        
            Arrays.sort(poo);
        int a = 1;
        for(Empleado e: poo){
            
            System.out.println("Nombre: " + e.getNombre());
            System.out.println("Sueldo: " + e.getSueldo());
            System.out.println("Fecha: " + e.getFecha());
            
            if(a < 4){
                System.out.println("Empleado: " + e.getNombre() + " Tiene un bonus de: " + e.EstableceBonus(450));
                a++;
                System.out.println("");
            } else {
                System.out.println("Jefe: " + jefe1.getNombre() + " Tiene un bonus de: " + jefe1.EstableceBonus(500));
                System.out.println("");
            }
        
        }
        
    }
    
}

class Empleado implements Comparable, Trabajador{
    
            
    public Empleado(String nombre, double sueldo, int año, int mes, int dia){
        
        this.sueldo = sueldo;
        this.nombre = nombre;
        GregorianCalendar calendar = new GregorianCalendar(año, mes-1, dia);
        fecha = calendar.getTime();
        ++IdSig;
        Id = IdSig;
        
    }
    
    public Empleado(String nombre){
        this(nombre, 35000, 2001, 6, 16);
    }

    public double getSueldo() {
        return sueldo;
    }

    public String getNombre() {
        return nombre + " Id: " + Id;
    }

    public Date getFecha() {
        return fecha;
    }
    
    public void subirS(double porcentaje){
        double aumento = sueldo * porcentaje / 100;
        sueldo += aumento;
    }
    
    public int compareTo(Object miObjet){
        
        Empleado otroEmp = (Empleado) miObjet;
        
        if(this.Id < otroEmp.Id){
            
            return -1;
        }
        if(this.Id > otroEmp.Id){
            
            return 1;
        }
        return 0;
           
    }
 
    private String nombre;
    private Double sueldo;
    private Date fecha;
    private static int IdSig;
    private int Id;
    
    public double EstableceBonus(double Bonus){
        
        return Trabajador.bonusBase + Bonus;
    }

}


class Jefatura extends Empleado implements Jefe{

    public Jefatura(String nombre, double sueldo, int año, int mes, int dia) {
        super(nombre, sueldo, año, mes, dia);
    }


    public void incent(double b){
        incentivo = b;
    }

    public double getIncentivo() {
        return incentivo;
    }
    
    @Override
    public double getSueldo() {
        
        double sueldoJ = super.getSueldo();
        sueldoJ += this.incentivo;
        return sueldoJ;
    }

    private double incentivo;
    
    public String tomarDeci(String Decision){
        
        return "Jefe ha decidido: " + Decision;
    }
    
    public double EstableceBonus(double Bonus){
        double prima = 2000;
        
        return Trabajador.bonusBase + Bonus + prima;
    }

}