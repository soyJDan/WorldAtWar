package es.medac.personas.soldados;

import es.medac.personas.Persona;

import java.io.Serial;

/**
 * Clase Caballeria que hereda de la clase Persona
 *
 * @version 1.0
 * @since 1.0
 * @see Persona
 * @see Infanteria
 * @see General
 *
 * @author Daniel Romero (JDan))
 */
public class Caballeria extends Persona {

    @Serial
    private static final long serialVersionUID = 1L;
    private static final float MULTIPLICADOR = 1.5f;
    private static final int PESO = 2;

    /**
     * Constructor de la clase Caballeria
     */
    public Caballeria() {
        this.setNombre("Caballeria");
        this.setPeso(PESO);
        this.setMultiplicador(MULTIPLICADOR);

        atributosMultiplicador();
    }

    /**
     * Método que recibe daño
     * @param danho daño que recibe
     */
    @Override
    public void recibirDanho(int danho) {
        this.setSalud(this.getSalud() - danho);
    }

    /**
     * Método que multiplica los atributos de la clase Caballeria
     */
    @Override
    public void atributosMultiplicador() {
        this.setAtaque((int) (this.getAtaque() * this.getMultiplicador()));
        this.setDefensa((int) (this.getDefensa() * this.getMultiplicador()));
        this.setSalud((int) (this.getSalud() * this.getMultiplicador()));
    }
}
