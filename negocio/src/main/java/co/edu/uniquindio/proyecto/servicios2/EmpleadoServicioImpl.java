package co.edu.uniquindio.proyecto.servicios2;

import co.edu.uniquindio.proyecto.entidades2.Empleado;
import co.edu.uniquindio.proyecto.repo.EmpleadoRepo;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@Service
public class EmpleadoServicioImpl implements EmpleadoServicio {

    private final EmpleadoRepo empleadoRepo;


    private String nombreEmpleado;

    public EmpleadoServicioImpl(EmpleadoRepo empleadoRepo) {


        this.empleadoRepo = empleadoRepo;
    }

    @Override
    public int registrarEmpleado(Empleado e) throws Exception {


        int g = 0;

        Empleado empleadoBuscado = null;


        empleadoBuscado = empleadoRepo.buscarEmpleadoC(e.getCedula());
        if (empleadoBuscado == null) {

            empleadoRepo.guardarEmpleado(e.getCedula(), e.getDireccion(), e.getNombre(), e.getFechaContratacion(), e.getClave());

            System.out.println("Entro al else de servicio" + e.getCedula() + " ," + e.getDireccion() + " ," + e.getNombre() + " ," + e.getFechaContratacion());


            return g;

        } else {
            throw new Exception("El empleado ya se encuentra registrado");


        }


    }

    @Override
    public int actualizarEmpleado(Empleado e) throws Exception {

        System.out.println("Entro a actualizarEmpeladoServicio");
        int ed = 0;

        Empleado empleadoBuscado = new Empleado();


        empleadoBuscado = empleadoRepo.buscarEmpleadoC(e.getCedula());
        if (empleadoBuscado != null) {

            String cargo = e.getCargo().getCodigo();
            String jefe = e.getJefeInmediato().getCedula();
            String tipoContrato = e.getTipoContrato().getCodigo();

            ed = empleadoRepo.actualizarEmpleado(e.getCedula(), e.getDireccion(), cargo, jefe, tipoContrato, e.getClave(), e.getNombre());
            System.out.println("Actualizo el empleado");
            return ed;

        } else {
            throw new Exception("El empleado que desea modificar no se encuentra registrado");


        }


    }

    @Override
    public Empleado BuscarEmpleado(String cedula) throws Exception {

        Empleado empleadoBuscado = new Empleado();

        empleadoBuscado = empleadoRepo.buscarEmpleadoC(cedula);

        if (empleadoBuscado != null) {
            return empleadoBuscado;


        } else {

            throw new Exception("El empleado buscado no se encuentra registrado");
        }


    }

    @Override
    public Boolean eliminarEmpleado(String cedula) throws Exception {

        Empleado empleadoBuscado = null;

        empleadoBuscado = empleadoRepo.buscarEmpleadoC(cedula);

        if (empleadoBuscado == null) {

            throw new Exception("El empleado que desea eliminar  no se encuentra registrado");
        } else {


            int eliminar = empleadoRepo.eliminarEmpleado(cedula);

            return true;

        }

    }

    @Override
    public String login(String cedula, String clave) throws Exception {
        Boolean registrado = false;
        Empleado e = empleadoRepo.login(cedula, clave);

        nombreEmpleado=e.getNombre();
        if (e == null) {
            throw new Exception("Cedula o Clave incorrecta");
        } else {
            return e.getNombre()+"-"+e.getCargo().getDescripcion();
        }


    }

    @Override
    public String nombreLogueado() {
        return nombreEmpleado;
    }
}
