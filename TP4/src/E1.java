/*Elaborar un programa que calcule e imprima por pantalla el salario semanal de un
empleado a partir de sus horas semanales trabajadas y de su salario por hora.*/
import javax.swing.*;

public class E1 {
    public static void ejercicio1(){
        int num1, num2;
        double paga, resultado;
        JOptionPane.showMessageDialog(null, "El siguiente programa, le ayuda a calcular el salario semanal de un empleado.");
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese las horas trabajadas por día: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese los días trabajados por semana: "));
        paga = Double.parseDouble(JOptionPane.showInputDialog(null, "Por favor ingrese su salario por hora trabajada: "));
        resultado = (paga*num1)*num2;
        JOptionPane.showMessageDialog(null,"Su salario semanal es de $" + resultado);
    }
}