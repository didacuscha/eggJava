public class Droid {
    int batteryLevel;
    String droidName;

  public Droid(String name) {
    droidName = name;
    batteryLevel = 100;
  }

  public String toString(){
    return "Hi I'm" + droidName + ", nice to meet you";
  }

  public int batteryLevel(){
    return batteryLevel;
  }

  public void performTask(String task) {
   System.out.println(droidName + " is performing task: " + task);
   int newBatteryLevel = batteryLevel - 10;
   batteryLevel = newBatteryLevel;
   System.out.println("Performing tasks is tiring! Battery is now: " + batteryLevel);
  }

  public void energyReport() {
    System.out.println("Battery level: " + batteryLevel);
  }

  public void energyTransfer(Droid otherDroid) {
    int tempBatteryLevel = this.batteryLevel;
    this.batteryLevel = otherDroid.batteryLevel;
    otherDroid.batteryLevel = tempBatteryLevel;
    System.out.println(this.droidName + " and " + otherDroid.droidName + " have exchanged battery levels.");
}


  public static void main(String[] args) {
    Droid Codey = new Droid("Codey");
    Droid Tumai = new Droid("Tumai");
    System.out.println(Codey.toString());
    System.out.println(Codey.batteryLevel());
    Codey.performTask("Smoking weed");
    Codey.performTask("Jerk off");
    Codey.energyReport();
    Tumai.energyReport();
    Codey.energyTransfer(Tumai);
    Codey.energyReport();
    Tumai.energyReport();
  }
}