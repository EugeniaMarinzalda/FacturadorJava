
package facturadorjava.entidades;

import java.util.ArrayList;

public class User {
    private String name;
    private String password;
    private ArrayList <Receipt> Receipts;
   

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
        this.Receipts = new ArrayList ();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Receipt> getReceipts() {
        return Receipts;
    }

    public void setReceipts(ArrayList<Receipt> Receipts) {
        this.Receipts = Receipts;
    }

    @Override
    public String toString() {
        return  "Nombre=" + name + ", Contraseña=" + password + "\nComprobantes=" + Receipts + "\n" ;
    }
    
    
}
   