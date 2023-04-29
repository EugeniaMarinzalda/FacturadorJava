
package facturadorjava;

import facturadorjava.Service.ServiceReceipt;
import facturadorjava.Service.ServiceUser;
import java.util.Date;
import java.util.Scanner;


public class FacturadorJava {

    public static void main(String[] args) {
        ServiceUser su = new ServiceUser ();
        ServiceReceipt sr =new ServiceReceipt();
        su.createUserList(su.createUserFab("juan perez","123456"));//para comenzar con algun valor de prueba
        su.createUserList(su.createUserFab("maria lopez","987654")); // para comenzar con algun valor de prueba
        sr.createReceiptList(sr.createReceiptFab(0002, 1, new Date(), 1, "Responsable Inscripto", 304561236,"Empresa sa" , 3));// para comenzar con algun valor de prueba
        sr.createReceiptList(sr.createReceiptFab(0001, 2, new Date(), 2, "Responsable Monotributo", 2074125896,"Pedro Marmol" , 1));// para comenzar con algun valor de prueba
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Bienvenido al Facturador");
        boolean flag = true;
        do {
            System.out.println("Menu \n 1- Registrarse \n 2- Realizar una factura \n 3- Salir \n 4- Mostrar Lista Usuario\n 5- Mostrar Lista Factura");
            int opc = read.nextInt();
            switch (opc) {
                case 1:
                    su.createUserList(su.createUser()); //creo el usuario y lo agrego a la lista
                    break;
                case 2:
                    if (su.userValidation()) {
                        sr.createReceiptList(sr.createReceipt());
                    }
                    break;
                case 4:  // modo prueba para analizar la lista de usuario
                    su.showList();
                    break;
                case 5:  // modo prueba para analizar la lista de comprobantes
                    sr.showList();
                    break;
                case 3:
                    System.out.println("Gracias por utilizar el servicio.");
                    flag = false;
                    break;
                default:
                    System.out.println("Opcion Incorrecta. Intente Nuevamente");
            }
        } while (flag);
    } 
}
