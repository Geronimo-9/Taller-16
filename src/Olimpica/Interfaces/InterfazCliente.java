package Olimpica.Interfaces;
import Olimpica.LogisticaCompras.Promociones.Descuentos;
import  Olimpica.Productos.Producto;
public interface InterfazCliente {
    void comprar(Producto p1);
    void agregarCarrito(Producto p1);
    void quitarCarrito(Producto p1);
    void comprarConDescuento(Producto p1, Descuentos d1);
}
