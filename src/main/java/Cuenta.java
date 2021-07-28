public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public Cuenta(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "titular='" + titular + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
    //region metodos


    public void ingresarDinero(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        }

    }

    public void retirarPlata(double cantidad) {
        if (this.cantidad - cantidad < 0) {
            this.cantidad = 0;
        } else if (cantidad > 0) {
            this.cantidad -= cantidad;
        }
    }


    //endregion


}

