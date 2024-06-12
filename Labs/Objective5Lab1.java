public class Objective5Lab1 {
  public static void main(String[] args) {

    int num1 = 5;
    int num2 = 15;

   // Goes through first statement, if fails, next.
    // We are using more braces now for each individual statement. 
    //Make sure to close of each one in addition to the above two in class/main. Combined = 4.
  
    if(num1 > num2) {
      System.out.println(num1 + " is greater than " + num2); 
    }  
    else if(num2 > num1) {
      System.out.println(num2 + " is greater than " +num1);
    }
  }
}