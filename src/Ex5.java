import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Escriu un programa que demani una quantitat en euros
		 * faci la conversió a dòlars americans.
		 * Primer ha de demanar quants dòlars val un euro.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("Quants dòlars val un euro? ");
		double valorDolarEuro = sc.nextDouble();

		System.out.print("Quantitat de euros a convertir: ");
		double cantidadEuros = sc.nextDouble();

		double totalDolar = cantidadEuros * valorDolarEuro;
		System.out.println("Són " + totalDolar + "$");

		sc.close();
	}

}
