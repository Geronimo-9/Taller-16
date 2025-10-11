package Ejercicio_2.Exportaciones;


import Ejercicio_2.Documento;
import Ejercicio_2.InterfazExportacion.FormatoExportacion;

public class Exportacion implements FormatoExportacion {


    @Override
    public void exportarPdf(Documento file) {
        System.out.println("Su documento es exportado como "+file.getNombre()+".pdf");
    }
    @Override
    public void exportarHtml(Documento file) {
        System.out.println("Su documento es exportado como "+file.getNombre()+".html");
    }

    @Override
    public void exportarExcel(Documento file) {
        System.out.println("Su documento es exportado como "+file.getNombre()+".xlsx");
    }

    @Override
    public void exportarPowerPoint(Documento file) {
        System.out.println("Su documento es exportado como "+file.getNombre()+".pptx");
    }

    @Override
    public void exportarTexto(Documento file) {
        System.out.println("Su documento es exportado como "+file.getNombre()+".txt");
    }

    @Override
    public void exportarWord(Documento file) {
        System.out.println("Su documento es exportado como "+file.getNombre()+".docs");
    }

}
