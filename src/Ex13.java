import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Introdueix hores: ");
		Scanner sc = new Scanner(System.in);
		int numHores = sc.nextInt();

		System.out.print("Introdueix minuts: ");
		int numMinuts = sc.nextInt();

		System.out.print("Introdueix segons: ");
		int numSegons = sc.nextInt();

		// Convertim hores a segons
		System.out.println(numHores + " hores són " + (numHores * 3600) + " segons");

		// Convertim minuts a segons
		System.out.println(numMinuts + " minuts són " + (numMinuts * 60) + " segons");

		// Presentem segons
		System.out.println(numSegons + " segons");

		sc.close();

	}

}
