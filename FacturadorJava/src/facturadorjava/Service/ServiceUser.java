/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturadorjava.Service;

import facturadorjava.entidades.Receipt;
import facturadorjava.entidades.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author EUGE
 */
public class ServiceUser {
    
    private static Scanner scan = new Scanner(System.in).useDelimiter("\n");
    public ArrayList <User> userList = new ArrayList <>();
    
    public User createUser () {
        System.out.println("Ingrese el nombre de usuario");
        String name = scan.next();
        System.out.println("Ingrese la contraseña");
        String password = scan.next();
        //System.out.println("Nombre: " + name + "\nContraseña: " + password); //para control de usuario
        return new User(name,password);
    }
    
    public User createUserFab (String name,String password) {
        String names = name;
        String passwords = password;
        return new User(names,passwords);
    }

    public void createList(User u){ 
        userList.add(u);
    }
      
    public boolean userValidation (){
        int attempts = 3;
        boolean proof = true;
        boolean flag = true;
        do {
            System.out.println("Ingrese el nombre de usuario");
            String name = scan.next();
            for (int i = 0; i < userList.size(); i++) {
                if (userList.get(i).getName().equalsIgnoreCase(name)) {
                    System.out.println("Ingrese la contraseña");
                    String pas= scan.next();
                    proof=false;
                    if (userList.get(i).getPassword().equalsIgnoreCase(pas)) {
                        System.out.println("Los datos son correctos");
                        flag = false;
                        return true;
                    } else {
                        System.out.println("La contraseña es incorrecta. Intente nuevamente");
                        break;
                    }
                }  
            }
            if (proof) {
                System.out.println("El usuario es incorrecto.");
            }
            proof=true;
            attempts--;
        } while (flag && attempts>0); 
        return false;
    }
    
    public void showList(){
        System.out.println(userList);
    }
    
    public Receipt createReceipt(){
        System.out.println("Ingrese el punto de venta");
        int salesPoint=scan.nextInt();
        System.out.println("Ingrese el Tipo de comprobante \n 1-Factura \n 2-Nota de Credito \n 3-Nota de Debito \n 4-Recibo \n 5-Salir");
        int typeOfReceipt=scan.nextInt();
        Date dateReceipt= new Date();
        System.out.println("Conceptos a Incluir \n 1-Producto \n 2-Servicio \n 3-Producto y Servicio \n 4-Salir");
        int concept=scan.nextInt();
        System.out.println("Datos del comprador:");
        System.out.println("Ingrese la condicion fiscal");
        String condicionFiscalPurchaser=scan.next();
        System.out.println("Ingrese el CUIT");
        long cuitPurchaser=scan.nextLong();
        System.out.println("Ingrese el Nombre y Apellido");
        String namePurchaser=scan.next();
        System.out.println("Ingrese la condicion de venta \n 1-Contado \n 2-Tarjeta credito/debito \n 3-Otro \n 4-Salir");
        int conditionSale=scan.nextInt();
        return new Receipt (salesPoint,typeOfReceipt,dateReceipt,concept,condicionFiscalPurchaser,cuitPurchaser,namePurchaser,conditionSale); 
 
    }

            
}
    

