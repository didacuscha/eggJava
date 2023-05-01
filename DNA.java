package helloworld;
import java.util.ArrayList;

public class DNA{
	public static void main(String[] args) {
        
            ArrayList<String> chains = new ArrayList<>();
            chains.add("ATGCGATACTGA");
            chains.add("ATGCGATAGA");
            chains.add("ATGGCTCTAAGTTGA");
            chains.add("TGAGTCTGA");
            chains.add("ATGGCTCTAAGTTGAATGGCTCTAAGTTGA");
            chains.add("ATGGCTCTAAGTTGATGAGTCTGA");
            
            
            for (String subchains : chains) {
                String protein = subchains.substring(3, subchains.length()-3);
            
                if (subchains.startsWith("ATG") && subchains.endsWith("TGA") && protein.length() % 3 == 0){
                System.out.println("valid DNA protein: " + subchains);
 
                } else {
                   System.out.println("invalid DNA protein"); 
                }
            }
 }
}
