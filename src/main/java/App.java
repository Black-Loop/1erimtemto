import javax.swing.*;
import java.util.ArrayList;
import java.util.HashSet;

public class App {
    public static void main(String[] args) {
        boolean salir = false;
        String menu =
                "MENU :\n"
                        + "1.mostrar\n"
                        + "2.ingresar\n"
                        + "3.mostrar peso ideal\n"
                        + "4.Salir\n"
                        + "Elige una opcion";
        String menu2 =
                "Elige un metodo de ingreso :\n"
                        + "1.solo dni\n"
                        + "2.nombre,edad,sexo\n"
                        + "3.todos los datos\n"
                        + "elige una opcion";
        int respuesta, respuesta2;
        String nombre;
        int edad;
        String dni;
        char sexo;
        double peso;
        double altura;
        HashSet<Persona> personas = new HashSet<Persona>();
        Persona person = null;

        while (!salir) {
            respuesta = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (respuesta) {
                case 1:
                    for (Persona persona : personas) {
                        JOptionPane.showMessageDialog(null, persona);
                    }
                    break;
                case 2:
                    respuesta2 = Integer.parseInt(JOptionPane.showInputDialog(menu2));
                    switch (respuesta2) {
                        case 1:
                            dni = JOptionPane.showInputDialog("imgresa tu dmi :");
                            person = new Persona(dni);
                            personas.add(person);
                            break;
                        case 2:
                            nombre = JOptionPane.showInputDialog("imgresa tu nombre");
                            edad = Integer.parseInt(JOptionPane.showInputDialog("imgresa tu edad :"));
                            sexo = JOptionPane.showInputDialog("imgresa tu sexo :").charAt(0);
                            person = new Persona(nombre, edad, sexo);
                            personas.add(person);
                            break;
                        case 3:
                            nombre = JOptionPane.showInputDialog("imgresa tu nombre");
                            edad = Integer.parseInt(JOptionPane.showInputDialog("imgresa tu edad :"));
                            dni = JOptionPane.showInputDialog("imgresa tu dmi :");
                            sexo = JOptionPane.showInputDialog("imgresa tu sexo :").charAt(0);
                            peso = Double.parseDouble(JOptionPane.showInputDialog("imgresa tu peso :"));
                            altura = Double.parseDouble(JOptionPane.showInputDialog("imgrresa tu altura :"));
                            person = new Persona(nombre, edad, dni, sexo, peso, altura);
                            personas.add(person);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "ingrese uma opcion correcta");
                            break;
                    }
                    break;
                case 3:
                    for (Persona persona : personas) {
                        JOptionPane.showMessageDialog(null, persona);
                    }
                    dni = JOptionPane.showInputDialog("imgrese el dmi :");
                    for (Persona persona : personas) {
                        if (dni.equals(persona.getDni())) {
                            JOptionPane.showMessageDialog(null, persona.esPesoIdeal());
                        }
                    }


                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "ingrese uma opcion correcta");
            }

        }

    }
}