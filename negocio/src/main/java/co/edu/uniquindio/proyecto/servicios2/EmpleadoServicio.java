package co.edu.uniquindio.proyecto.servicios2;

import co.edu.uniquindio.proyecto.entidades2.Empleado;

public interface EmpleadoServicio {



    int registrarEmpleado(Empleado e) throws Exception;
    int actualizarEmpleado(Empleado e)throws Exception;
    Empleado BuscarEmpleado(String cedula)throws Exception;
    Boolean eliminarEmpleado(String cedula)throws Exception;


    String login(String cedula,String clave)throws Exception;
    String nombreLogueado();

}
