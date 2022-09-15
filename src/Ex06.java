import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Escriu un programa que calculi l'import d'una compra.
		 * L'usuari ha d'introduir el preu d'una unitat i
		 * el nombre d'unitats a comprar.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introdueix el preu del producte: ");
		double precioProducto = sc.nextDouble();

		System.out.print("Introdueix el preu del producte: ");
		double cantidadProducto = sc.nextDouble();

		System.out.println("El preu total es de: " + (precioProducto * cantidadProducto) + "€");

		sc.close();

	}

}
