package Ejercicio_1.Olimpica.LogisticaCompras.Mensaje;

import Ejercicio_1.Olimpica.LogisticaCompras.Mensaje.InterfazMensajes.Mensajes;

public class MensajePantalla implements Mensajes {


    public void MensajeRechazo(){
        System.out.println("Lo sentimos mucho, no cuentas con el saldo suficiente");
    }

}
