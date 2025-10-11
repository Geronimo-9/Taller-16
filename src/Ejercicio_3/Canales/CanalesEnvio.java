package Ejercicio_3.Canales;

import Ejercicio_3.Mensajero;

public interface CanalesEnvio {

    void enviarEmail(Mensajero m1);
    void enviarSMS(Mensajero m1);
    void enviarWhatsApp(Mensajero m1);

}
