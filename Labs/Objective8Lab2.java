public class Objective8Lab2 {
	public static void main(String[] args) {
		// Loop time. We are doing increase for every iteration. 1-20.
		
		int currentSum = 0;

		// Here go up 1 + 2 + 3 ... + 20 = 210. Smilar to a previous lab.

		for (int controlVar = 1; controlVar <= 20; controlVar ++) {
			currentSum = currentSum + controlVar;
		}
		System.out.println(currentSum);
	}
}