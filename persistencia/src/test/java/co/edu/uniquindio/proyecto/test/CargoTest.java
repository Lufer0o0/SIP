package co.edu.uniquindio.proyecto.test;


import co.edu.uniquindio.proyecto.repo.CargoRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class CargoTest {


    @Autowired
    private CargoRepo cargoRepo;


    @Test
    public void guardarCargo() {

        String codigo = "1";
        String descripcion = "Administrador";
        int r = cargoRepo.guardarCargo(codigo, descripcion);
        Assertions.assertNotNull(r);

    }


    @Test
    public void actualizarCargo() {
        String codigo = "1";
        String descripcion = "Administrador";
        int r = cargoRepo.guardarCargo(codigo, descripcion);

        int a = cargoRepo.actualizarCargo("1", "SubAdministrador");

        Assertions.assertNotNull(a);

    }

    @Test
    public void buscarCargo() {

        Object encontrado = new Object();
        String codigo = "1";
        String descripcion = "Administrador";
        int r = cargoRepo.guardarCargo(codigo, descripcion);

        encontrado = cargoRepo.buscarCargo("1");

        Assertions.assertNotNull(encontrado);

    }

    @Test
    public void eliminarCargo(){

        Object encontrado = new Object();
        String codigo = "1";
        String descripcion = "Administrador";
        int r = cargoRepo.guardarCargo(codigo, descripcion);

        int e= cargoRepo.eliminarCargo("1");
        Assertions.assertNotNull(e);
    }


}
