package es.medac.personas.soldados;

import es.medac.personas.Persona;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class General extends Persona {

    public General(String nombre) {

        super(nombre, 2);
        setMultiplicador(generarnumrandom());
        actualizarEstadisticas(getMultiplicador());
        generarEstadisticas();

    }

    public float generarnumrandom() {
        Random random = new Random();
        float limiteInferior = 2.0f;
        float limiteSuperior = 3.0f;
        return limiteInferior + random.nextFloat() * (limiteSuperior - limiteInferior);

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
    public String toString() {
        return "General{" +
                "ID='" + getId() + '\'' +
                ", Ataque=" + getAtaque() +
                ", Defensa=" + getDefensa() +
                ", Salud=" + getSalud() +
                '}';
    }

}

