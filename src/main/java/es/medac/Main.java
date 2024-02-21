package es.medac;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
      GestorFicheroEntrada lector = new GestorFicheroEntrada("C:\\Users\\carlo\\Desktop\\rutaArchivoXml\\generales.txt");
   lector.leerArchivo();
   lector.obtenerNombreGeneral();
    }
}