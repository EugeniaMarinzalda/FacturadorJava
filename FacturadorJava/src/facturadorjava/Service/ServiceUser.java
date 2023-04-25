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
    
    public Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    public User createUser () {
        System.out.println("Ingrese el nombre de usuario");
        String name = scan.next();
        System.out.println("Ingrese la contraseña");
        String password = scan.next();
        System.out.println("Nombre: " + name + "\nContraseña: " + password);
        return new User(name,password);
    }

    /*public static void createVector(User u){ 
        ArrayList <User> userList = new ArrayList <>(); 
        userList.add(u);
    }*/
    public static void createVector(User us, int u){
        User [] userVector = new User [u+1];
        userVector[u]= us;
        u++; // probar que arranque desde ese valor
        
    }

    public boolean userValidation ( User[] userVector ){
        
        
            System.out.println("Ingrese el nombre de usuario");
            String name = scan.next();
            for (int i = 0; i < userVector.length ; i++) {
                if (name.equals(userVector[i].getName())) {
                    System.out.println("Ingrese la contraseña");
                    String pas= scan.next();
                    if (pas.equals(userVector[i].getPassword())) {
                        System.out.println("Los datos son correctos");
                        return true;
                        
                    } else {
                        System.out.println("La contraseña es incorrecta.Intente nuevamente");
                        break;
                    }
                } else {
                    System.out.println("Usuario invalido. Intente nuevamente");
                    break;
                }
            }
            return false;
        }
    
}
    

