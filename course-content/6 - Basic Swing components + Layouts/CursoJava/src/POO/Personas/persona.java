
package POO.Personas;


public abstract class persona {
    
    private final String nombre;
    
    public persona(String nom){
      nombre = nom;
    }

    public String getNom() {
        return nombre;
    }
    
    public abstract String getDescripcion();
  
}
