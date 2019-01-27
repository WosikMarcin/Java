/*
W pliku Main1.java napisz program który:
Do kodu znajdującego się w pliku doda obsługę wyjątku ArrayIndexOutOfBoundsException.
*/

package e_Wyjatki;

public class Main1 {

	public static void main(String[] args) {
		int[] tab = { 5, 1, 6, 7, 8 };
		try {
			System.out.println(tab[21]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
}

/* Było:
public class Main1 {

    public static void main(String[] args) {

        int[] tab = {  5, 1, 6, 7, 8 } ;

        System.out.println(tab[21]);

    }
}
*/
