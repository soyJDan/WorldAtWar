
package es.medac;

/**
 *
 * @author carlo
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GestorFicheroEntrada {
    private List<String> nombresGenerales;

    public GestorFicheroEntrada(String rutaArchivo) {
        nombresGenerales = new ArrayList<>();
        leerNombresGeneralDesdeArchivo(rutaArchivo);
    }

    private void leerNombresGeneralDesdeArchivo(String rutaArchivo) {
        try {
            File archivo = new File(rutaArchivo);
            Scanner scanner = new Scanner(archivo);

            while (scanner.hasNextLine()) {
                String nombreGeneral = scanner.nextLine();
                nombresGenerales.add(nombreGeneral);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public String obtenerNombreGeneralAlAzar() {
        if (nombresGenerales.isEmpty()) {
            return "No hay nombres de generales disponibles.";
        }

        Random random = new Random();
        int indiceAleatorio = random.nextInt(nombresGenerales.size());
        return nombresGenerales.get(indiceAleatorio);
    }

}

