
package POO.Personas;

import java.time.LocalTime;

public class Alumno extends  persona{
    
   private LocalTime horasEst;
   private String carr;
   
//Contructor
   
    public Alumno(String nom, LocalTime horas, String carr){
        super(nom);
        
        horasEst = horas;
        this.carr = carr;
    }
    
//GETTER
    
    public LocalTime getHorasEst() {
        return horasEst;
    }

    public String getCarr() {
        return carr;
    }
    
    
    
    public String getDescripcion() {
        
        return " Nombre del alumno: " + getNom() + "\n Esta estudiando: " + getCarr()
               + "\n Horas de estudio al dia: " + getHorasEst();
    }    
}
