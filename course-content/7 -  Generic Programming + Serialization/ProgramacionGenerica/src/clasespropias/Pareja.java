
package clasespropias;


public class Pareja<T>{
    
    private T primero;
    
    
    public Pareja(){
        primero = null;
    }
    
    public static void imprTrabajador(Pareja<? extends Empleado> p){
        Empleado primero = p.getPrimero();
        
        System.out.println(primero);
    }
    
    public void setPrimero(T cambio){
        primero = cambio;
    }
    
    public T getPrimero(){
        return primero;
    }
    
    
    
}
