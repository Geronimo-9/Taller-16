package Ejercicio_2.Exportaciones;


import Ejercicio_2.Documento;
import Ejercicio_2.InterfazExportacion.FormatoExportacion;

public class Exportacion implements FormatoExportacion {


    @Override
    public void exportarPdf(Documento file) {
        System.out.println("Su documento es exportado como "+file.getNombre()+".pdf");
    }







}
