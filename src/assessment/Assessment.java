package assessment;

import java.util.Scanner;

public class Assessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num;
		int choice;
		while (true) {
			System.out.println("Welcome to Cool gaming");
			System.out.println("1. Call of Warfare   - ₹1500 ");
			System.out.println("2. Speed Racers      - ₹1200  ");
			System.out.println("3. Mystery Mansion   - ₹1000  ");
			System.out.println("4. Pixel Adventure   - ₹800   ");
			System.out.println("5. Puzzle Mania      - ₹500 ");
			System.out.println("6. Checkout / Exit  ");
			choice = scanner.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("how many copies ");
				num = scanner.nextInt();
				System.out.println("Game(s) added to your cart!");
				break;

			}
			case 2: {
				System.out.println("how many copies ");
				num = scanner.nextInt();
				System.out.println("Game(s) added to your cart!");
				break;

			}
			case 3: {
				System.out.println("how many copies ");
				num = scanner.nextInt();
				System.out.println("Game(s) added to your cart!");
				break;

			}
			case 4: {
				System.out.println("how many copies ");
				num = scanner.nextInt();
				System.out.println("Game(s) added to your cart!");
				break;

			}
			case 5: {
				System.out.println("how many copies ");
				num = scanner.nextInt();
				System.out.println("Game(s) added to your cart!");
				break;

			}
			case 6: {
				System.out.println("Checkout / Exit");
				System.exit(0);
				break;
			}
			default:
				System.err.println("Invalid number");

			}

		}

	}

}
