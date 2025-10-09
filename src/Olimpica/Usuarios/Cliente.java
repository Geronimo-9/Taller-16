package Olimpica.Usuarios;

import Olimpica.Interfaces.InterfazCliente;
import Olimpica.LogisticaCompras.Promociones.Descuentos;
import Olimpica.Productos.Producto;

public class Cliente extends Usuario implements InterfazCliente {
private double dinero;


public Cliente(String nombre,String contraseña){
    super(nombre,contraseña);
}

    public Cliente(String nombre,String contraseña, double dinero){
        this(nombre,contraseña);
        setDinero(dinero);
    }





    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        if(dinero>=0){
            this.dinero = dinero;
        }
    }

    @Override
    public void comprar(Producto p1) {
        System.out.println("Su producto"+p1.getNombre()+"Esta comprado. Que tengas un excelente dia ^_^");
    }

    @Override
    public void agregarCarrito(Producto p1) {
        System.out.println("El producto"+p1.getNombre()+"Ha sigo agregado al carrito");

    }

    @Override
    public void comprarConDescuento(Producto p1, Descuentos d1) {
        System.out.println("Su producto"+p1.getNombre()+"Esta comprado con un descuento de "+d1.getDescuento()*100+"$. Que tengas un excelente dia ^_^");
    }

    @Override
    public void quitarCarrito(Producto p1) {
        System.out.println("El producto "+p1.getNombre()+" Ha sido eliminado");
    }
}
