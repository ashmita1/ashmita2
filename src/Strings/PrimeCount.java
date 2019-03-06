package Strings;

public class PrimeCount {
	public static void main(String args[]) {

		int number = 2;
		int count = 0;
		long sum = 0;
		while (count < 1000) {
			if (CheckforPrime(number)) {
				sum += number;
				count++;
			}
			number++;
		}
		System.out.println("Sum of first thousand prime number is : " + sum);
	}

	private static boolean CheckforPrime(int number) {
		int i = 2;
		while (i <= number / 2) {
			if (number % i == 0) {
				System.out.println("Not a prime number"+number);
				return false;
			}
			i++;
		}
		return true;
	}
}
