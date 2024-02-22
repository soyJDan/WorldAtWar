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
    private BufferedReader lectorLinea;

    /**
     * variable tipo ArrayList que va a almacenar las lineas de texto
     */
    private ArrayList<String> listaNombresGeneral;
    
    /**
     * variable tipo String que guardara un nombre aleatorio que se obtiene de listaNombresGeneral
     * @see  obtenerNombreGeneral
     */
    private String nombreDeGeneral;

    /**
     * @param rutaFichero
     *
     */
    public GestorFicheroEntrada(String rutaFichero) throws FileNotFoundException {
        this.listaNombresGeneral = new ArrayList<>();
        this.rutaFichero = rutaFichero;
        File fichero = new File(rutaFichero);
        FileReader lectorLetra = new FileReader(fichero);
        this.lectorLinea = new BufferedReader(lectorLetra);
    }

    /**
     * método que lee un archivo y almacenar las lineas en un
     * ArrayList
     */
    public void leerArchivo() throws IOException {

        String linea;
        while ((linea = this.lectorLinea.readLine()) != null) {
            listaNombresGeneral.add(linea);

        }
        lectorLinea.close();
    }

    /**
     * metodo que sirve para seleccionar un número aleatorio del incide del
     * ArrayList listaNombresGeneral y almacena el contenido de dicho indice en la variable
     * nombreDeGeneral
     */
    public void obtenerNombreGeneral() {

        Random random = new Random();
        int indiceGeneralAleatorio = random.nextInt(listaNombresGeneral.size());
        nombreDeGeneral = listaNombresGeneral.get(indiceGeneralAleatorio);
    }

    /**
     *
     * @return nombreDeGeneral
     */
    public String getNombreDeGeneral() {

        return nombreDeGeneral;
    }
}
