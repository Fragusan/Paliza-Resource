import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //JOptionPane.showMessageDialog(null, "Ingrese una opción valida por favor:\n 1- Primer Ejercicio\n 2- Segundo Ejercicio\n 3- Tercer Ejercicio");

        String[] options = {"1_ Primer Ejercicio", "2_ Segundo Ejercicio", "3_ Tercer Ejercicio", "4_ Salir"};

        int seleccion = JOptionPane.showOptionDialog(
                null,
                "Seleccione una opción:",
                "Menú Trabajo Practico N°4",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options,
                options[0]
        );

        switch (seleccion) {
            case 0:
                JOptionPane.showMessageDialog(null, "Has elegido el Primer Ejercicio.");
                E1.ejercicio1();
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Has elegido el Segundo Ejercicio.");
                E2.ejercicio2();
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Has elegido el Tercer Ejercicio.");
                E3.ejercicio3();
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "No se seleccionó una opción válida.");
                break;
        }

    }

}