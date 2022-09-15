import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Demana a l'usuari la base i l'altura d'un triangle
		 * (demana cada un per separat).
		 * Calcula l'àrea del triangle utilitzant la següent fórmula:
		 * [ area = base × height / 2 ]
		 */

		System.out.print("Introdueix la base del triangle: ");
		Scanner sc = new Scanner(System.in);
		double baseTriangle = sc.nextDouble();



		System.out.print("Introdueix l'altura del triangle: ");
		double alturaTriangle = sc.nextDouble();

		double areaTriangle = baseTriangle * alturaTriangle / 2;
		System.out.println("L'area d'aquest triangle es de " + areaTriangle + " m²");

		sc.close();

	}

}
