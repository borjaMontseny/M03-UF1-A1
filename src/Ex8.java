
public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Descriu pas a pas la sentència x += x - x quan x té el valor 3
		 * Descriu els passos, no has d'executar codi.
		 */
		
		/* "+=" significa suma i acumula-ho a la variable
		 * es calcula X - X, i aquest resultat se li suma a la variable X.
		 * en aquest cas 3 + 0 = 3
		 */
		
		// Proba de la operació:
		int x = 3;
		x += x - x;
		System.out.println(x);

	}

}
