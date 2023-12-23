
package POO.Coche;


public class furgoneta extends coche{
    private int capacidadEx;
    private int plazasEx;
    
    public furgoneta(int capacidadEx, int plazasEx ){
        super();
        
        this.capacidadEx = capacidadEx;
        this.plazasEx = plazasEx;
    }

    public String getDatos() {
        return "La capacidad de carga es: " + capacidadEx + " y la furgoneta tiene " + plazasEx + " plazas";
    }
   
    
}
