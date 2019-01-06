/*
W pliku Main4.java napisz metodę createName, która przyjmie następujące parametry:
name: imię,
surname: nazwisko,
nickname: pseudonim.
Funkcja ma zwrócić łańcuch tekstowy z połączonymi parametrami w postaci Imię "Pseudonim" Nazwisko.
*/

package a_Metody;

public class Main4 {

	public static void main(String[] args) {
		String name = "Poul";
		String surname = "Brown";
		String nickname = "Champion";
		System.out.println(createName(name, surname, nickname));
	}

	static String createName(String name, String nickname, String surname) {
		return name + " " + "\"" + nickname + "\"" + " " + surname;
	}
}
