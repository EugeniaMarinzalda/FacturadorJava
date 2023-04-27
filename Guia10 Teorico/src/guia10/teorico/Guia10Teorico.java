/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10.teorico;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author EUGE
 */
public class Guia10Teorico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> listado = new ArrayList();
        listado.add(1);
        listado.add(2);
        listado.add(3);
        listado.add(4);
        listado.add(5);
        listado.remove(0);
        listado.remove(5);
                
        TreeSet<String> nombre = new TreeSet();
        nombre.add("pepe");
        nombre.add("noel");
        nombre.add("jose");
        nombre.add("Pedro");
        nombre.add("Juan");
        nombre.remove("pepe");
        
        HashMap<Integer,String> personas = new HashMap<>();
        personas.put(1589, "Pepe");
        personas.put(3568, "Pepe");
        personas.put(3598, "Pepe");
        personas.put(1784, "Pepe");
        personas.put(6941, "Pepe");
        personas.remove(1784);
        
        HashMap<Integer,String> persona = new HashMap<>();
        String n1 = "Albus";
        String n2 = "Severus";
        personas.put(123,n1);
        personas.put(124,n2);
        
        ArrayList<String>bebidas = new ArrayList();
        bebidas.add("café");
        bebidas.add("té");
        for (String bebida:bebidas) {
            System.out.println(bebida);
        }
        Iterator<String> it =bebidas.iterator();
        while (it.hasNext()){
            if (it.next().equals("café")){
                it.remove();
            }
        }
        for (String bebida:bebidas) {
            System.out.println(bebida);
        }
        
        
    }
}
