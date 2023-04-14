package helloworld;
import java.util.Scanner;

public class remplaza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        String replacedString = "";
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            if (c == 'a' || c == 'A') {
                replacedString = replacedString.concat("@");
            } else if (c == 'e' || c == 'E') {
                replacedString = replacedString.concat("#");
             } else if (c == 'i' || c == 'I') {
                replacedString = replacedString.concat("$");
            } else if (c == 'o' || c == 'O') {
                replacedString = replacedString.concat("%");
            } else if (c == 'u' || c == 'U') {   
                replacedString = replacedString.concat("*");
            } else {
                replacedString = replacedString.concat(String.valueOf(c));
            }
        }
        System.out.println("Replaced string: " + replacedString);
    }
}

