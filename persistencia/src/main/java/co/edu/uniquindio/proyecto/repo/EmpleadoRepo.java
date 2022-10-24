package co.edu.uniquindio.proyecto.repo;


import co.edu.uniquindio.proyecto.entidades2.Cliente;
import co.edu.uniquindio.proyecto.entidades2.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface EmpleadoRepo extends JpaRepository<Empleado, String> {


    Integer guardarEmpleado(String cedula, String direccion, String nombre, LocalDateTime fechaContratacion,String clave);

   Integer actualizarEmpleado(String cedula, String direccion, String idCargo,String jefeInmediato,String tipoContrato,String clave,String nombre);

  Object buscarEmpleado(String cedula);


  Integer eliminarEmpleado(String cedula);


@Query("select e from Empleado e")
List<Empleado> listarEmpleados();


@Query("select e from Empleado e where e.nombre=:nombre")
Empleado buscarEmpleadoId(String nombre);

@Query("select e from Empleado e where e.cedula=:cedula")
Empleado buscarEmpleadoC(String cedula);

@Query("select e from Empleado  e where e.cedula=:cedula and e.clave=:clave")
Empleado login(String cedula,String clave);





}
