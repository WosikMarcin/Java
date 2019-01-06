/*
W pliku Main3.java napisz metodę convertToUsd, która przyjmuje parametr zlotys,
czyli kwotę w złotówkach. Funkcja ma zwrócić podaną kwotę w dolarach amerykańskich.
Jako przelicznik przyjmij wartość 4.04 PLN = 1 USD.
*/

package a_Metody;

public class Main3 {

	public static void main(String[] args) {
		double zlotys = 4;
		System.out.println((convertToUsd(zlotys)));
	}

	static double convertToUsd(double zlotys) {
		double result = zlotys / 4.04;
		return result;
	}
}
