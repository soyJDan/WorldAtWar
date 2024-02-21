package es.medac.reader;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 * proyecto WorldAtWar clase utilizada para leer de un fichero de texto y
 * devolver un valor aleatorio
 *
 * @author Carlos Antonio Pavón Marín
 * @version 2.0
 */
public class GestorFicheroEntrada {

    /**
     * variable que almacena la ruta de donde se va a leer el fichero
     */
    private String rutaFichero;
    /**
     * variable que almacena un objeto tipo BufferedReader utilizar esta
     * variable hará que se lea linea por linea un fichero de texto
     */
    private BufferedReader br;
    
    /**
     * variable tipo ArrayList que va a almacenar las lineas de texto 
     */
    private ArrayList<String> nombreGeneral;

    /**
     * @param rutaFichero
     *
     */
    public GestorFicheroEntrada(String rutaFichero) throws FileNotFoundException {
        this.rutaFichero = rutaFichero;
        File lector = new File(rutaFichero);
        FileReader fr = new FileReader(lector);
        this.br = new BufferedReader(fr);
    }

    /**
     * método que sirve para leer un archivo y almacenar las lineas en un
     * ArrayList
     */
    public void leerArchivo() throws IOException {
        nombreGeneral = new ArrayList<>();
        String linea;
        while ((linea = this.br.readLine()) != null) {
            nombreGeneral.add(linea);
        }

    }

    /**
     * metodo que sirve para seleccionar un número aleatorio del incide del
     * ArrayList y almacena el contenido de dicho indice en la variable
     * nombreDeGeneral
     */
    public void obtenerNombreGeneral() {

        Random random = new Random();
        String nombreDeGeneral;
        int indiceGeneralAleatorio = random.nextInt(nombreGeneral.size());
        nombreGeneral.get(indiceGeneralAleatorio);
        nombreDeGeneral = nombreGeneral.get(indiceGeneralAleatorio);
        System.out.println(nombreDeGeneral);

    }
}
