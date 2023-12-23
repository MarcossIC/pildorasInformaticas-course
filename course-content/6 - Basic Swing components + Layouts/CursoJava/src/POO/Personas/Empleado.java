
package POO.Personas;

import java.util.Date;
import java.util.GregorianCalendar;


public class Empleado extends persona implements Comparable, BonusIN{
  
    private double sueldo;
    private Date altaContrato;
    private int id;
    private static int idS=1;
    
//CONSTRUCTOR        
    
    public Empleado(String nom, double sue, int año, int mes, int dia){
        super(nom);
        
        sueldo = sue;
        GregorianCalendar calendar = new GregorianCalendar(año, (mes-1), dia);
        
        altaContrato = calendar.getTime();
        id = idS;
        idS++;
        
    }
    
    public Empleado(String nom){
        this(nom, 30000, 2000, 01, 01);
    } 
    
//METODOS
    
    public int compareTo(Object objeto){
        Empleado otroEmp = (Empleado) objeto;
        
        if(this.sueldo < otroEmp.sueldo){
           return -1;
        }
        
        if(this.sueldo > otroEmp.sueldo){
            return 1;
        }
        
        return 0;
        
    }
    
    public double EstableceBonus(double Bonus){
        
        return BonusIN.bonusB + Bonus;
    }   
    
//GETTER

    public double getSueldo() {
        return sueldo;
    }

    public Date getAltaContrato() {
        return altaContrato;
    }

    public int getId() {
        return id;
    }  
    
    public static String getIdS(){
        
       return "El Id Siguiente es: " + idS;
    }
    
    public String getDescripcion() {
        
        return " Nombre del Empleado: " + getNom() + ", Id: " + getId() + 
                "\n Sueldo: " + getSueldo() + "\n Fecha de Alta: " + getAltaContrato();
    }    
    

//SETTER
    
    public void setAumento(double porcentage){
        double aumento = sueldo*(porcentage/100);
        
        sueldo+=aumento;
    }
    
    

}
