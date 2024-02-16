package es.medac.animales;

import java.util.Random;

/**
 * @author dani
 *2.- Crea una clase abstracta Animal con atributos:
 *
 * Nombre - String
 * Ataque - int  -> La suma ataque + defensa + salud es siempre = 150
 * Defensa - int
 * Salud - int
 * Peso - int
 * Multiplicador - float
 * Crea 2 subclases:
 *
 * Elefante: con un peso de 10, y multiplicador 2
 * Tigre: con un peso de 5 y multiplicador 1'5
 * Los atributos Ataque-Defensa-Salud (suma = 150) ,
 * serán iguales para cada unidad por separado, es decir,
 * dos Elefantes no pueden tener cualidades diferentes.
 * El valor de estos atributos es random, cumpliendo con las condiciones
 * anteriores (suma = 150 e idénticos para cada unidad).
 */
public abstract class Animal {

    // ATRIBUTOS
    Random aleatorios = new Random();
    private String nombre;
    private int ataque;
    private int defensa;
    private int salud;
    private int peso;
    private float multiplicador;

    /**
     * Constructor de la clase Animal
     * @param nombre nombre del Animal
     * @param peso peso del Animal
     * @param multiplicador multiplicador del animal
     */
    public Animal(String nombre, int peso, float multiplicador) {
        this.nombre = nombre;
        this.peso = peso;
        this.multiplicador = multiplicador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public float getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(float multiplicador) {
        this.multiplicador = multiplicador;
    }

    /**
     * Metodo para generar estadisticas aleatorias del animal (Ataque, Defensa y Salud)
      */

    public void estadisticasAnimal() {
        setAtaque(aleatorios.nextInt(150));
        setDefensa(aleatorios.nextInt(150 - getAtaque()));
        setSalud(aleatorios.nextInt(150 - getAtaque()));

        if (getAtaque() + getDefensa() + getSalud() != 150) {
            int diferencia = 150 - (getAtaque() + getDefensa() + getSalud());
            setSalud(getSalud() + diferencia);

        }
    }
    /**
     * Metodo para mostrar toda la informacion del animal
     */
    public abstract void mostrarInfoAnimal();
}




