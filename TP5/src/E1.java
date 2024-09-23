// En un comercio se aplica un 20% de descuento a los clientes cuya compra supere
//los $5000. ¿Cuál será la cantidad de dinero que abonará una persona por su compra?

import javax.swing.*;

public class E1 {
    public static void compra(){
        double totalSinPromo, totalConPromo=0;
        JOptionPane.showMessageDialog(null, "Inició el Programa de promociones de compra");
        totalSinPromo = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese el monto total de la compra del cliente: "));
        if (totalSinPromo > 5000){
            totalConPromo = ( totalSinPromo - ((totalSinPromo/10)*2));
        }else{
            totalConPromo =totalSinPromo;
        }
        JOptionPane.showMessageDialog(null,"El total a abonar por su compra es de $" + totalConPromo);

    }
}
