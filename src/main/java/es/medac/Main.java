package es.medac;

import es.medac.personas.Persona;
import es.medac.personas.soldados.Caballeria;
import es.medac.personas.soldados.General;
import es.medac.personas.soldados.Infanteria;
import es.medac.reader.GestorFicheroEntrada;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
      //GestorFicheroEntrada lector = new GestorFicheroEntrada("C:\\Users\\carlo\\Desktop\\rutaArchivoXml\\generales.txt");
   //lector.leerArchivo();
   //lector.obtenerNombreGeneral();

        Persona persona = new General();

        System.out.println(persona.getNombre());
        System.out.println(persona.getAtaque());
        System.out.println(persona.getDefensa());
        System.out.println(persona.getSalud());
        System.out.println(persona.getPeso());
        System.out.println(persona.getMultiplicador());
    }
}