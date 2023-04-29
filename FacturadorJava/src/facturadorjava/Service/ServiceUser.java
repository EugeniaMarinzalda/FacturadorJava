
package facturadorjava.Service;


import facturadorjava.entidades.User;
import java.util.ArrayList;
import java.util.Scanner;

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

    public void createUserList(User u){ 
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
}
    

