package DAY_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class captcha_1 {
	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("numbers_01");

		Scanner sc = new Scanner(file);

		String line = sc.nextLine();

		char[] numbers = line.toCharArray();

		sc.close();

		int sum = 0;
		

		for (int i = 0; i < numbers.length - 1; i++) {

			if (numbers[i] == numbers[i + 1]) {

				int a = Integer.parseInt(String.valueOf(numbers[i]));

				sum = sum + a;

			}

		}

		if (numbers[numbers.length-1] == numbers[0]) {

			int a = Integer.parseInt(String.valueOf(numbers[0]));

			sum = sum + a;

		}

		System.out.println("sum of all digits - " + sum);
	}

}