
public class Problem2 {

	public static void main(String[] args) {

		int number = 1;
		int sum = 0;
		int factorial = 0;
		for (int i = 0; i < 10; i++) {
			sum += i;
			factorial = sum + i;
			System.out.println(sum);
			System.out.println(factorial);
		}
	}

}
