package Olimpica.LogisticaCompras;

import Olimpica.Usuarios.Cliente;
import Olimpica.LogisticaCompras.Promociones.Descuentos;
import Olimpica.Productos.Producto;

public class Facturas {

    public void generarFactura(Producto p1, Cliente u1, DineroDisponible d1){
         System.out.println("Nombre producto: "+p1.getNombre());
         System.out.println("Ref: "+p1.getReferencia());
         System.out.println("Precio: "+p1.getCantidad());
         System.out.println("Total: "+p1.calcularTotal());
        System.out.println("Dinero disponible : "+u1.getDinero());
        System.out.println("Vuelto Restante: "+d1.descontarDinero(u1,p1));
        System.out.println("Cod. Barra: "+p1.getCodigoBarra());
        System.out.println("Nombre Cliente : "+u1.getNombre());
         System.out.println("Nombre producto: "+p1.getNombre());

    }

    public void generarFacturaDescuento(Producto p1, Cliente u1, DineroDisponible d1, Descuentos totalDescuento){
        System.out.println("Nombre producto: "+p1.getNombre());
        System.out.println("Ref: "+p1.getReferencia());
        System.out.println("Precio: "+p1.getCantidad());
        System.out.println("Total: "+p1.calcularTotal());
        System.out.println("Descuento aplicado: "+totalDescuento.getDescuento()*100+"%");
        System.out.println("Total con descuento aplicado: "+totalDescuento.descontarProducto25(p1));
        System.out.println("Dinero disponible : "+u1.getDinero());
        System.out.println("Vuelto Restante: "+d1.descontarConPromocion25(u1,p1,totalDescuento));
        System.out.println("Cod. Barra: "+p1.getCodigoBarra());
        System.out.println("Nombre Cliente : "+u1.getNombre());
        System.out.println("Nombre producto: "+p1.getNombre());

    }
}
