/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturadorjava;

import facturadorjava.Service.ServiceUser;
import facturadorjava.entidades.User;
import java.util.Scanner;

/**
 *
 * @author EUGE
 */
public class FacturadorJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiceUser ss = new ServiceUser ();
        ss.createList(ss.createUserFab("juan perez","123456"));//para comenzar con algun valor de prueba
        ss.createList(ss.createUserFab("maria lopez","987654")); // para comenzar con algun valor de prueba
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Bienvenido al Facturador");
        boolean flag = true;
        do {
            System.out.println("Menu \n 1- Registrarse \n 2- Realizar una factura \n 3- Salir \n 4- Mostrar Vector objeto");
            int opc = read.nextInt();
            switch (opc) {
                case 1:
                    ss.createList(ss.createUser()); //creo el usuario y lo agrego a la lista
                    break;
                case 2:
                    ss.userValidation();
                    break;
                case 4:  // modo prueba para analizar el vector
                    ss.showList();
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
