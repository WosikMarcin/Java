/*
W pliku Main3.java stwórz trzy zmienne o nazwach str1, str2, joinedStrings .
1. Dwie niech przechowują napisy str1 - Kurs, oraz str2 - Java.
2. Jedna o nazwie joinedStrings , niech przechowuje 
   pusty string np. String joinedStrings = ""; .
3. Połącz stringi za pomocą konkatenacji ( + ) 
   i zapisz wynik w zmiennej joinedStrings .
4. Wypisz wynik w konsoli.
*/

package c_Operatory;

public class Main3 {

	public static void main(String[] args) {
		String str1 = "Kurs";
		String str2 = "Java";
		String joinedStrings = "";
		joinedStrings = str1 + " " + str2;
		System.out.println(joinedStrings);
	}
}
