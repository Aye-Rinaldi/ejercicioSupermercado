package ar.com.xeven;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    //atributos
    private List<Item> items;
    private String nombre;
    private Boolean jubilado;
    private LocalDate fechaNacimiento;

    //constructor
    public Cliente(String nombre,LocalDate fechaNacimiento,Boolean jubilado){
        items = new ArrayList<>();
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.jubilado = jubilado;
    }

    //getters y setters
    //items
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
    //nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //jubilado
    public Boolean getJubilado() {
        return jubilado;
    }

    public void setJubilado(Boolean jubilado) {
        this.jubilado = jubilado;
    }
    //fecha nacimiento
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    //METODOS
    //EL CLIENTE AGREGA ITEMS A SU CARRITO, EN BASE A SU CANTIDAD Y PRODUCTO
    public void agregarItem(int cantidad,Producto producto){
        items.add(new Item(cantidad,producto));
    }

    //INFORMAR EL PRECIO TOTAL DE LA COMPRA
    public Double calcularTotal(){
        Double total = 0.0;
        for (Item i:items){
            total += i.getCantidad()*i.getProducto().getPrecioUnitario();
        }
        if (jubilado){
            total -= total*0.15;
        }

        //si es el cumple
        LocalDate hoy = LocalDate.now(); //ahora
        int esteAnio = hoy.getYear(); //a hoy le pido el anio y me da este anio
        int mesCumple = fechaNacimiento.getMonthValue();
        int diaCumple = fechaNacimiento.getDayOfMonth();
        Boolean cumpleAnios = hoy.equals(LocalDate.of(esteAnio,mesCumple,diaCumple));
        //equals devuelve un booleano y compara una fecha que es hoy; con otra fecha creada a paritr de este anio, el mes de cumple\
        //y el dia del cumple

        //otra forma
        //LocalDate.now().getDayOfYear() == fechaNacimiento.getDayOfYear();

        //otra forma: en la que se contempla anio bisiesto
        /*
        int diaActual = hoy.getDayOfMonth();
        int mesActual = hoy.getMonthValue();

        if (diaActual == diaCumple && mesActual == mesCumple)
            total -= total * 0.10;
         */

        if (cumpleAnios){
            total -= total*0.10;
        }
        return total;


    }
}
