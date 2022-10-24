package co.edu.uniquindio.proyecto.repo;

import co.edu.uniquindio.proyecto.entidades2.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface ClienteRepo extends JpaRepository<Cliente,String> {






 Integer guardarCliente(String cedula, String direccion, String nombre, String correo, String nit);
 Integer actualizarCliente(String cedula ,String direccion, String nombre,String nit,String correo);


 Object buscarCliente(String cedula);
 Integer eliminarCliente(String cedula);

 Cliente findByCedula(String cedula);
 @Query("select c from Cliente c where c.cedula=:cedula")
 Cliente obtenerCliente(String cedula);

 @Query("update Cliente set direccion=:direccion, nombre=:nombre,nit=:nit,correo=:correo where cedula=:cedula")
 Cliente actualizarCli(String cedula ,String direccion, String nombre,String nit,String correo);















}
