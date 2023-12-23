package arraylist;

import java.util.Date;
import java.util.GregorianCalendar;

public class MetodosGenericos {

    public static void main(String[] args) {
        String nombres[] = {"Maria", "Roberto", "Jose"};
        
//        Empleado paco = new Empleado("Paco", 20, 500);
//        Empleado juan = new Empleado("Juan", 30, 200);
//        Empleado ana = new Empleado("Ana", 40, 300);
//        
//        Empleado empeados[] = { paco, juan, ana };
//
//        System.out.println(MisMatrices.cantidadElemento(nombres));
//
//        System.out.println(MisMatrices.getMenorE(empeados));

         GregorianCalendar fechas[] = {
             new GregorianCalendar(2017, 2, 20),
             new GregorianCalendar(2014, 5, 12),
             new GregorianCalendar(2012, 7, 15)
         };
         
         System.out.println(MisMatrices.getMenorE(fechas).getTime());
    }
}

    class MisMatrices {

        public static <T> String cantidadElemento(T[] a) {

            return "El array tiene: " + a.length + " elementos";
        }
        
        public static <T extends Comparable> T getMenorE(T[] a){
            if(a == null || a.length == 0){
                return null;
            }
            T eleMenor= a[0];
            
            for (int i = 1; i < a.length; i++) {
                if(eleMenor.compareTo(a[i]) > 0 ){
                    eleMenor = a[i];
                }
                
            }
           
            return eleMenor;
   
        }

    }

    class Empleado  {

        private String nombre;
        public int edad;
        private double sueldo;
        private Date fechaC;

        public Empleado() {

        }

        public Empleado(String nombre, int edad, double sueldo) {
            this.nombre = nombre;
            this.edad = edad;
            this.sueldo = sueldo;
        }

        public Empleado(String nombre, double sueldo, int anio, int mes, int dia) {
            this.nombre = nombre;
            this.sueldo = sueldo;

            fechaC = new GregorianCalendar(anio, mes, dia).getTime();
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public double getSueldo() {
            return sueldo;
        }

        public void setSueldo(double sueldo) {
            this.sueldo = sueldo;
        }

        public Date getFechaC() {
            return fechaC;
        }

        public void setFechaC(Date fechaC) {
            this.fechaC = fechaC;
        }

        public void subirSueldo(double porcentaje) {
            double aumento = sueldo * porcentaje / 100;

            sueldo += aumento;
        }

        @Override
        public String toString() {
            return "Empleado{ " + "nombre=: " + nombre + ", sueldo: " + sueldo + ", fechaContrato: " + fechaC + " }";
        }
    }

class Administrador extends Empleado{
    
    private double incentivo;
    
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