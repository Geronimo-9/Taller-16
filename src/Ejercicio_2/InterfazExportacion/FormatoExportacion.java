package Ejercicio_2.InterfazExportacion;

import Ejercicio_2.Documento;

public interface FormatoExportacion {

    void exportarPdf(Documento file);
    void exportarHtml(Documento file);
    void exportarTexto(Documento file);
    void exportarExcel(Documento file);
    void exportarWord(Documento file);
    void exportarPowerPoint(Documento file);
}
