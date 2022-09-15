import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 11. Escriu un programa que demani preu (sense IVA) i quantitat de 3
		 * productes. El programa ha de mostrar per pantalla:
		 * 1. El preu total per producte, tenint en compte l'IVA i la quantitat.
		 * 2. El preu total de la comanda, sense IVA i amb IVA.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Introdueix el preu sense IVA del producte 1: ");
		double preuProducte1 = sc.nextDouble();

		System.out.print("Quantes unitats? ");
		int cantitatProducte1 = sc.nextInt();

		double totalProducte1 = preuProducte1 * cantitatProducte1;

		System.out.print("Introdueix el preu sense IVA del producte 2: ");
		double preuProducte2 = sc.nextDouble();

		System.out.print("Quantes unitats? ");
		int cantitatProducte2 = sc.nextInt();

		double totalProducte2 = preuProducte2 * cantitatProducte2;

		System.out.print("Introdueix el preu sense IVA del producte 3: ");
		double preuProducte3 = sc.nextDouble();

		System.out.print("Quantes unitats? ");
		int cantitatProducte3 = sc.nextInt();

		double totalProducte3 = preuProducte3 * cantitatProducte3;

		System.out.println("Total dels productes 1 amb IVA: " + (totalProducte1 * 1.21) + "€");

		System.out.println("Total dels productes 2 amb IVA: " + (totalProducte2 * 1.21) + "€");

		System.out.println("Total dels productes 3 amb IVA: " + (totalProducte3 * 1.21) + "€");

		double totalProductes = totalProducte1 + totalProducte2 + totalProducte3;

		System.out.println("Comanda total amb IVA: " + (totalProductes * 1.21));
		System.out.println("Comanda total sense IVA: " + totalProductes);

		sc.close();

	}

}
