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
        //User us = new User();
        int dim = 5; // para 5 usuarios - ver despues para que no sea fijo
        int position = 0;
        User[] userVector = new User[dim];
        userVector[0]= new User("juan perez","123456");
        userVector[1]= new User("maria lopez","987654");
        position = 2;
        Scanner read = new Scanner(System.in);
        System.out.println("Bienvenido al Facturador");
        boolean flag = true;
        do {
            System.out.println("Menu \n 1- Registrarse \n 2- Realizar una factura \n 3- Salir \n 4- Mostrar Vector objeto");
            int opc = read.nextInt();
            switch (opc) {
                case 1:
                    userVector[position]=ss.createUser();// en la posicion agrega el usuario
                    position++;
                    break;
                case 2:
                    ServiceUser.userValidation(userVector);
                    break;
                case 4:  // modo prueba para analizar el vector
                    ss.showVector(userVector);
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

    private static User User(String maria_lopez, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
