package assessment;

import java.util.Scanner;

public class AssessmentQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = scanner.nextInt();
		int originalNumber = num;
		int reversedNumber = 0;

		while (num != 0) {
			int digit = num % 10;
			reversedNumber = reversedNumber * 10 + digit;
			num /= 10;
		}

		if (originalNumber == reversedNumber) {
			System.out.println(originalNumber + " is a palindrome.");
		} else {
			System.out.println(originalNumber + " is not a palindrome.");
		}

		scanner.close();
	}
}
