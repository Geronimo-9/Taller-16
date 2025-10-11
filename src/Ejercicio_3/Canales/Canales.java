package Ejercicio_3.Canales;

import Ejercicio_3.Mensajero;

public class Canales implements CanalesEnvio {

    @Override
    public void enviarEmail(Mensajero m1) {
        System.out.println("Enviando por Email el mensaje: "+m1.getMensaje());
    }

    @Override
    public void enviarSMS(Mensajero m1) {
        System.out.println("Enviando por SMS el mensaje: "+m1.getMensaje());
    }

    @Override
    public void enviarWhatsApp(Mensajero m1) {
        System.out.println("Enviando por WhatsApp mensaje: "+m1.getMensaje());
    }
}
