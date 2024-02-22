package es.medac.personas.soldados;

import es.medac.personas.Persona;

import java.io.Serial;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class General extends Persona {

    @Serial
    private static final long serialVersionUID = 1L;
    private static final int PESO = 1;
    private static final Random random = new Random();

    public General() {
        this.setNombre("General");
        this.setPeso(PESO);
        this.setMultiplicador(generarMultiplicador());

        atributosMultiplicador();
    }

    @Override
    public void recibirDanho(int danho) {
        setSalud(getSalud() - danho);
    }

    @Override
    public void atributosMultiplicador() {

        this.setAtaque((int) (getAtaque() * getMultiplicador()));
        this.setDefensa((int) (getDefensa() * getMultiplicador()));
        this.setSalud((int) (getSalud() * getMultiplicador()));
    }

    private float generarMultiplicador() {
        BigDecimal df = BigDecimal.valueOf(random.nextFloat(2f, 3f));
        return Float.parseFloat(String.valueOf(df.setScale(2, RoundingMode.DOWN)));
    }
}
