package Olimpica.LogisticaCompras.Mensaje;

import Olimpica.LogisticaCompras.Mensaje.InterfazMensajes.Mensajes;

public class MensajePantalla implements Mensajes {


    public void MensajeRechazo(){
        System.out.println("Lo sentimos mucho, no cuentas con el saldo suficiente");
    }

}
