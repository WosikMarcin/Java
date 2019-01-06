/*
W pliku Main1.java
napisz metodę static int square(int num), która zwróci wartość num podniesioną do kwadratu.
*/

package a_Metody;

public class Main1 {

	public static void main(String[] args) {
		int num = 5;
		System.out.println("Wartosc" + " \"num\" " + "podniesiona do kwadratu to " + square(num));
	}

	static int square(int num) {
		return num * num;
	}
}
