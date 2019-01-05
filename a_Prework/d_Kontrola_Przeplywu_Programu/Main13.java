/*
W pliku Main13.java napisz program, który wystawi ocenę z testu.
0 - 39 pkt - ocena niedostateczna
40 - 54 pkt - ocena dopuszczająca
55 - 69 pkt - ocena dostateczna
70 - 84 pkt - ocena dobra
85 - 98 pkt - ocena bardzo dobra
99 - 100 pkt - ocena celująca
1. Stwórz zmienną points , do której będzie przypisany wynik z testu.
2. Na początku sprawdź czy ilość punktów jest większa bądź równa 0 ,
   jeśli nie wypisz na stronie komunikat Ilość
punktów mniejsza niż 0.
3. Na początku sprawdź czy ilość punktów jest mniejsza bądź równa 100 ,
   jeśli nie wypisz na stronie komunikat Ilość
punktów większa niż 100.
4. Następnie sprawdź jaka ocena odpowiada danej ilości punktów i wypisz
   ją na stronie wg. wzoru Wynik: ocena dobra
5. Rozwiąż to zadanie używając raz konstrukcji if ... elseif ... else .
*/

package d_Kontrola_Przeplywu_Programu;

public class Main13 {

	public static void main(String[] args) {
		int points = 95;
		if (points < 0) {
			System.out.println("Ilość punktów mniejsz od 0");
		} else if ((points >= 0) && (points <= 39)) {
			System.out.println("Ocena niedostateczna");
		} else if ((points >= 40) && (points <= 54)) {
			System.out.println("Ocena dopuszczająca");
		} else if ((points >= 55) && (points <= 69)) {
			System.out.println("Ocena dostateczna");
		} else if ((points >= 70) && (points <= 84)) {
			System.out.println("Ocena dobra");
		} else if ((points >= 85) && (points <= 98)) {
			System.out.println("Ocena bardzo dobra");
		} else if ((points >= 99) && (points <= 100)) {
			System.out.println("Ocena celująca");
		} else {
			System.out.println("Ilość punktów poza zakresem");
		}
	}
}
