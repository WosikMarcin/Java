/* 
W pliku Main1.java stwórz zmienne dla podanych typów 
oraz je zainicjuj (ustaw wartość).
1. int
2. char
3. long
4. double
5. boolean
Nazwy zmiennej mają być stworzone wg. wzoru typ i numer punktu zadania
np. int1 lub boolean5 . Dodaj do każdej zmiennej komentarz z informacją
jaki typ danych przechowuje ta zmienna, dodatkowo wypisz w konsoli
wartości tych zmiennych.
Przykład:
Ta zmienna przechowuje typ całkowity
byte byte9 = 23;
System.out.println(byte9);
*/

package b_Zmienne_i_Typy_Danych;

public class Main1 {

	public static void main(String[] args) {
		// Ta zmienna przechowuje typ całkowity(zakres od -128 do 127)
		int int1 = 1;
		System.out.println(int1);
		// Ta zmienna przechowuje typ znakowy
		char char1 = 'a';
		System.out.println(char1);
		// Ta zmienna przechowuje typ całkowity(zakres od -2^63 do (2^63)-1)
		long long1 = 2;
		System.out.println(long1);
		// Ta zmienna przechowuje typ zmiennoprzecinkowy
		double double1 = 3;
		System.out.println(double1);
		// Ta zmienna przechowuje typ logiczny
		boolean boolean1 = false;
		System.out.println(boolean1);
	}
}
