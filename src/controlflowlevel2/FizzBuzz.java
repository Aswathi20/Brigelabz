package controlflowlevel2;
import java.util.Scanner;
public class FizzBuzz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int n = sc.nextInt();

		if (n > 0) {
			System.out.println("FizzBuzz Sequence:");
			for (int i = 1; i <= n; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println("FizzBuzz");
				} else if (i % 3 == 0) {
					System.out.println("Fizz");
				} else if (i % 5 == 0) {
					System.out.println("Buzz");
				} else {
					System.out.println(i);
				}
			}
		} else {
			System.out.println("Please enter a positive integer.");
		}
	}
}
