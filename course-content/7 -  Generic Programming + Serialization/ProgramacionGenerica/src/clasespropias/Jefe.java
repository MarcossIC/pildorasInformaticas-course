
package clasespropias;


public class Jefe extends Empleado{
    
    private double incentivo;

    
    public Jefe(String nombre, double sueldo, int edad) {
        super(nombre, edad, sueldo);
        incentivo = 0;
    }
    
    @Override
    public double getSueldo(){
        return super.getSueldo() +incentivo;
    }
    
    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }

    @Override
    public String toString() {
        return super.toString() + "Administrador{" + "incentivo: " + incentivo + '}';
    } 
    
}
