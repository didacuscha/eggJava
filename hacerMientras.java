package helloworld;
import java.util.Scanner;

public class hacerMientras {
    public static void main (String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int suma = 0;
        int counter = 0;
        
        do { 
            System.out.println("Ingrese los numeros");
            int numer = leer.nextInt();
            if (numer>0) {
                suma+=numer;
            }
            counter++;
        } while(counter != 20);
            System.out.println("la suma de los numeros es " + suma);
        
    }
            
}