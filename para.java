package helloworld;
import java.util.Scanner;

public class para {
    public static void main(String[] args) {
        
        String str = "*";
        
        for (int i=0; i<4; i++){
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese un numero del 1 al 20");
            
            int numbra = leer.nextInt();
            
            String repeatedStr = str.repeat(numbra);
            
            System.out.println(numbra + " " + repeatedStr);
     
        }
        
    }
}