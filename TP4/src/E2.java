/* Una empresa de venta de autos usados, paga a su personal de ventas un salario de
$100000 mensuales, más una comisión de $15000 por auto vendido, más el 5% del
valor de venta por auto. Cada mes el capturista de la empresa ingresa en la
computadora los datos necesarios. Desarrollar un programa que calcule e imprima el
salario mensual de un vendedor dado.*/

import javax.swing.*;

public class E2 {
    public static void ejercicio2(){
        JOptionPane.showMessageDialog(null, "El siguiente programa, le ayuda a calcular el salario a pagar de cada vendedor.\nTenga en cuenta que debe ejecutar el programa por cada vendedor para poder realizar de manera correcta el cálculo.");

        int autosVendidos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de autos vendidos:"));

        double base = 100000, comisionPorAuto = 15000, porcentajeComision = 0.05, totalComisionValorAutos = 0;

        if(autosVendidos > 0){
            for (int i = 1; i <= autosVendidos; i++) {
                double valorAuto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de venta del auto " + i + ":"));
                totalComisionValorAutos += valorAuto * porcentajeComision;
            }
        }

        double salarioTotal = base + (comisionPorAuto * autosVendidos) + totalComisionValorAutos;

        JOptionPane.showMessageDialog(null, "El salario del mes en curso para este vendedor es de:\n$" + salarioTotal);
    }
}
