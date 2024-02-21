package es.medac.personas;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Persona {
    public Random Estadisticas_Random = new Random(10 - 100);
    private int ataque;
    private int id;
    private int defensa;
    private int salud;
    private int peso;
    private float multiplicador;
    private String nombre;

    //Nos quedamos con uno de los constructores y luego adaptamos el constructor al proyecto.
    public Persona(String nombre, int peso) {
        this.nombre = nombre;
        this.peso = peso;
        this.multiplicador = 1;
        generarEstadisticas();

    }

    public Persona(int peso, float multiplicador) {
        this.id = generarid(id);
        this.peso = peso;
        this.multiplicador = multiplicador;


    }

    public void generarEstadisticas() {
        ataque = ThreadLocalRandom.current().nextInt(10, 99 + 1);
        defensa = Estadisticas_Random.nextInt(100 - getAtaque());
        salud = Estadisticas_Random.nextInt(100 - getAtaque() + getDefensa());
        int diferencia = 100 - (getAtaque() + getDefensa() + getSalud());
        setSalud(getSalud() + diferencia);
    }

    public void actualizarEstadisticas(float multiplicador) {
        ataque = (int) (ataque * multiplicador);
        defensa = (int) (defensa * multiplicador);
        salud = (int) (salud * multiplicador);

    }

    public int generarid(int id) {

        return id = ThreadLocalRandom.current().nextInt(1000, 9999 + 1);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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


}