package Ejercicio_1.Olimpica.LogisticaCompras.Promociones;


import Ejercicio_1.Olimpica.Productos.Producto;

public class Descuentos implements Ejercicio_1.Olimpica.LogisticaCompras.InterfazDescuentos.Descuentos {
private double descuento = 0.25;

    public double getDescuento() {
        return descuento;
    }

    @Override
    public double descontarProducto25(Producto p1) {
        return p1.calcularTotal()-(p1.calcularTotal()*descuento);
    }
}
