public class Gato {
    //region atributos
    public String raza;
    public int edad;
    public String nombre;
    public int id;
    public boolean esAdoptado;
    //endregion

    //region constructores
    Gato() {
        esAdoptado=false;
        raza="no especificado";
        edad=-1;
        nombre="no especificado";
        id= -1;
    }

    Gato(String raza, int edad, String nombre, int id) {
        esAdoptado=false;
        this.raza = raza;
        this.edad = edad;
        this.nombre = nombre;
        this.id = id;
    }
    //endregion

    //region metodos
    public String serAdoptado(){
       return "soy "+nombre+ " y fui adoptado";
    }

    public int aumemtarEdad(){
        return edad++;
    }

    @Override
    public String toString(){
        return "id :"+id+" nombre : "+nombre+ " edad: "+edad+ " raza: "+raza+" es adoptado: "+esAdoptado;

    }
    //endregion

}


