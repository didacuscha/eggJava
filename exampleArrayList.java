/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworld;

import java.util.ArrayList;

/**
 *
 * @author AndreaCardenasT
 */
/* public class exampleArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("Python");
        list.add("RubyOnRails");
        System.out.println("List size: " + list.size());
        System.out.println("First element: "+ list.get(0));
        list.remove(1);
        System.out.println("List after removing Python: " + list);
    }
}
*/

public class exampleArrayList {
    

public static void main(String[] args) {
    ArrayList<String> numeriques = new ArrayList<>();
    
    String cuatroVeinte = "Medellin";
    String seisNueve = "Cali";
    String cuatroOchoNueve = "Bogota";
           
    numeriques.add(cuatroVeinte);
    numeriques.add(seisNueve);
    numeriques.add(cuatroOchoNueve);
    
    System.out.println(numeriques);
    System.out.println(numeriques.size());
    
    numeriques.add("Kali Uchis");
    System.out.println(numeriques.size());
    System.out.println(numeriques.get(1));
    
    numeriques.set(0, "Adam Beyer");
    System.out.println(numeriques.get(0));
    System.out.println(numeriques.get(3));
    // numeriques.remove("Kali Uchis");
    System.out.println(numeriques.indexOf("Kali Uchis"));
    
 }

}