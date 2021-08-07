public enum Peso {
    IDEAL("Esta en su peso ideal", -1),
    SOBREPESO("debajo de su peso ideal", 0),
    BAJOPESO("esta con sobrepeso", 1);
    private final String pesoTxt;
    private final int numero;

    public String getPesotxt() {
        return pesoTxt;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return ""+numero;
    }

    Peso(String pesotxt, int numero) {
        this.pesoTxt = pesotxt;
        this.numero = numero;
    }
}
