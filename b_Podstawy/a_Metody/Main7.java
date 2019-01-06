/*
W pliku Main7.java napisz metodę checkEven, która:
przyjmie parametr liczbowy number,
będzie zwracać wartość typu String,
jeśli liczba jest parzysta, zwróci wynik "even",
jeśli liczba jest nieparzysta, zwróci wynik "odd".
*/

package a_Metody;

public class Main7 {

	public static void main(String[] args) {
		int number = 3;
		System.out.println(checkEven(number));
	}

	static String checkEven(int number) {
		if (number % 2 == 0) {
			return "even";
		} else {
			return "odd";
		}
	}
}
