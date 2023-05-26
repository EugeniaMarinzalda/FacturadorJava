
package facturadorjava;

import Enumeradores.Concept;
import Enumeradores.ConditionFiscal;
import Enumeradores.Condition_Sale;
import Enumeradores.TypeOfReceipt;
import facturadorjava.Service.ServiceReceipt;
import facturadorjava.Service.ServiceUser;
import facturadorjava.entidades.Receipt;
import facturadorjava.entidades.User;
import java.util.Date;
import java.util.Scanner;


public class FacturadorJava {

    public static void main(String[] args) {
        ServiceUser su = new ServiceUser ();
        ServiceReceipt sr =new ServiceReceipt();
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        User u0 = new User("Invalido","0");//defecto
        su.createUserList(u0);
        User u1 = new User("juan perez","123456");//para comenzar con algun valor de prueba
        su.createUserList(u1);
        User u2 = new User("Maria Ruiz","789654");//para comenzar con algun valor de prueba
        su.createUserList(u2);
     

        System.out.println("Bienvenido al Facturador");
        boolean flag = true;
        do {
            System.out.println("Menu \n 1- Registrarse \n 2- Ingresar \n 3- Salir \n 4- Ver Usuarios");
            
            int opc = read.nextInt();
            switch (opc) {
                case 1:
                    su.createUserList(su.createUser()); //creo el usuario y lo agrego a la lista
                    break;
                case 4:
                    su.showList(); //para controlar usuarios, luego borro
                    break;
                case 2:
                    User u = su.userValidation();
                    if (!u.getName().equalsIgnoreCase(u0.getName())) {
                        System.out.println("Bienvenido/a " + u.getName());
                        boolean in = true;
                        do {
                            System.out.println("Menu \n 1- Realizar una factura  \n 2- Mostrar Facturas \n 3- Salir");
                            int resp = read.nextInt();
                            switch (resp) {
                                case 1:
                                    Receipt r =sr.createReceipt();
                                    sr.createReceiptList(r,u);
                                    break;
                                case 2:
                                    su.showList(u);
                                    break;
                                case 3:
                                    System.out.println("Esta abandonando su sesión");
                                    in = false;
                                    break;
                                default:
                                    System.out.println("Opcion Invalida. Intente nuevamente");
                            }                        
                        } while (in); 
                    }
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
