package Olimpica.AutenticarUsuario;

import Olimpica.Usuarios.Cliente;

public class Validar {


    //Este testing necesita una actualizacion futura donde se implemente el rol definido de inicio seccion.
    public void validarAcceso(Cliente u1){
        System.out.println("Iniciastes seccion como "+u1.getNombre());
        System.out.println("Rol: Cliente");
    }

    public void restringir(Cliente u1){
        System.out.println("Lo sentimos mucho, la informacion suministrada es incorrecta, vuelvelo a intentar");
    }



}
