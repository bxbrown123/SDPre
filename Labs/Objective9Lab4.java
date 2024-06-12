public class Objective9Lab4 {
  public static void main(String[] args) {
    // using scanners again. this one is "kb"
    java.util.Scanner kb = new java.util.Scanner (System.in);

		double num1, num2;

    System.out.print("Please give me a number: ");

		num1 = kb.nextDouble();

		System.out.print("Please give me another number: ");

		num2 = kb.nextDouble();
    // double=decimals.
    double average = findAverage(num1, num2);

    System.out.println("The average of " + num1 + " and " + num2 + " is: " + average);
    // with kb scanner we close here.
    kb.close();

  }
    // method here.
  public static double findAverage(double x, double y)
  {
    double ans = (x + y)/2;

    return ans;
  }
}