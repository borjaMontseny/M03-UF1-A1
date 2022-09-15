import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Demana a l'usuari l'alçada i l'amplada d'un rectangle
		 * amb aquestes dades
		 * calcula el perímetre del rectangle.
		 */
		
		System.out.print("Introdueix l'alçada del rectangle: ");
		Scanner sc = new Scanner(System.in);
		double alturaRectangle = sc.nextDouble();
		
		System.out.print("Introdueix l'amplada del rectangle: ");
		double ampladaRectangle = sc.nextDouble();
		
		double perimetreRectangle = (alturaRectangle * 2) + (ampladaRectangle * 2);
		System.out.println("El perímetre d'aquest rectangle es de " + perimetreRectangle);
		
		sc.close();

	}

}
