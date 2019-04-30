package githubstuff;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int pass = 8;
		int seat = 4;

		do {
			System.out.println("Do you want a window seat? Y or N");
			String window = in.next();
			if (window.equals("Y")) {
				seat--;
			}
			pass--;
			System.out.println("passengers left: " + pass);
			System.out.println();
			System.out.println("number of window seats left: " + seat);
			System.out.println();
		} while (pass > 0 && seat > 0);

		if (seat <= 0) {
			System.out.println("No window seats available");
			System.out.println();
			System.out.println("passengers left: " + pass);
			System.out.println();
		}
		do {
			System.out.println("Do you want to reserve an aisle seat? Y or N");
			String window = in.next();
			if (window.equals("Y")) {
				pass--;
				System.out.println();
				System.out.println("passengers left: " + pass);
			}
		} while (pass > 0);
		if (pass == 0)
			;
		System.out.println("No more seats available.");

		in.close();
	}
}
