public class Mixed {
	public static void main(String[] args) {
		// for loop
		for (int i = 1; i <= 5; i++) {
			System.out.println("for: " + i);
		}

		// while loop
		int i = 1;
		while (i <= 5) {
			System.out.println("while: " + i);
			i++;
		}

		// do-while loop
		i = 1;
		do {
			System.out.println("do-while: " + i);
			i++;
		} while (i <= 5);

		// enhanced for loop
		int[] numbers = {1, 2, 3, 4, 5};
		for (int number : numbers) {
			System.out.println("enhanced for: " + number);
		}

		// nested loop
		for (int row = 1; row <= 2; row++) {
			for (int column = 1; column <= 3; column++) {
				System.out.println("nested: row " + row + ", column " + column);
			}
		}
	}
}
