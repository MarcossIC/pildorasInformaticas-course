package serializacion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Inicio {

    public static void main(String[] args) {

        Administrador jefe = new Administrador("Juan", 8000, 2005, 11, 8);

        jefe.setIncentivo(200);

        Empleado personas[] = new Empleado[3];
        personas[0] = jefe;
        personas[1] = new Empleado("lopez", 85000, 2015, 10, 7);
        personas[2] = new Empleado("juanito", 8623, 2013, 1, 7);

        try {
//            var escribiendoF = new ObjectOutputStream(new FileOutputStream("C:/Users/Marcos/Desktop/JavaSer/empleado.dat"));
//
//            escribiendoF.writeObject(personas);
//            escribiendoF.close();

            var recuperarF = new ObjectInputStream(new FileInputStream("C:/Users/Marcos/Desktop/JavaSer/empleado.dat"));

            Empleado personasR[] = (Empleado[]) recuperarF.readObject();
            recuperarF.close();

            for (Empleado e : personasR) {
                System.out.println(e);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}

class Empleado implements Serializable{
    private String nombre;
    private double sueldos;
    private Date fechaC;
    
    private static final long serialVersionUID = 2L;
    
    public Empleado(){
        
    }

    public Empleado(String nombre, double sueldos, int anio, int mes, int dia) {
        this.nombre = nombre;
        this.sueldos = sueldos;
        
        fechaC = new GregorianCalendar(anio, mes, dia).getTime();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldos;
    }

    public void setSueldo(double sueldo) {
        this.sueldos = sueldo;
    }

    public Date getFechaC() {
        return fechaC;
    }

    public void setFechaC(Date fechaC) {
        this.fechaC = fechaC;
    }
    
    public void subirSueldo(double porcentaje){
        double aumento = sueldos*porcentaje/100;
        
        sueldos += aumento;
    }

    @Override
    public String toString() {
        return "Empleado{ " + "nombre=: " + nombre + ", sueldo: " + sueldos + ", fechaContrato: " + fechaC + " }";
    }
}



class Administrador extends Empleado{
    
    private double incentivo;
    
    private static final long serialVersionUID = 2L;
    
    public Administrador(){
        
    }
    
    public Administrador(String nombre, double sueldo, int anio, int mes, int dia) {
        super(nombre, sueldo, anio, mes, dia);
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