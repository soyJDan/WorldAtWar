package es.medac.animales;


class Elefante extends Animal {
    /**
     * Subclase elefante con peso 10 por determinado y multiplicador x2
     */
    public Elefante() {
        super("Elefante", 10, 2.0f);
    }

    @Override
    public void mostrarInfoAnimal() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Ataque: " + getAtaque());
        System.out.println("Defensa: " + getDefensa());
        System.out.println("Salud: " + getSalud());
        System.out.println("peso: " + getPeso());
        System.out.println("Multiplicador: " + getMultiplicador());
    }

    @Override
    public void estadisticasAnimal() {
        setAtaque(aleatorios.nextInt(150));
        setDefensa(aleatorios.nextInt(150 - getAtaque()));
        setSalud(aleatorios.nextInt(150 - getAtaque()));

        if (getAtaque() + getDefensa() + getSalud() != 150) {
            int diferencia = 150 - (getAtaque() + getDefensa() + getSalud());
            setSalud(getSalud() + diferencia);
        }

    }
}
