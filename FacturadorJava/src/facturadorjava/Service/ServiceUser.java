/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturadorjava.Service;

import facturadorjava.entidades.User;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author EUGE
 */
public class ServiceUser {
    
    public static Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    public User createUser () {
        System.out.println("Ingrese el nombre de usuario");
        String name = scan.next();
        System.out.println("Ingrese la contraseña");
        String password = scan.next();
        //System.out.println("Nombre: " + name + "\nContraseña: " + password); //para control de usuario
        return new User(name,password);
    }
    /*public static void createVector(User u){ 
        ArrayList <User> userList = new ArrayList <>(); 
        userList.add(u);
    }*/
    public static void userValidation (User [] userVector ){
        boolean flag = true;
        do {
            System.out.println("Ingrese el nombre de usuario");
            String name = scan.next();
            for (int i = 0; i < userVector.length ; i++) {
                if (name.equalsIgnoreCase(userVector[i].getName())) {
                    System.out.println("Ingrese la contraseña");
                    String pas= scan.next();
                    if (pas.equalsIgnoreCase(userVector[i].getPassword())) {
                        System.out.println("Los datos son correctos");
                        flag = false;
                        break;
                        //return true;
                    } else {
                        System.out.println("La contraseña es incorrecta. Intente nuevamente");
                        break;
                    }
                } 
            }
        } while (flag);   
            
    }
    
    public void showVector(User [] userVector){
        for (int i = 0; i < userVector.length; i++) {
            if (userVector[i] != null) {
                System.out.println("Usuario " + i + "- Nombre: " + userVector[i].getName() + " Contraseña: " + userVector[i].getPassword() );
            }
        }
    }
}
    

