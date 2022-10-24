package co.edu.uniquindio.proyecto.repo;


import co.edu.uniquindio.proyecto.entidades2.Factura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface FacturaRepo extends JpaRepository<Factura,String> {

    Integer guardarFactura(String codigo, LocalDateTime fecha,String medioPago,String tipo,double valorTotal);
    Integer actualizarFactura(String codigo,String medioPago,String tipo,double valorTotal);
    Object buscarFactura(String codigo);
    Integer eliminarFactura(String codigo);

    @Query("select f from Factura f where f.codigo=:codigo")
    Factura buscarFacturaC(String codigo);



}
