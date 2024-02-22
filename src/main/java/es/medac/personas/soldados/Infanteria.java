package es.medac.personas.soldados;

import es.medac.personas.Persona;

import java.io.Serial;

/**
 * Clase Infanteria que hereda de la clase Persona
 *
 * @version 1.0
 * @since 1.0
 * @see Persona
 * @see Caballeria
 * @see General
 *
 * @author Daniel Romero (JDan)
 */
public class Infanteria extends Persona {

    @Serial
    private static final long serialVersionUID = 1L;
    private static final float MULTIPLICADOR = 1f;
    private static final int PESO = 1;

    public Infanteria() {
        this.setNombre("Infanteria");
        this.setPeso(PESO);
        this.setMultiplicador(MULTIPLICADOR);

        atributosMultiplicador();
    }

    @Override
    public void recibirDanho(int danho) {
        setSalud(getSalud() - danho);
    }

    @Override
    public void atributosMultiplicador() {
        setAtaque((int) (getAtaque() * getMultiplicador()));
        setDefensa((int) (getDefensa() * getMultiplicador()));
        setSalud((int) (getSalud() * getMultiplicador()));
    }
}
