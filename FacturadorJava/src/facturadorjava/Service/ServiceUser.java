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
      
    public void userValidation (){
        int attempts = 3;
        boolean proof = false;
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
                        break;
                    } else {
                        System.out.println("La contraseña es incorrecta. Intente nuevamente");
                        break;
                    }
                }  
            }
            if (proof) {
                System.out.println("El usuario es incorrecto.");
            }
            attempts--;
        } while (flag && attempts>=0);   
    }
    
    public void showList(){
        System.out.println(userList);
    }
}
    

