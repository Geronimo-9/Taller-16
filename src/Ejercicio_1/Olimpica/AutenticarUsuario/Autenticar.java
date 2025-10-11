package Ejercicio_1.Olimpica.AutenticarUsuario;

import Ejercicio_1.Olimpica.Usuarios.Cliente;

public class Autenticar {
    private Cliente u1;


    public boolean autenticar(Cliente u1){
        return u1.getNombre().equals("Geronimo") && u1.getContraseña().equals("Mijares01");
    }

}
