package es.medac.personas.soldados;

import es.medac.personas.Persona;

import java.util.concurrent.ThreadLocalRandom;

public class Caballeria extends Persona {
    public Caballeria(int peso) {
        super(2, 1.5f);
        generarEstadisticas();
        actualizarEstadisticas(getMultiplicador());
    }

    @Override
    public void generarEstadisticas() {

        setAtaque(ThreadLocalRandom.current().nextInt(10, 99 + 1));
        setDefensa(Estadisticas_Random.nextInt(100 - getAtaque()));
        setSalud(Estadisticas_Random.nextInt(100 - getAtaque() + getDefensa()));
        if (getAtaque() + getDefensa() + getSalud() != 100) {
            int diferencia = 100 - (getAtaque() + getDefensa() + getSalud());
            setSalud(getSalud() + diferencia);

        }
    }
    @Override
    public  String toString() {
        return "Caballería{" +
                "ID='" + getId() + '\'' +
                ", Ataque=" + getAtaque() +
                ", Defensa=" + getDefensa() +
                ", Salud=" + getSalud() +
                '}';
    }

}
