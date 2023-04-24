package helloworld;

import java.util.ArrayList;

class List {
  
  public static void main(String[] args) {
    ArrayList<String> coachella = new ArrayList<String>();
    coachella.add("Kali Uchis");
    coachella.add("Gorillaz");
    coachella.add("Adam Beyer");
    coachella.add("Blink 182");
    coachella.add("Fred Again & Skrillex");

  System.out.println(coachella.size());
  System.out.println(coachella.get(4));
  coachella.set(1, "Camelphat");
  coachella.remove(4);
  System.out.println("size: " + coachella.size());
  System.out.println(coachella.get(1));
  System.out.println(coachella.indexOf("Adam Beyer"));


  }   
}