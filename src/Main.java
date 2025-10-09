import Olimpica.AutenticarUsuario.Autenticar;
import Olimpica.AutenticarUsuario.Validar;
import Olimpica.Usuarios.Cliente;
import Olimpica.LogisticaCompras.DineroDisponible;
import Olimpica.LogisticaCompras.Facturas;
import Olimpica.LogisticaCompras.Mensaje.MensajePantalla;
import Olimpica.LogisticaCompras.ValidarCompras;
import Olimpica.Productos.Producto;
import Olimpica.LogisticaCompras.Promociones.Descuentos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


Scanner teclado = new Scanner(System.in);

//Ejercicio 1, implementar Descuentos fijos sin modificar la clase. (UN "MEGA" PROYECTO INSPIRADOME EN LOS TALLERES PREVIOS)

    Autenticar verificar = new Autenticar();
    Validar validar = new Validar();

    Descuentos promocion = new Descuentos();
    DineroDisponible billetera = new DineroDisponible();
    ValidarCompras compras = new ValidarCompras();

        MensajePantalla m1 = new MensajePantalla();
        Facturas cheques = new Facturas();







        System.out.println("bienvenido al Super Almacen Olimpica");
        System.out.println("Introduce su Usuario");
        String nombre = teclado.nextLine();

        System.out.println("Introduce su Contraseña");
        String contraseña = teclado.nextLine();

       Cliente u1 = new Cliente(nombre, contraseña);

        if(verificar.autenticar(u1)){
            validar.validarAcceso(u1);



            System.out.println("Introduce su saldo disponible");
            double dinero = teclado.nextDouble();

            Cliente u1_Login = new Cliente(nombre, contraseña, dinero);
            u1 = u1_Login;

            //Es una version lineal de prueba, es posible hacerlo realidad. necesito aprender mas conceptos, vamos por mas...


            System.out.println("¿que cantidad desea llevar en su producto?");
            int cantidad = teclado.nextInt();
            teclado.nextLine();

            Producto p1 = new Producto("Alquería","b3497", "7702177009208", 15000, cantidad);



            System.out.println("¿Deseas aplicar descuento? (si/no)");
            String opcionUsuario = teclado.nextLine();

            if(opcionUsuario.equals("si") && compras.validarPago(u1,p1)) {

                u1.comprarConDescuento(p1, promocion);
                cheques.generarFacturaDescuento(p1, u1, billetera, promocion);

            } else if(compras.validarPago(u1,p1) && opcionUsuario.equals("no")){

                u1.comprar(p1);
                cheques.generarFactura(p1,u1,billetera);


            } else if(compras.rechazarPago(u1,p1)){
                m1.MensajeRechazo();
            }


        }else {
            validar.restringir(u1);
        }


        System.out.println("Fin de la version demo del ejercicio 1");







    }
}