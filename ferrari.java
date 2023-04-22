package helloworld;

public class ferrari {
    String colorType;
    boolean EV;
    int maxSpeed;
    int milesDriven;
    
    public ferrari(String color, boolean electric, int velocity) {
        System.out.println("Brum Brummmm BRRRRRUMMMMM");
        colorType = color;
        EV = electric;
        maxSpeed = velocity;   
        milesDriven = 0;
    }
    
    public void startEngine(){
        System.out.println("Supercar started! engine status: IGNITED");
        
    }
    
    public int modelYear() {
        int year = 2024;
        return year;
    }
    
    public String toString() {
        return "This car is a " + colorType + " car";
    }
    
    public void startRadio(double stationNum, String stationName) {
    System.out.println("Turning on the radio to " + stationNum + ", " + stationName + "!");
    System.out.println("Enjoy!");
    }
    
    public int drive(int milesDriven) {
        
        int trip = milesDriven + 0;
        milesDriven = trip;
        String message = "You drove: " + milesDriven + " miles";
        System.out.println(message);
        return milesDriven;
    }
    
    public void stopEngine(){
        System.out.println("You've reached your destination, engine off");
    }
    
public static void main(String[] args){  
    
    System.out.println("Start of the main method.");
    ferrari testarossa = new ferrari("yellow", false, 300);
    ferrari SP48 = new ferrari("red", true, 320);
    System.out.println(testarossa);
    System.out.println(SP48);
    System.out.println(testarossa.colorType + " - " + testarossa.EV + " - " + testarossa.maxSpeed);
    System.out.println(SP48.colorType + " - " + SP48.EV + " - " + SP48.maxSpeed);
    
    testarossa.startEngine();
    testarossa.startRadio(420.69, "420 Times");
    testarossa.drive(250);
    testarossa.stopEngine();
    System.out.println("model: " + testarossa.modelYear());
    
  }

}