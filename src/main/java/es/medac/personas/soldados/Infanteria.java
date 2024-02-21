package es.medac.personas.soldados;

import es.medac.personas.Persona;

import java.util.concurrent.ThreadLocalRandom;

public class Infanteria extends Persona {
    public Infanteria(int ID) {
        super(1, 1f);
        generarEstadisticas();
        actualizarEstadisticas(getMultiplicador());


    }

    @Override
    public void generarEstadisticas() {
        setAtaque(ThreadLocalRandom.current().nextInt(10, 99 + 1));
        setDefensa(Estadisticas_Random.nextInt(100 - getAtaque()));
        setSalud(Estadisticas_Random.nextInt(100 - getAtaque() + getDefensa()));
        if (getAtaque() + getAtaque() + getAtaque() != 100) {
            int diferencia = 100 - (getAtaque() + getDefensa() + getSalud());
            setSalud(getSalud() + diferencia);

        }
    }

    @Override
    public String toString() {
        return "Infanteria{" +
                "ID='" + getId() + '\'' +
                ", Ataque=" + getAtaque() +
                ", Defensa=" + getDefensa() +
                ", Salud=" + getSalud() +
                '}';
    }

    }
