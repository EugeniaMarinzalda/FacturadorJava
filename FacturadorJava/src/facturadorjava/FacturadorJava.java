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
        User us = new User();
        int u = 0;
        Scanner read = new Scanner(System.in);
        System.out.println("Bienvenido al Facturador");
        boolean flag = true;
        do {
            System.out.println("Menu \n 1- Registrarse \n 2- Realizar una factura \n 3- Salir");
            int opc = read.nextInt();
            switch (opc) {
                case 1:
                    ss.createVector(ss.createUser(),u); //genera el usuario y lo agrega al vector
                    break;
                case 2:
                    //ss.userValidation(userVector); // ver paramentros
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
