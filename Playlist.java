package helloworld;

import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

    desertIslandPlaylist.add("Yesterday- The Beatles");
    desertIslandPlaylist.add("Jubel- Klindandle");
    desertIslandPlaylist.add("Money- Pink Floyd");
    desertIslandPlaylist.add("The times they are a changing- Bob Dylan");
    desertIslandPlaylist.add("Blue- Eiffel 65");
    desertIslandPlaylist.add("Lights out- Fred Again");

    System.out.println(desertIslandPlaylist);
    System.out.println("size: " + desertIslandPlaylist.size());
    desertIslandPlaylist.remove(2);
    System.out.println("size: " + desertIslandPlaylist.size());

    String favorite = desertIslandPlaylist.get(0);
    String lessFavorite = desertIslandPlaylist.get(4);
    desertIslandPlaylist.set(0, lessFavorite);
    desertIslandPlaylist.set(4, favorite);

    System.out.println(desertIslandPlaylist.indexOf("Yesterday- The Beatles"));
    System.out.println(desertIslandPlaylist.indexOf("Lights out- Fred Again"));

   // HUs to expand the project  
   // HU1 = another playlist for videos, movies or series.
   //HU2 = shuffle on the playlist.(with a method)
   //HU3 = reverse song order
  }
  
}