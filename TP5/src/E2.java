//Solicitar el ingreso de la nota de un alumno de 0 a 10 y mostrar por pantalla de la
//siguiente forma: Insuficiente – Suficiente – Bien – Notable - Sobresaliente.

import javax.swing.*;

public class E2 {
    public static void nota(){
        double nota;
        JOptionPane.showMessageDialog(null, "Inició el Sistema de calificaciones");
        nota = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese la nota del alumno\n(Rango permitido 0 - 10)"));
        switch ((int) nota){
            case 1:
            case 2:
                JOptionPane.showMessageDialog(null, "La nota del alumno es Insuficiente");
                break;
            case 3:
            case 4:
                JOptionPane.showMessageDialog(null, "La nota del alumno es Suficiente");
                break;
            case 5:
            case 6:
                JOptionPane.showMessageDialog(null, "La nota del alumno es Bien");
                break;
            case 7:
            case 8:
                JOptionPane.showMessageDialog(null, "La nota del alumno es Notable");
                break;
            case 9:
            case 10:
                JOptionPane.showMessageDialog(null, "La nota del alumno es Sobresaliente");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Número no válido. El ingreso permitido es entre 0 y 10.");
                break;
        }
    }
}
