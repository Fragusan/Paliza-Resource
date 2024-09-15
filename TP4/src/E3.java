//Hacer un programa que calcule el cuadrado de una suma y lo muestre por pantalla.
import javax.swing.*;

public class E3 {
    public static void ejercicio3(){
        int num1, num2, resultado;
        JOptionPane.showMessageDialog(null, "El siguiente programa, le ayuda a calcular el cuadrado de la suma de dos números.");
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número:"));
        resultado = (num1+num2)*(num1+num2);
        JOptionPane.showMessageDialog(null,"El cuadrado de la suma es igual a: " + resultado);
    }
}
