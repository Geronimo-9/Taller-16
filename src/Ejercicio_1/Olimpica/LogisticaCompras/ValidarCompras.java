package Ejercicio_1.Olimpica.LogisticaCompras;

import Ejercicio_1.Olimpica.Usuarios.Cliente;
import Ejercicio_1.Olimpica.Productos.Producto;

public class ValidarCompras {

    public boolean validarPago(Cliente c1, Producto p1){
        return c1.getDinero() >= p1.calcularTotal();
    }

    public boolean rechazarPago(Cliente c1, Producto p1){
        return c1.getDinero() < p1.calcularTotal();
    }




}
