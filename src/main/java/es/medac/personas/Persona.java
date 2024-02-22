package es.medac.personas;

import java.io.Serial;
import java.io.Serializable;
import java.util.Random;

public abstract class Persona implements Serializable, IPersona {

    @Serial
    private static final long serialVersionUID = 1L;
    private static final int TOTAL_ATRIBUTOS = 100;


    private String nombre;
    private int ataque;
    private int defensa;
    private int salud;
    private int peso;
    private float multiplicador;

    private final Random random = new Random();

    public Persona() {

        this.nombre = "Nombre";
        generarAtributos();
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

    private void generarAtributos() {

        this.ataque = random.nextInt(TOTAL_ATRIBUTOS);
        this.defensa = random.nextInt(TOTAL_ATRIBUTOS - ataque);
        this.salud = TOTAL_ATRIBUTOS - (ataque + defensa);
    }
}
