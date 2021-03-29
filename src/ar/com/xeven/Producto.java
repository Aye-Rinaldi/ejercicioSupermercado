package ar.com.xeven;

public class Producto {
    //atributos
    private String nombre;
    private String descripcion;
    private Double precioUnitario;
    private String clasificacion;

    //constructor

    public Producto(String nombre, String descripcion, Double precioUnitario, String clasificacion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.clasificacion = clasificacion;
    }

    //getters y setters
    //nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //descripcion
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    //precio unitario
    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    //clasificacion
    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
}
