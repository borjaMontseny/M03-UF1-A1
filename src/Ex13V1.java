import java.util.Scanner;

public class Ex13V1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Introdueix segons: ");
		Scanner sc = new Scanner(System.in);
		int numSegons = sc.nextInt();
		
		// Per saber els minuts, i minuts restants després de pasar a hores
		int numMinuts = numSegons / 60;
		int minutsRestants = numSegons % 60;
		
		// Per saber els segons restants després de convertir a minuts, sempre menys de 59
		int segonsRestants = numSegons % 60;
		
		// Per saber les hores
		int numHores = numMinuts / 60;
		
		// Enseñar segons i minuts restants, ya que si pasen de 59, pujen de categoria.
		System.out.println(numSegons + " segons bruts són " + numHores + " hores, " + minutsRestants + " minuts i " + segonsRestants + " segons");
		
		sc.close();
		
	}

}
