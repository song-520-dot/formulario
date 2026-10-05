package modelo;

/** Resultado de una encuesta Richmond (0 a 10 puntos). */
public class Formulario {
    private final int puntos;

    public Formulario(int puntos) {
        if (puntos < 0 || puntos > 10) throw new IllegalArgumentException("La puntuación debe estar entre 0 y 10");
        this.puntos = puntos;
    }

    public int getPuntos() { return puntos; }

    public String getNivel() {
        if (puntos <= 3) return "Baja";
        if (puntos <= 5) return "Dudosa";
        if (puntos <= 7) return "Moderada";
        return "Alta";
    }
}
