public class Objective7Lab4 {
	public static void main(String [] args) {
		// once again 20 times
		// every iteration will have will have the previous added to the next.
		// ex 1+2+3
		// the variable will be constantly updated replacing the last.
		int count = 1;
		
		int sum = 0;

		while(count <= 20) {
			sum = sum + count;
			count = count + 1;
		}
		
		// Prints ONLY the final sum.
		System.out.println(sum);
	}
}