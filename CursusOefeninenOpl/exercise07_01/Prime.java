package exercise07_01;

public class Prime {
	public static void main(String[] args) {
		final int MAX = 1000;
		int primes[] = new int[MAX / 4];
		int count = 0;

		for (int number = 2; number <= MAX; number++) {
			boolean isPrime = true;
			for (int i = 0; (i < count) && isPrime && ((primes[i]*primes[i]) <= number) ; i++) {
				isPrime = (number % primes[i]) != 0;
			}

			if (isPrime) {
				primes[count++] = number;
			}
		}

		for (int i = 0; i < count; i++) {
			System.out.println(primes[i]);
		}

		System.out.println("Number of primes: " + count);
	}
}