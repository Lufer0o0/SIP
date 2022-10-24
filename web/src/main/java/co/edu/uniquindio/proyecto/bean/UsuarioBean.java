package co.edu.uniquindio.proyecto.bean;

import co.edu.uniquindio.proyecto.entidades2.*;
import co.edu.uniquindio.proyecto.repo.*;

import co.edu.uniquindio.proyecto.servicios2.ClienteServicio;
import co.edu.uniquindio.proyecto.servicios2.EmpleadoServicio;
import co.edu.uniquindio.proyecto.servicios2.FacturaServicio;
import co.edu.uniquindio.proyecto.servicios2.ProductoServicio2;
import lombok.Getter;
import lombok.Setter;


import org.primefaces.model.charts.ChartData;
import org.primefaces.model.charts.pie.PieChartDataSet;
import org.primefaces.model.charts.pie.PieChartModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@ViewScoped
@Component
public class UsuarioBean implements Serializable {

    @Setter
    @Getter
    private Cliente cliente;

    @Autowired
    private FacturaRepo facturaRepo;


    @Autowired
    private CargoRepo cargoRepo;

    @Autowired
    private InventarioRepo inventarioRepo;
    @Autowired
    private ProveedorRepo proveedorRepo;


    @Autowired
    private EmpleadoRepo empleadoRepo;

    @Autowired
    private TipoContratoRepo tipoContratoRepo;

    //--------------------- Variables Cliente

    @Setter
    @Getter
    private String cedulaRegistro;

    @Setter
    @Getter
    private String direccionRegistro;
    @Setter
    @Getter
    private String nombreRegistro;
    @Setter
    @Getter
    private String correoRegistro;

    @Setter
    @Getter
    private String nitRegistro;


    @Setter
    @Getter
    private String cedulaBuscar;

    @Setter
    @Getter
    private String direccionBuscar;
    @Setter
    @Getter
    private String nombreBuscar;
    @Setter
    @Getter
    private String correoBuscar;

    @Setter
    @Getter
    private String nitBuscar;


    @Setter
    @Getter
    private String cedulaEditar;

    @Setter
    @Getter
    private String direccionEditar;
    @Setter
    @Getter
    private String nombreEditar;
    @Setter
    @Getter
    private String correoEditar;

    @Setter
    @Getter
    private String nitEditar;


    @Setter
    @Getter
    private String cedulaEliminar;

    @Setter
    @Getter
    private String codigoBuscar3;

    @Setter
    @Getter
    private boolean renderBuscarEmpleado;


    @Setter
    @Getter
    private boolean renderBuscarProducto;

    @Setter
    @Getter
    private String color="white";


    //---------------------- Variables Empleado  -----------------


    @Setter
    @Getter
    private String cedulaRegistro2;

    @Setter
    @Getter
    private String direccionRegistro2;
    @Setter
    @Getter
    private String nombreRegistro2;

    @Setter
    @Getter
    private LocalDateTime fechaContratacionRegistro2;

    @Setter
    @Getter
    private String cargoCodigoActualizar2;

    @Setter
    @Getter
    private String jefeInmediatoActualizar2;

    @Setter
    @Getter
    private String tipoContratoActualizar2;


    @Setter
    @Getter
    private String cedulaBuscar2;

    @Setter
    @Getter
    private String direccionBuscar2;
    @Setter
    @Getter
    private String nombreBuscar2;

    @Setter
    @Getter
    private LocalDateTime fechaContratacionBuscar2;

    @Setter
    @Getter
    private String cargoCodigoBuscar2;

    @Setter
    @Getter
    private String jefeInmediatoBuscar2;

    @Setter
    @Getter
    private String tipoContratoBuscar2;

    @Setter
    @Getter
    private String claveRegistro2;


    @Setter
    @Getter
    private String claveActualizar2;


    @Setter
    @Getter
    private List<Cargo> cargos;

    @Setter
    @Getter
    private List<String> nombresCargos;

    @Setter
    @Getter
    private List<Empleado> empleados;

    @Setter
    @Getter
    private List<String> nombresEmpleados;

    @Setter
    @Getter
    private String empleadoJefe;

    @Setter
    @Getter
    private Empleado empleado;

    @Setter
    @Getter
    private List<TipoContrato> contratos;

    @Setter
    @Getter
    private List<String> nombresContratos;

    @Setter
    @Getter
    private List<String> nombresProveedores;

    @Setter
    @Getter
    private String proveedorActualizar3;

    @Setter
    @Getter
    private String codigoEliminar3;

    @Setter
    @Getter
    private List<String> nombresInventarios;

    @Setter
    @Getter
    private String inventarioActualizar3;


    @Setter
    @Getter
    private String contrato;


    @Setter
    @Getter
    private String cargo;

    @Setter
    @Getter
    private int unidadesVendidas;

    @Setter
    @Getter
    private String direccionActualizar2;


    @Setter
    @Getter
    private String cedulaActualizar2;


    @Setter
    @Getter
    private String cedulaEliminar2;


    @Setter
    @Getter
    private String codigoRegistro3;


    @Setter
    @Getter
    private String codigoActualizar3;


    @Setter
    @Getter
    private int cantidadRegistro3;

    @Setter
    @Getter
    private int cantidadBuscar3;


    @Setter
    @Getter
    private String proveedorBuscar3;

    @Setter
    @Getter
    private String inventarioBuscar3;

    @Setter
    @Getter
    private int cantidadActualizar3;


    @Setter
    @Getter
    private String categoriaRegistro3;

    @Setter
    @Getter
    private String categoriaBuscar3;

    @Setter
    @Getter
    private String categoriaActualizar3;

    @Setter
    @Getter
    private String nombreRegistro3;

    @Setter
    @Getter
    private String nombreActualizar3;

    @Setter
    @Getter
    private String nombreBuscar3;

    @Setter
    @Getter
    private double precioCompraRegistro3;

    @Setter
    @Getter
    private double precioCompraBuscar3;

    @Setter
    @Getter
    private double precioCompraActualizar3;


    @Setter
    @Getter
    private double precioVentaRegistro3;

    @Setter
    @Getter
    private double precioVentaBuscar3;

    @Setter
    @Getter
    private double precioVentaActualizar3;

    @Setter
    @Getter
    private String nombreActualizar2;


    @Setter
    @Getter
    private List<TipoContrato> tipoContratos;


    @Setter
    @Getter
    private List<Inventario> inventarios;


    @Setter
    @Getter
    private List<Proveedor> proveedores;


    @Setter
    @Getter
    private Producto2 producto2;

    @Setter
    @Getter
    private String codigoBuscarProducto;


    @Setter
    @Getter
    private String codigoRegistro4;
    @Setter
    @Getter
    private String codigoBuscar4;

    @Setter
    @Getter
    private String codigoActualizar4;

    @Setter
    @Getter
    private String codigoEliminar4;

    @Setter
    @Getter
    private LocalDateTime fechaRegistro4;

    @Setter
    @Getter
    private LocalDateTime fechaBuscar4;
    @Setter
    @Getter
    private LocalDateTime fechaActualizar4;


    @Setter
    @Getter
    private String medioPagoRegistro4;

    @Setter
    @Getter
    private String medioPagoBuscar4;

    @Setter
    @Getter
    private String medioPagoActualizar4;

    @Setter
    @Getter
    private String tipoRegistro4;

    @Setter
    @Getter
    private String tipoActualizar4;

    @Setter
    @Getter
    private String tipoBuscar4;

    @Setter
    @Getter
    private double valorTotalRegistro4;

    @Setter
    @Getter
    private double valorTotalActualizar4;

    @Setter
    @Getter
    private double valorTotalBuscar4;


    @Setter
    @Getter
    private Factura factura;


    @Setter
    @Getter
    private boolean requeridoRegistro;

    @Setter
    @Getter
    private boolean requeridoBuscar;

    @Setter
    @Getter
    private boolean requeridoActualizar;

    @Setter
    @Getter
    private boolean requeridoEliminar;


    @Setter
    @Getter
    private List<Producto2> productos;

    @Setter
    @Getter
    private Integer productosAgotados;


    @Setter
    @Getter
    private List<String> nombresProductos = new ArrayList<>();


    @Setter
    @Getter
    private String nombreProductoSeleccionado;


    //rendereds

    @Setter
    @Getter
    private boolean renderFormularioGeneral;
    @Setter
    @Getter
    private boolean renderRegistrarEmpleado;


    @Setter
    @Getter
    private boolean renderActualizarEmpleado;




    @Setter
    @Getter
    private boolean renderEliminarEmpleado;

    @Setter
    @Getter
    private boolean renderBuscar = true;

    @Setter
    @Getter
    private PieChartModel pieModel;


    @Autowired
    private final ClienteServicio clienteServicio;

    @Autowired
    private final EmpleadoServicio empleadoServicio;

    @Autowired
    private final ProductoServicio2 productoServicio2;

    @Autowired
    private final FacturaServicio facturaServicio;


    public UsuarioBean(ClienteRepo clienteRepo, ClienteServicio clienteServicio, EmpleadoServicio empleadoServicio, ProductoServicio2 productoServicio2, FacturaServicio facturaServicio) {

        this.clienteServicio = clienteServicio;
        this.empleadoServicio = empleadoServicio;
        this.productoServicio2 = productoServicio2;
        this.facturaServicio = facturaServicio;
    }


    @PostConstruct
    public void inicializar() {

        System.out.println("Entro a inicializar UsuarioBean");

        llenarNombresCargos();
        llenarNombresEmpleados();
        llenarNombresContratos();
        llenarNombresInventarios();
        llenarNombresProveedores();
        validarExistenciaProductos();

        createPieModel();
        cargarNombres();


        requeridoRegistro = true;
        requeridoBuscar = true;
        requeridoActualizar = true;
        requeridoEliminar = true;
        renderBuscarEmpleado = false;
        renderFormularioGeneral = false;
        renderRegistrarEmpleado = false;
        renderBuscarProducto = false;


    }


    public void registrarCliente() {


        cliente = new Cliente();

        cliente.setCedula(cedulaRegistro);
        cliente.setNombre(nombreRegistro);
        cliente.setDireccion(direccionRegistro);
        cliente.setCorreo(correoRegistro);
        cliente.setNit(nitRegistro);

        int guardo = 0;
        try {
            guardo = clienteServicio.registrarCliente(cliente);
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Alerta", "Registro Exitoso");
            FacesContext.getCurrentInstance().addMessage("mensajeCliente", msg);
        } catch (Exception e) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Alerta", e.getMessage());
            FacesContext.getCurrentInstance().addMessage("mensajeCliente", msg);
        }


    }


    public void buscarCliente() {

        try {
            cliente = new Cliente();
            cliente = clienteServicio.BuscarCliente(cedulaBuscar);
            nombreBuscar = cliente.getNombre();
            correoBuscar = cliente.getCorreo();
            nitBuscar = cliente.getNit();
            direccionBuscar = cliente.getDireccion();

            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Alerta", "Cliente encontrado");
            FacesContext.getCurrentInstance().addMessage("mensajeCliente", msg);
        } catch (Exception e) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Alerta", e.getMessage());
            FacesContext.getCurrentInstance().addMessage("mensajeCliente", msg);

        }


    }


    public void buscarCliente2() {

        try {
            cliente = new Cliente();
            cliente = clienteServicio.BuscarCliente(cedulaEditar);
            nombreEditar = cliente.getNombre();
            correoEditar = cliente.getCorreo();
            nitEditar = cliente.getNit();
            direccionEditar = cliente.getDireccion();


            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Alerta", "Cliente encontrado");
            FacesContext.getCurrentInstance().addMessage("mensajeCliente", msg);
        } catch (Exception e) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Alerta", e.getMessage());
            FacesContext.getCurrentInstance().addMessage("mensajeCliente", msg);

        }


    }


    public void actualizarCliente() {
        cliente = new Cliente();


        cliente.setCedula(cedulaEditar);
        cliente.setNit(nitEditar);
        cliente.setDireccion(direccionEditar);
        cliente.setCorreo(correoEditar);
        cliente.setNombre(nombreEditar);


        try {
            int r = clienteServicio.actualizarCliente(cliente);
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Alerta", "Actualizacion Exitosa");
            FacesContext.getCurrentInstance().addMessage("mensajeCliente", msg);
        } catch (Exception e) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Alerta", e.getMessage());
            FacesContext.getCurrentInstance().addMessage("mensajeCliente", msg);
        }


    }


    public void eliminarCliente() {


        try {
            boolean elimino = clienteServicio.eliminarCliente(cedulaEliminar);
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Alerta", "Eliminacion Exitosa");
            FacesContext.getCurrentInstance().addMessage("mensajeCliente", msg);
        } catch (Exception e) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Alerta", e.getMessage());
            FacesContext.getCurrentInstance().addMessage("mensajeCliente", msg);
        }


    }


    public void registrarEmpleado() {

        System.out.println("Entro a registrarEmpleado");


        empleado = new Empleado();
        empleado.setCedula(cedulaRegistro2);
        System.out.println(" cedula" + cedulaRegistro2);
        empleado.setDireccion(direccionRegistro2);
        System.out.println(" direccion " + direccionRegistro2);
        empleado.setNombre(nombreRegistro2);
        System.out.println("nombre" + nombreRegistro2);
        empleado.setClave(claveRegistro2);
        System.out.println(" clave " + claveRegistro2);
        empleado.setFechaContratacion(fechaContratacionRegistro2);


        try {
            int r = empleadoServicio.registrarEmpleado(empleado);
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Alerta", "Registro Exitoso");
            FacesContext.getCurrentInstance().addMessage("mensajeEmpleado", msg);
        } catch (Exception e) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Alerta", e.getMessage());
            FacesContext.getCurrentInstance().addMessage("mensajeEmpleado", msg);
        }


    }


    public void actualizarEmpleado() {


        System.out.println("Entro a actualizarEmpleadoBean");

        TipoContrato contratoR = tipoContratoRepo.buscarContratoPorId(contrato);
        String idCargo = cargoRepo.buscarIdCargo(cargo);
        Cargo cargoR = cargoRepo.buscarCargoId(idCargo);
        Empleado jefeR = empleadoRepo.buscarEmpleadoId(empleadoJefe);


        empleado = new Empleado();
        empleado.setCargo(cargoR);
        empleado.setTipoContrato(contratoR);
        empleado.setJefeInmediato(jefeR);
        empleado.setCedula(cedulaActualizar2);
        empleado.setNombre(nombreActualizar2);
        empleado.setClave(claveActualizar2);
        empleado.setDireccion(direccionActualizar2);


        try {
            int e = empleadoServicio.actualizarEmpleado(empleado);
            System.out.println(" ActualziarEmpl e: " + e);

            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Alerta", "Actualizacion Exitosa");
            FacesContext.getCurrentInstance().addMessage("mensajeEmpleado", msg);
        } catch (Exception e) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Alerta", e.getMessage());
            FacesContext.getCurrentInstance().addMessage("mensajeEmpleado", msg);
        }


    }


    public void buscarEmpleado() {

        empleado = new Empleado();
        try {
            empleado = empleadoServicio.BuscarEmpleado(cedulaActualizar2);
            cedulaActualizar2 = empleado.getCedula();
            nombreActualizar2 = empleado.getNombre();
            direccionActualizar2 = empleado.getDireccion();
            tipoContratoActualizar2 = empleado.getTipoContrato().getTipo();
            jefeInmediatoActualizar2 = empleado.getJefeInmediato().getNombre();
            cargoCodigoActualizar2 = empleado.getCargo().getCodigo();
            claveActualizar2 = empleado.getClave();

            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Alerta", "Busqueda Exitosa");
            FacesContext.getCurrentInstance().addMessage("mensajeEmpleado", msg);


        } catch (Exception e) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Alerta", e.getMessage());
            FacesContext.getCurrentInstance().addMessage("mensajeEmpleado", msg);
        }


    }


    public void buscarEmpleado2() {
        System.out.println("Entro a buscarEmpleado");
        empleado = new Empleado();
        try {
            empleado = empleadoServicio.BuscarEmpleado(cedulaBuscar2);

            if (empleado != null) {
                renderBuscarEmpleado = true;
                System.out.println("Empleado encontrado " + empleado.getNombre());
            }
            cedulaBuscar2 = empleado.getCedula();
            nombreBuscar2 = empleado.getNombre();
            direccionBuscar2 = empleado.getDireccion();
            tipoContratoBuscar2 = empleado.getTipoContrato().getTipo();
            jefeInmediatoBuscar2 = empleado.getJefeInmediato().getNombre();
            cargoCodigoBuscar2 = empleado.getCargo().getCodigo();
            fechaContratacionBuscar2 = empleado.getFechaContratacion();


            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Alerta", "Busqueda Exitosa");
            FacesContext.getCurrentInstance().addMessage("mensajeEmpleado", msg);


        } catch (Exception e) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Alerta", e.getMessage());
            FacesContext.getCurrentInstance().addMessage("mensajeEmpleado", msg);
        }


    }


    public void eliminarEmpleado() {

        try {
            boolean elimino = empleadoServicio.eliminarEmpleado(cedulaEliminar2);
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Alerta", "Eliminacion Exitosa");
            FacesContext.getCurrentInstance().addMessage("mensajeCliente", msg);
        } catch (Exception e) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Alerta", e.getMessage());
            FacesContext.getCurrentInstance().addMessage("mensajeCliente", msg);
        }

    }

    public void llenarNombresCargos() {
        nombresCargos = new ArrayList<>();
        cargos = new ArrayList<>();
        cargos = cargoRepo.listarCargos();
        for (Cargo c : cargos) {

            nombresCargos.add(c.getDescripcion());
        }


    }


    public void llenarNombresEmpleados() {

        nombresEmpleados = new ArrayList<>();
        empleados = new ArrayList<>();
        empleados = empleadoRepo.listarEmpleados();

        for (Empleado e : empleados) {
            nombresEmpleados.add(e.getNombre());
        }

    }


    public void llenarNombresContratos() {

        nombresContratos = new ArrayList<>();
        contratos = new ArrayList<>();
        contratos = tipoContratoRepo.listarContratos();

        for (TipoContrato tc : contratos) {

            nombresContratos.add(tc.getTipo());


        }


    }

    public void llenarNombresInventarios() {

        nombresInventarios = new ArrayList<>();
        inventarios = new ArrayList<>();
        inventarios = inventarioRepo.findAll();
        for (Inventario i : inventarios) {

            nombresInventarios.add(i.getCategoria());
        }
    }


    public void llenarNombresProveedores() {

        nombresProveedores = new ArrayList<>();
        proveedores = new ArrayList<>();
        proveedores = proveedorRepo.findAll();

        for (Proveedor p : proveedores) {

            nombresProveedores.add(p.getNit());

        }


    }


    public void registrarProducto() {

        producto2 = new Producto2();
        producto2.setCantidad(cantidadRegistro3);
        producto2.setCodigo(codigoRegistro3);
        producto2.setCategoria(categoriaRegistro3);
        producto2.setNombre(nombreRegistro3);
        producto2.setPrecioCompra(precioCompraRegistro3);
        producto2.setPrecioVenta(precioVentaRegistro3);


        try {
            int r = productoServicio2.registrarProducto(producto2);

            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Alerta", "Registro Exitoso");
            FacesContext.getCurrentInstance().addMessage("mensajeProducto", msg);
        } catch (Exception e) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Alerta", e.getMessage());
            FacesContext.getCurrentInstance().addMessage("mensajeProducto", msg);
        }


    }


    public void buscarProducto() {
        System.out.println("Entro a buscar producto");
        try {
            Producto2 productob = productoServicio2.BuscarProducto(codigoActualizar3);
            if (productob != null) {
                System.out.println("Producto encontrado, codigo de busquedad :" + codigoActualizar3);
            }
            codigoActualizar3 = productob.getCodigo();
            cantidadActualizar3 = productob.getCantidad();
            categoriaActualizar3 = productob.getCategoria();
            nombreActualizar3 = productob.getNombre();
            precioCompraActualizar3 = productob.getPrecioCompra();
            precioVentaActualizar3 = productob.getPrecioVenta();
            inventarioActualizar3 = productob.getInventario().getCategoria();
            proveedorActualizar3 = productob.getProveedor().getNit();

            renderBuscarProducto = true;

            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Alerta", "Busquedad Exitosa");
            FacesContext.getCurrentInstance().addMessage("mensajeProducto", msg);

        } catch (Exception e) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Alerta", e.getMessage());
            FacesContext.getCurrentInstance().addMessage("mensajeProducto", msg);
        }


        System.out.println("Salio del metodo buscar");

    }


    public void actualizarProducto() {

        Inventario inventario = inventarioRepo.buscarPorid(inventarioActualizar3);
        Proveedor proveedor = proveedorRepo.buscarProveedor(proveedorActualizar3);


        producto2 = new Producto2();
        producto2.setCodigo(codigoActualizar3);
        producto2.setPrecioVenta(precioVentaActualizar3);
        producto2.setCantidad(cantidadActualizar3);
        producto2.setNombre(nombreActualizar3);
        producto2.setPrecioCompra(precioCompraActualizar3);
        producto2.setInventario(inventario);
        producto2.setProveedor(proveedor);
        producto2.setCategoria(categoriaActualizar3);


        try {
            int e = productoServicio2.actualizarProducto(producto2);
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Alerta", "Actualizacion Exitosa");
            FacesContext.getCurrentInstance().addMessage("mensajeProducto", msg);
        } catch (Exception ex) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Alerta", ex.getMessage());
            FacesContext.getCurrentInstance().addMessage("mensajeProducto", msg);
        }

    }


    public void buscarProducto2() {


        System.out.println("Entro a buscar producto2, codigoBuscarProducto: " + codigoBuscarProducto);

        try {


            //  Producto2 productob = productoServicio2.BuscarProducto(codigoBuscar3);
            Producto2 productob = productoServicio2.BuscarProducto(codigoBuscarProducto);


            if (productob != null) {
                System.out.println("Encontro producto, nombre producto: " + productob.getNombre());
            }


            codigoBuscar3 = productob.getCodigo();
            cantidadBuscar3 = productob.getCantidad();
            categoriaBuscar3 = productob.getCategoria();
            nombreBuscar3 = productob.getNombre();
            precioCompraBuscar3 = productob.getPrecioCompra();
            precioVentaBuscar3 = productob.getPrecioVenta();
            inventarioBuscar3 = productob.getInventario().getCategoria();
            proveedorBuscar3 = productob.getProveedor().getNit();


            renderBuscarProducto = true;

            System.out.println("Encontro el producto");


            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Alerta", "Busquedad Exitosa");
            FacesContext.getCurrentInstance().addMessage("mensajeProducto", msg);

        } catch (Exception e) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Alerta", e.getMessage());
            FacesContext.getCurrentInstance().addMessage("mensajeProducto", msg);
        }

        System.out.println("Salio de Buscar producto");
    }


    public void eliminarProducto() {

        try {
            boolean elimino = productoServicio2.eliminarPrducto(codigoEliminar3);
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Alerta", "Eliminacion Exitosa");
            FacesContext.getCurrentInstance().addMessage("mensajeProducto", msg);
        } catch (Exception e) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Alerta", e.getMessage());
            FacesContext.getCurrentInstance().addMessage("mensajeProducto", msg);
        }


    }


    public void registrarFactura() {


        factura = new Factura();

        factura.setCodigo(codigoRegistro4);
        factura.setFecha(fechaRegistro4);
        factura.setMedioDePago(medioPagoRegistro4);
        factura.setTipo(tipoRegistro4);
        factura.setValorTotal(valorTotalRegistro4);


        try {
            int r = facturaServicio.registrarFactura(factura);

            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Alerta", "Registro Exitoso");
            FacesContext.getCurrentInstance().addMessage("mensajeFactura", msg);
        } catch (Exception e) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Alerta", e.getMessage());
            FacesContext.getCurrentInstance().addMessage("mensajeFactura", msg);
        }


    }

    public void buscarFactura() {

        try {
            Factura f = facturaRepo.buscarFacturaC(codigoRegistro4);

            codigoActualizar4 = f.getCodigo();
            fechaActualizar4 = f.getFecha();
            medioPagoActualizar4 = f.getMedioDePago();
            tipoActualizar4 = f.getTipo();
            valorTotalActualizar4 = f.getValorTotal();


            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Alerta", "Busquedad Exitosa");
            FacesContext.getCurrentInstance().addMessage("mensajeFactura", msg);


        } catch (Exception e) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Alerta", e.getMessage());
            FacesContext.getCurrentInstance().addMessage("mensajeFactura", msg);
        }


    }

    public void buscarFactura2() {

        try {
            Factura f = facturaRepo.buscarFacturaC(codigoRegistro4);

            codigoBuscar4 = f.getCodigo();
            fechaBuscar4 = f.getFecha();
            medioPagoBuscar4 = f.getMedioDePago();
            tipoBuscar4 = f.getTipo();
            valorTotalBuscar4 = f.getValorTotal();


            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Alerta", "Busquedad Exitosa");
            FacesContext.getCurrentInstance().addMessage("mensajeFactura", msg);


        } catch (Exception e) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Alerta", e.getMessage());
            FacesContext.getCurrentInstance().addMessage("mensajeFactura", msg);
        }


    }


    public void actualizarFactura() {


        factura = new Factura();


        factura.setCodigo(codigoActualizar4);
        factura.setTipo(tipoActualizar4);
        factura.setFecha(fechaActualizar4);
        factura.setValorTotal(valorTotalActualizar4);
        factura.setMedioDePago(medioPagoActualizar4);


        try {
            int a = facturaServicio.actualizarFactura(factura);

            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Alerta", "Actualizacion Exitosa");
            FacesContext.getCurrentInstance().addMessage("mensajeFactura", msg);

        } catch (Exception e) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Alerta", e.getMessage());
            FacesContext.getCurrentInstance().addMessage("mensajeFactura", msg);
        }


    }


    public void eliminarFactura() {


        try {
            boolean eliminar = facturaServicio.eliminarFactura(codigoEliminar4);

            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Alerta", "Eliminacion Exitosa");
            FacesContext.getCurrentInstance().addMessage("mensajeFactura", msg);


        } catch (Exception e) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Alerta", e.getMessage());
            FacesContext.getCurrentInstance().addMessage("mensajeFactura", msg);
        }


    }


    private void createPieModel() {

        productosAgotados = 0;
        pieModel = new PieChartModel();
        ChartData data = new ChartData();
        PieChartDataSet dataSet = new PieChartDataSet();
        List<Number> values = new ArrayList<>();
        List<String> bgColors = new ArrayList<>();
        List<String> labels = new ArrayList<>();

        try {
            productos = productoServicio2.obtenerProductos();


            for (Producto2 p : productos) {


                int n1 = (int) (Math.random() * 255) + 0, n2 = (int) (Math.random() * 255) + 0, n3 = (int) (Math.random() * 255) + 0;
                if (p.getCantidad() <= 10) {

                    n1 = 255;
                    n2 = 0;
                    n3 = 0;
                    productosAgotados += 1;


                }

                values.add(p.getCantidad());

                labels.add(p.getNombre());

                bgColors.add("rgb(" + n1 + "," + n2 + "," + n3 + ")");

            }

            dataSet.setData(values);
            dataSet.setBackgroundColor(bgColors);

            data.addChartDataSet(dataSet);
            data.setLabels(labels);

            pieModel.setData(data);

        } catch (Exception e) {
            System.out.println("Error en createPieModel trayendo los productos: " + e.getMessage());
        }
    }


    public void cargarNombres() {


        System.out.println("Entro a cargarNombres");


        for (Producto2 p : productos) {
            nombresProductos.add(p.getNombre());
        }

        System.out.println("Salio de cargarNombres");
    }


    public void ingresarVenta() {
        System.out.println("Entro a ingresarVenta");

        try {
            Producto2 productoVendido = productoServicio2.buscarProducto(nombreProductoSeleccionado);

            int cantidadActual = productoVendido.getCantidad();
            int cantidadVendida = unidadesVendidas;
            System.out.println("Producto vendido " + productoVendido.getNombre() + "Cantidad Vendida " + unidadesVendidas + "Cantidad Actual " + cantidadActual);


            productoVendido.setCantidad(cantidadActual - cantidadVendida);

            System.out.println("Caracteristicas " + productoVendido.getCodigo() + "Unidades restantes : " + productoVendido.getCantidad());
            int e = productoServicio2.actualizarProductoVendido(productoVendido);


            if (e != 0) {
                System.out.println("Valores Actualizados: ");
                FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Alerta", "Se ingreso la venta satisfactoriamente");
                FacesContext.getCurrentInstance().addMessage("mensajeVenta", msg);


            }


        } catch (Exception e) {

            System.out.println("Error en ingresarVenta: " + e.getMessage());

            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Alerta", e.getMessage());
            FacesContext.getCurrentInstance().addMessage("mensajeVenta", msg);
        }
        System.out.println("Salio de  ingresarVenta");

    }

    public void validarExistenciaProductos() {
        System.out.println("Entro a validarExistencias");


        try {
            List<Producto2> productos2 = productoServicio2.obtenerProductos();


            for (Producto2 p : productos2) {
                if (p.getCantidad() <= 10) {
                    color="red";


                }

            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

}


