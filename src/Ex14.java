import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Introdueix un enter: ");
		Scanner sc = new Scanner(System.in);

		int valorA = sc.nextInt();

		System.out.print("Introdueix un segon enter: ");
		int valorB = sc.nextInt();

		valorA = valorA / valorB;

		valorB = valorA % valorB;

		System.out.println("\nvalorA = " + valorA + " | valorB = " + valorB);

		sc.close();
	}

}
