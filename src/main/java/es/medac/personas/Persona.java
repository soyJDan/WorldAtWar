package es.medac.personas;

import java.util.Random;

/* 1.- Crea una clase abstracta Persona con atributos:

Nombre - String
Ataque - int  -> La suma ataque + defensa + salud es siempre = 100
Defensa - int
Salud - int
Peso - int
Multiplicador - float
Crea 3 subclases:

Soldado Infantería: con un peso de 1, y multiplicador 1
Soldado Caballería: con un peso de 2 y multiplicador 1'5
General: con un peso de 1 y un multiplicador random entre 2 y 3.
Los atributos Ataque-Defensa-Salud (suma = 100) , serán iguales para cada unidad por separado,
 es decir, dos soldados de Infantería no pueden tener cualidades diferentes. El valor de estos atributos es random,
  cumpliendo con las condiciones anteriores (suma = 100 e idénticos para cada unidad).*/
public abstract class Persona {
    private int ataque;
    private int ID;
    private int defensa;
    private int salud;
    private int peso;
    private float multiplicador;
    private Random Estadisticas_Random = new Random();
    private String nombre;

    public Persona(String nombre, int peso , float multiplicador) {

        this.nombre = nombre;
        this.peso = peso;
        this.multiplicador = multiplicador;


    }

    public Persona(int ID, int peso, float multiplicador) {

        this.ID = ID;
        this.peso = this.peso;
        this.multiplicador = this.multiplicador;


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

    public void generarEstadisticas() {
        ataque = Estadisticas_Random.nextInt(100);
        defensa = Estadisticas_Random.nextInt(100 - getAtaque());
        salud = Estadisticas_Random.nextInt(100 - getAtaque() + getDefensa());
        int diferencia = 100 - (getAtaque() + getDefensa() + getSalud());
        setSalud(getSalud() + diferencia);
    }


}


