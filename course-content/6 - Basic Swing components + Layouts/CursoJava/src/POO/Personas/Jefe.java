
package POO.Personas;


public class Jefe extends Empleado implements JefesIN{
    
    private double incent;
    
//CONSTRUCTOR
    public Jefe(String nom, double sue, int año, int mes, int dia){
        super(nom, sue, año, mes, dia);
          
    }
    
//METODOS
    
    public String TomaDecisiones(String decision){
        
        return "Un miembro de la direccion a tomado la decision de: " + decision;
    }
    
    public double EstableceBonus(double Bonus){
        double prima = 2000;
        
        return BonusIN.bonusB + Bonus + prima;
    }   
 
    
    
//SETTER
    public void setIncent(double incent) {
        this.incent = incent;
    }
    
//GETTER   
    public double getSueldo(){  
        double sueldoJ;
        sueldoJ = super.getSueldo();
        
        return sueldoJ + incent;
        
    }

    public double getIncent() {
        return incent;
    }
      
    public String getDescripcion() {
        
        return " Nombre del Jefe: " + getNom() + ", Id: " + getId() + "\n Sueldo: " + getSueldo() +
                "\n Incentivo: " + getIncent() + "\n Fecha de Alta: " + getAltaContrato() ;
    }   


    
    
    
}
