package test;

import clasespropias.Empleado;
import clasespropias.Jefe;
import clasespropias.Pareja;

public class HerenciaGenerica {

    public static void main(String[] args) {
//        Empleado Administrativa = new Empleado("Elena", 35, 1000);
//        Jefe DirectoraComerc = new Jefe("Ana", 27, 2500);
//        Empleado nuevo = DirectoraComerc;

        Pareja<Empleado> Administratica = new Pareja<>();

        Pareja<Jefe> DirectoriaComerc = new Pareja<>();
        
//        Pareja<Empleado> nuevoEmpleado = DirectoriaComerc;

        Pareja.imprTrabajador(Administratica);
        Pareja.imprTrabajador(DirectoriaComerc);
    }
}
