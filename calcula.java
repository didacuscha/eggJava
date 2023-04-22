package helloworld;

class calcula {
//Simple calculator that adds, substracts, multiplies, divides or modules two integers you can modify on the main() method.
  public calcula(){
      
  }

  public int add(int a, int b){
    int add = a + b;
    return add;
  }

  public int substract(int a, int b){
    int substract = a - b;
    return substract;
  }

  public int multiply(int a, int b){
    int multiply = a * b;
    return multiply;
  }

  public double divide(int a, int b) {
    double divide = a / b;
    return divide;
  }

  public int modulo(int a, int b) {
    int modulo = a % b;
    return modulo;
  }

  public static void main(String[] args) {
    calcula myCalculator = new calcula();
    System.out.println(myCalculator.add(69, 420));
    System.out.println(myCalculator.substract(69, 420));
    System.out.println(myCalculator.multiply(69, 420));
    System.out.println(myCalculator.divide(420, 69));
    System.out.println(myCalculator.modulo(420, 69));
  }
}