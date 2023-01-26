package DAY_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class captcha_2 {
	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("numbers_01");

		Scanner sc = new Scanner(file);

		String line = sc.nextLine();

		char[] numbers = line.toCharArray();

		sc.close();

		int sum = 0;
		

		for (int i = 0; i < numbers.length; i++) {
			int index = i + numbers.length/2; 			// middle array
			
			// EXAMPLE -  length = 2000, index = 0...1999. if index == 2000, then newIndex = 0. if index == 2001, then newIndex == 1
			
			if (index >= numbers.length) {
				index = index % numbers.length;		// remainder of division 
			}
			
			if (numbers[i] == numbers[index]) {		// element array (i) equal element array index (i + numbers.length/2;)

				int a = Integer.parseInt(String.valueOf(numbers[i]));

				sum = sum + a;

			}

		}

		System.out.println("sum of all digits - " + sum);
		
	}

}