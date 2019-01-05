/*
1. W pliku Main1.java stwórz dwie zmienne, o nazwach nr1, nr2 ,
   przechowujące liczby całkowite.
2. Następnie za pomocą instrukcji warunkowej if ... else , 
   wypisz w konsoli,która z nich jest większa.
3. Wypisany string ma być wg. wzoru. Większa liczba to 7.
*/

package d_Kontrola_Przeplywu_Programu;

public class Main1 {

	public static void main(String[] args) {
		int nr1 = 10;
		int nr2 = 8;
		if (nr1 > nr2) {
			System.out.println("Większa liczba to " + nr1);
		} else if (nr2 > nr1) {
			System.out.println("Większa liczba to " + nr2);
		} else {
			System.out.println("Liczby są rowne.Podaj inne liczby");
		}
	}
}
