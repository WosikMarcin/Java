/*
W pliku Main7.java znajduje się tablica o nazwie task1Array.
Wypisz element znajdujący się w 3 kolumnie i 2 wierszu.
Wypisz długość tablicy znajdującej się w drugim rzędzie.
Wypisz element znajdujący się w czwartej kolumnie i 3 wierszu.
*/

package b_Tablice;

public class Main7 {

	public static void main(String[] args) {

		int[][] task1Array = { 
				{ 2, 3, 4 },
				{ 12, 32, 12, 11 },
				{ 3, 2, 1, 4, 5 },
				{ 5, 1, 6, 7, 8 } 
				};

		System.out.println("Element znajdujący się w 3 kolumnie i 2 wierszu to " + task1Array[2][1]);

		System.out.println("Długość tablicy znajdującej się w drugim rzędzie to " + task1Array[1].length);

		System.out.println("Element znajdujący się w czwartej kolumnie i 3 wierszu to " + task1Array[3][2]);

	}
}
