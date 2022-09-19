
public class Problem1 {

	public static void main(String[] args) {
		// 1 - Encontrar multiplos de 3, 5 abaixo de 1000;
		// 2 - Soma todos eles;

		int multiplo3 = 0;
		int multiplo5 = 0;
		
		for (int i = 0; i < 1000; i++) {
			if (i % 3 == 0) {
				multiplo3 += i;
			} else if (i % 5 == 0) {
				multiplo5 += i;
			}
		}
		
		int sum = multiplo3 + multiplo5;
		
		System.out.println("3: " + multiplo3);
		System.out.println("5: " + multiplo5);
		System.out.println("Soma: " + sum);

	}

}
