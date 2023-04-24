package helloworld;
import java.util.Arrays;

public class Arrays {

public static void main(String[] args) {
    String[] arrayy = new String[3];
    arrayy[0] = "kiubu";
    arrayy[1] = "hellou";
    
    int[] arrayyy = new int[5];
    arrayyy[0] = 69;
    arrayyy[1] = 420;
   
    double[] arrayyyy = new double[3];
    arrayyyy[0] = 4.20;
    arrayyyy[1] = 6.9;
    
    System.out.println(arrayy[0] +"-" + arrayy[1]);
    System.out.println(arrayyy[0] +"-" + arrayyy[1]);
    System.out.println(arrayyyy[0] +"-" + arrayyyy[1]);
    System.out.println(arrayyy.length);
    System.out.println(Arrays.toString(arrayy));
    System.out.println(Arrays.toString(arrayyy));
    System.out.println(Arrays.toString(arrayyyy));
        
        
    
 }
}