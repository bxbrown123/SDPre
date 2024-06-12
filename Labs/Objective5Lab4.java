import java.util.Scanner;

public class Objective5Lab4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Scanner again.
		// Going forward for similiar problems ( if/else/loops 3 steps) Use the Q-A-R formula for explination.
		// Check all previous labs for Q-A formula updates only (non if/else/loops 3 steps).
		int userNum;
		
		// Question. A It's a two sided question. Either this or that, so ese is used.
		System.out.println("Please enter a number: ");
		//Answer.
		userNum = scanner.nextInt();

		//Response.
		if (userNum % 2 == 0) {
			System.out.println("The number is even");	
		} else {
			System.out.println("The number is odd");
		}
	}
}