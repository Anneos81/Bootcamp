import java.util.*;

public class Quotient {
	public static int calcQuotient(int numerator, int denominator) throws Exception {
		if (denominator == 0) {
			throw new ArithmeticException();
		}
		return numerator / denominator;
	}

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		boolean allGood = false;
		while (!allGood) {
			try {
				System.out.println("Give me two numbers, first the numerator:");
				int num1 = input.nextInt();
				int num2 = input.nextInt();
				int apotelesma = calcQuotient(num1, num2);
				System.out.println(apotelesma);
				allGood = true;
			} catch (ArithmeticException e) {
				System.out.println("Division with zero!!!");
				input.nextLine();// oste na mporesei na janadextei ta int num1,num2 h scanner
			} catch (InputMismatchException ex) {
				System.out.println("Wrong input, Give number!");
			    input.nextLine();
			}
		}
	}
}