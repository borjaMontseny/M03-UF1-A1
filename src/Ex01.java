import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Escriu un programa que llegeixi dos nombres decimals i escrigui la seva suma.

		System.out.print("Introdueix el primer valor: ");
		Scanner sc = new Scanner(System.in);
		double valor1 = sc.nextDouble();

		System.out.print("Introdueix el segon valor: ");
		double valor2 = sc.nextDouble();

		System.out.println("El resultat de la suma es " + (valor1 + valor2));

		sc.close();
	}

}
