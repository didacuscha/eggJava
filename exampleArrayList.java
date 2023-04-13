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
public class exampleArrayList {
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
