package Olimpica.LogisticaCompras;

import Olimpica.Usuarios.Cliente;
import Olimpica.Productos.Producto;

public class ValidarCompras {

    public boolean validarPago(Cliente c1, Producto p1){
        return c1.getDinero() >= p1.calcularTotal();
    }

    public boolean rechazarPago(Cliente c1, Producto p1){
        return c1.getDinero() < p1.calcularTotal();
    }




}
