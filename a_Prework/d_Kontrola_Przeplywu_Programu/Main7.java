/*
1. W pliku Main7.java stwórz dwie pętle niezależne i wypisz wartości
   ich liczników w każdej iteracji.
2. Wykorzystaj np. System.out.println("i= " +i + " j= "+j);
3. Zadanie rozwiąż używając dwóch pętli for .
*/

package d_Kontrola_Przeplywu_Programu;

public class Main7 {

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {
				System.out.println("i= " + i + " j= " + j);
			}
		}
	}
}
