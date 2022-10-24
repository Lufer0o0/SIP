package co.edu.uniquindio.proyecto.test;


import co.edu.uniquindio.proyecto.repo.CargoRepo;
import co.edu.uniquindio.proyecto.repo.EmpleadoRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDateTime;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class EmpleadoTest {


    @Autowired
    private EmpleadoRepo empleadoRepo;

    @Autowired
    private CargoRepo cargoRepo;


    @Test
    public void guardarEmpleado() {

        String cedula = "111111";
        String direccion = "Centro Armenia";
        String nombre = "Juan";
        String correo = "Juan@mail.com";
        String nit = "3333333";
        LocalDateTime fechaContratacion = LocalDateTime.now();
        String clave="222";

        String idCargo = "1";
        String descripcion = "Administrador";
        int c = cargoRepo.guardarCargo(idCargo, descripcion);
        if (c != 0) {

            int r = empleadoRepo.guardarEmpleado(cedula, direccion, nombre, fechaContratacion,clave);
            Assertions.assertNotNull(r);
        }

    }


    @Test
    public void actualizarEmpleado() {

        String cedula = "111111";
        String direccion = "Centro Armenia";
        String nombre = "Juan";
        String correo = "Juan@mail.com";
        String nit = "3333333";
        LocalDateTime fechaContratacion = LocalDateTime.now();
        String clave="2222";

        String idCargo = "1";
        String descripcion = "Administrador";

        int c = cargoRepo.guardarCargo(idCargo, descripcion);
        if (c != 0) {

            String direccion2 = "Barrio La Fachada";

            int r = empleadoRepo.guardarEmpleado(cedula, direccion, nombre, fechaContratacion,clave);
            int a = empleadoRepo.actualizarEmpleado(cedula, direccion2, idCargo, null, null,clave,nombre);
            Assertions.assertNotNull(a);
        }

    }

    @Test
    public void buscarEmpleado() {

        String cedula = "111111";
        String direccion = "Centro Armenia";
        String nombre = "Juan";
        String correo = "Juan@mail.com";
        String nit = "3333333";
        LocalDateTime fechaContratacion = LocalDateTime.now();
        String clave="333";

        Object encontrado = new Object();

        String idCargo = "1";
        String descripcion = "Administrador";
        int c = cargoRepo.guardarCargo(idCargo, descripcion);
        if (c != 0) {

            String direccion2 = "Barrio La Fachada";

            int r = empleadoRepo.guardarEmpleado(cedula, direccion, nombre, fechaContratacion,clave);
            encontrado = empleadoRepo.buscarEmpleado("111111");
            Assertions.assertNotNull(encontrado);


        }
    }

    @Test
    public void eliminarEmpleado() {

        String cedula = "777";
        String direccion = "Centro Armenia";
        String nombre = "Juan";
        String correo = "Juan@mail.com";
        String nit = "3333333";
        LocalDateTime fechaContratacion = LocalDateTime.now();
        String clave="333";

        Object encontrado = new Object();

        String idCargo = "1";
        String descripcion = "Administrador";
        int c = cargoRepo.guardarCargo(idCargo, descripcion);
        if (c != 0) {

            String direccion2 = "Barrio La Fachada";

            int r = empleadoRepo.guardarEmpleado(cedula, direccion, nombre, fechaContratacion,clave);
            int e = empleadoRepo.eliminarEmpleado("777");
            Object buscado = empleadoRepo.buscarEmpleado("777");
            Assertions.assertNull(buscado);


        }
    }






}
