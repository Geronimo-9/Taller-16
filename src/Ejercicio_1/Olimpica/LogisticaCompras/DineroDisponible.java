package Ejercicio_1.Olimpica.LogisticaCompras;

import Ejercicio_1.Olimpica.Usuarios.Cliente;
import Ejercicio_1.Olimpica.Productos.Producto;
import Ejercicio_1.Olimpica.LogisticaCompras.Promociones.Descuentos;
public class DineroDisponible {



    public double descontarDinero(Cliente c1, Producto p1){
        return c1.getDinero()-p1.calcularTotal();
    }

    public double descontarConPromocion25(Cliente c1,Producto p1, Descuentos d1){
        return c1.getDinero()-d1.descontarProducto25(p1);
    }


    public double devolverDinero(Cliente c1, Producto p1){
        return c1.getDinero()+ p1.calcularTotal();
    }


}
