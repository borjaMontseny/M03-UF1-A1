import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Escriu un programa que demani una quantitat en pessetes
		 * i faci la conversió a euros.
		 * [ euro = pessetes / 166,386 ]
		 */

		System.out.print("Introdueix la quantitat de pessetes a convertir a €: ");
		Scanner sc = new Scanner(System.in);
		double pessetes = sc.nextDouble();

		double valorEuroPesseta = 166.386;

		double resultatEuros = pessetes / valorEuroPesseta;

		System.out.println("Són " + resultatEuros + "€");

		sc.close();

	}

}
