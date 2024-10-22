public class program1 {

  public static void main(String[] args) {
    // System.out.println(
    //   "Hello, This is my first Java Programming Classes, Nice to meet you all."
    // );
    // System.out.println(2 + 9);
    // variables in java: values in a single variable in Java can keep changing:
    // example
    int number = 90;
    System.out.println(number);
    number = 100;
    System.out.println(number);
    // same variable can be redifined using different values
    number = 'A';
    // but the same variable cannot be redifined using different data types
    System.out.println(number); // if int defined as character then aschii code of the character will be printed
    int passenger = 100;
    passenger = passenger + 200;
    System.out.println(passenger);
    // update the passenger to subtract 10 and add 20;
    passenger = (passenger - 10) + 20;
    System.out.println(passenger);
  }
}
