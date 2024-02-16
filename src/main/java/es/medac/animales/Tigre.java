package es.medac.animales;


class Tigre extends Animal {
    /**
     * Subclase tigre con peso por determinado 5 y multiplicador x1.5
     */
    public Tigre() {
        super("Tigre", 5, 1.5f);
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
        setSalud(aleatorios.nextInt(150 - (getDefensa() + getAtaque())));

        if (getAtaque() + getDefensa() + getSalud() != 150) {
            int diferencia = 150 - (getAtaque() + getDefensa() + getSalud());
            setSalud(getSalud() + diferencia);
        }
    }
}
