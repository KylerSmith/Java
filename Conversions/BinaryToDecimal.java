/**
 * This class converts a Binary number to a Decimal.
 *
 * @author Unknown
 * Modified 07/13/2017, Kyler Smith
 */
import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num, converted = 0;
		System.out.print("Enter binary number: ");
		num = scan.nextInt();

		converted = convert(num);

		System.out.println("Decimal equivalent: " + converted);
		scan.close();
	}

	/**
	 * Function to perform convert
	 *
	 * @param binNum: Binary number to convert to Decimal
	 * @return int
	 */
	public static int convert(int binNum) {

		int converted = 0, power = 0, lsb;

		while(binNum != 0) {
			lsb = binNum % 10;
			converted += lsb * (int) Math.pow(2, power++);
			binNum /= 10;
		}

		return converted;
	}

}
