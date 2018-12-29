/*
W pliku Main8.java wykonaj następujące czynności:
1. Zdefiniuj zmienną x o wartości 16 , oraz zmienną y o wartości 15 .
2. Zdefiniuj zmienną x_y , która będzie przechowywać wartość
   logiczną porównania czy x < y .
3. Zdefiniuj zmienną t o wartości logicznej prawdy,
   oraz zmienną f o wartości logicznej fałszu.
4. Zdefiniuj zmienną t_f , która będzie przechowywać
   wartość logiczną porównania t LUB f .
5. Zdefiniuj zmienną last , która będzie przechowywać 
   wartość logiczną porównania x_y i t_f .
6. Wyświetl w konsoli w nowych liniach kolejno zmienne: x_y , t_f , last .
7. Przeanalizuj otrzymany wynik.
*/

package c_Operatory;

public class Main8 {

	public static void main(String[] args) {
		int x = 16;
		int y = 15;
		boolean x_y = (x < y);
		boolean t = true;
		boolean f = false;
		boolean t_f = (t || f);
		boolean last = (x_y == t_f);
		System.out.println(x_y);
		System.out.println(t_f);
		System.out.println(last);
	}
}

/*
 
x_y ma wartość false, bo nie jest prawdą, że 16 < 15

t_f ma wartość true, bo co najmniej jedna ze zmiennych t,f
przyjmuje wartość true

last ma wartość false, bo nie jest prawdą,
że x_y oraz t_f przyjmują wartość true

*/

