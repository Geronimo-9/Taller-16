import Ejercicio_1.Olimpica.AutenticarUsuario.Autenticar;
import Ejercicio_1.Olimpica.AutenticarUsuario.Validar;
import Ejercicio_1.Olimpica.Usuarios.Cliente;
import Ejercicio_1.Olimpica.LogisticaCompras.DineroDisponible;
import Ejercicio_1.Olimpica.LogisticaCompras.Facturas;
import Ejercicio_1.Olimpica.LogisticaCompras.Mensaje.MensajePantalla;
import Ejercicio_1.Olimpica.LogisticaCompras.ValidarCompras;
import Ejercicio_1.Olimpica.Productos.Producto;
import Ejercicio_1.Olimpica.LogisticaCompras.Promociones.Descuentos;
import Ejercicio_2.Documento;
import Ejercicio_2.Exportaciones.Exportacion;
import Ejercicio_3.Canales.Canales;
import Ejercicio_3.Mensajero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);


/*


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




        */


        //Ejercicio 2, Exportar archivos de varios formatos y ofimatica.

        Exportacion formato = new Exportacion();
        Documento archivo = new Documento("System32_Pirateado");

         formato.exportarPdf(archivo);
         formato.exportarExcel(archivo);
         formato.exportarHtml(archivo);
         formato.exportarPowerPoint(archivo);
         formato.exportarWord(archivo);
         formato.exportarTexto(archivo);





         //Ejercicio 3 Sistema de envio de mensajes


        Mensajero mensaje = new Mensajero("Hola profe. ¿Qué le parecio la version Buffeada del ejercicio 1?");
        Canales canal = new Canales();

        canal.enviarEmail(mensaje);













    }
}