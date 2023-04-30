package helloworld;

public class Review {
  
  public static void main(String[] args) {
    
   /* System.out.println("Welcome to Bleu \nPlease enter your username and password");
    String password = "KiubuBubu";
    System.out.println(password);
    String passwordTry = "kiubububu";
    if (passwordTry.equals(password.toLowerCase())){
      System.out.println("Logged in succesfully");
    } else {
      System.out.println("F&*% you men");
    }
*/


    String degiheugi = "There Ain't nothing Left to Do";
    String WhoMadeWho = "THERE Ain't nothing Left to Do";
    System.out.println(degiheugi.charAt(9));
    System.out.println(degiheugi.substring(12, 20));
    
    System.out.println(degiheugi.length());
    System.out.println(degiheugi.concat(". This is an amazing song."));

    System.out.println(degiheugi.indexOf("nothing"));
    
    if (degiheugi.equalsIgnoreCase(WhoMadeWho)) {
    System.out.println("hi I'just used the function equals() '");
  }
 }
}