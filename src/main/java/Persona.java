public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;

    public Persona() {
        this.nombre = "";
        this.dni = generarDni();
        this.sexo = 'H';
        this.edad = 0;
        this.altura = 0;
        this.peso = 0;
    }

    public Persona(String dni) {
        this.nombre = "";
        this.dni = dni;
        this.sexo = 'H';
        this.edad = 0;
        this.altura = 0;
        this.peso = 0;
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.dni = generarDni();
        this.altura = 0;
        this.peso = 0;
    }

    public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }


    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = comprobarSexo(sexo);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularIMC() {
        double resultado;
        resultado = this.peso / this.altura * this.altura;
        return resultado;
    }

    public Peso esPesoIdeal() {
        if (calcularIMC() < 20) {
            return Peso.IDEAL;
        } else if (calcularIMC() >= 20 && calcularIMC() <= 25) {
            return Peso.BAJOPESO;
        } else {
            return Peso.SOBREPESO;
        }
    }

    public boolean esMayorDeEdad() {
        return (this.edad > 17);
    }

    private char comprobarSexo(char sexo) {
        if (sexo == 'H' || sexo == 'M') {
            return sexo;
        } else {
            return 'H';
        }
    }

    private String generarDni() {
        int numero;
        StringBuilder dni = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            numero = (int) (Math.random() * 9 + 0);
            dni.append(numero);
        }
        return dni.toString();
    }

    public String edadMomvre() {
        return edad + nombre;
    }


    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
