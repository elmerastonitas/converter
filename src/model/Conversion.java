package model;

public abstract class Conversion {
    protected String unidadInicial;
    protected String unidadFinal;

    public Conversion(String unidadInicial, String unidadFinal) {
        this.unidadInicial = unidadInicial;
        this.unidadFinal = unidadFinal;
    }

    public abstract double convertir(double valor);

    public String getUnidadInicial() {
        return unidadInicial;
    }

    public String getUnidadFinal() {
        return unidadFinal;
    }
}
