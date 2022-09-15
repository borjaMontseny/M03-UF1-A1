import java.util.Scanner;

public class Ex13V2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Introdueix minuts: ");
		int numMinuts = sc.nextInt();

		// Una setmana són 10080 minuts

		// Setmanes que tenim en aquests minuts
		int numSetmanes = numMinuts / 10080;

		// Temps (minuts) que no arriben a 10080 per a ser una setmana
		// A partir d'aqui treballarem amb aquesta variable
		int minutsNoSetmana = numMinuts % 10080;

		// Una dia son 1440 minuts
		// Dies que mostrarem
		int numDies = minutsNoSetmana / 1440;

		// El que no arriba a dies, i podrem desfragmentar
		int minutsNoDia = minutsNoSetmana % 1440;

		// Per saber les hores i temps que no arriba a 60 minuts
		int numHores = minutsNoDia / 60;
		int minutsNoHora = minutsNoDia % 60;

		System.out.println(numMinuts + " minuts bruts són " + numSetmanes + " setmanes, " + numDies + " dies, "
				+ numHores + " hores i " + minutsNoHora + " minuts");

		sc.close();

	}

}
