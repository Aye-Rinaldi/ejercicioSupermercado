package ar.com.xeven;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Supermercado {

    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();
        List<Producto> productos = new ArrayList();

        //agrego los clientes
        clientes.add(new Cliente("eric", LocalDate.of(2020,1,30),false));
        clientes.add(new Cliente("anna",LocalDate.of(2015,3,12),true));
        clientes.add(new Cliente("samantha",LocalDate.of(2010,8,14),true));
        clientes.add(new Cliente("pablo",LocalDate.of(2011,5,8),false));

        //agrego productos del supermercado
        productos.add(new Producto("banana","desc",20.0,"comida"));
        productos.add(new Producto("manzana","desc",25.0,"comida"));
        productos.add(new Producto("plato","desc",80.0,"bazar"));
        productos.add(new Producto("lavandina","desc",15.0,"limpieza"));

        //al cliente le agrego items a su carrito(clase Item)
        clientes.get(0).agregarItem(10,productos.get(0));//al cliente 1 le agrego 10 bananas
        clientes.get(0).agregarItem(25,productos.get(1));//al cliente 1 le cargo 25 manzanas
        clientes.get(1).agregarItem(20,productos.get(2));//al cliente 2 le cargo 20 platos


        //GASTO DE LOS CLIENTES
        Cliente cliente0 = clientes.get(0);
        Cliente cliente1 = clientes.get(1);
        System.out.println("El cliente 0 va a gastar: "+cliente0.calcularTotal());
        System.out.println("El cliente 1 va a gastar: "+cliente1.calcularTotal());
    }
}
