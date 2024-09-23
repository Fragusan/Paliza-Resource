//Desarrollar un programa que simule el funcionamiento de una calculadora que
//pueda realizar cuatro operaciones aritméticas (suma, resta, producto y división) con
//dos valores numéricos enteros. El usuario debe especificar la operación con el
//primer carácter de un valor a ingresar desde la línea de comandos: S o s para la
//suma; R o r para la resta; M o m para la multiplicación y D o d para la división

import javax.swing.*;

public class E3 {

    public static int suma(int a, int b){return a+b;}
    public  static  int resta(int a, int b){ return a-b;}
    public  static int producto(int a, int b){ return a*b;}
    public  static int division(int a, int b){ return a/b;}

    public static void calculadora(){
        int num1, num2;
        String operacion;
        char opcion;
        JOptionPane.showMessageDialog(null, "El siguiente es un programa de calculadora básico");
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el primer número a operar\nSolo se aceptan números enteros"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el segundo número a operar\nSolo se aceptan números enteros"));
        operacion= JOptionPane.showInputDialog("Ingrese la operación a realizar:\nS o S para la suma.\nR o r para la resta.\nM o m para la multiplicación.\nD o d para la división.");
        operacion=operacion.toUpperCase();//normalización
        opcion=operacion.charAt(0);//interpretando solo el primer caracter
        switch (opcion){
            case 'S':
                JOptionPane.showMessageDialog(null, "El resultado de sumar "+num1+" con "+num2+" es :"+suma(num1, num2));
                break;
            case 'R':
                JOptionPane.showMessageDialog(null, "El resultado de restar "+num1+" con "+num2+" es :"+resta(num1, num2));
                break;
            case 'M':
                JOptionPane.showMessageDialog(null, "El resultado de multiplicar "+num1+" con "+num2+" es :"+producto(num1, num2));
                break;
            case 'D':
                if(num2!= 0){
                    JOptionPane.showMessageDialog(null, "El resultado de dividir "+num1+" con "+num2+" es :"+division(num1, num2));
                    break;
                }else{
                    JOptionPane.showMessageDialog(null, "No es posible dividir por 0");
                    break;
                }
            default:
                JOptionPane.showMessageDialog(null, "La opción ingresada es incorrecta\nNo se encuentra asosiada a ninguna operación");
        }

    }
}
