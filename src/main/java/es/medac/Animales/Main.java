package es.medac.Animales;

public class Main {
    public static void main(String[] args) {

        Elefante elefante = new Elefante();
        elefante.estadisticasAnimal();
        elefante.mostrarInfoAnimal();

        System.out.println("<------------------>");
        Tigre tigre = new Tigre();
        tigre.estadisticasAnimal();
        tigre.mostrarInfoAnimal();
    }
}

