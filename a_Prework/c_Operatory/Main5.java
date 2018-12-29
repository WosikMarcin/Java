/*
Uruchom program Main5.java Spróbuj odpowiedzieć na pytanie jaki
będzie wynik bez uruchamiania.
Zweryfikuj własne przypuszczenia poprzez uruchomienie programu.
Opisz w komentarzu wyjaśnienie działania programu.
 */

package c_Operatory;

public class Main5 {

	public static void main(String[] args) {
		int a = 1, b;
		System.out.println(++a); //powiększy 'a' o 1 przed wypisaniem i następnie wypisze wynik 2
		System.out.println(a++); //powiększy 'a' o 1 po wypisaniu wyniku - wypisze wynik 2
		System.out.println(a); //wypisze 'a', które zostało powiększone o 1 linijkę wyżej - wypisze wynik 3
		b = a++; // przypisze 'b' wartość 'a' i powiększy o 1;
		System.out.println(b); // wypisze wartość 'b' - wartość 3
		b = ++a; // powiększy 'a' o 1 i przypisze do 'b'
		System.out.println(++a); //powiększy 'a' o jeden i wydrukuje wynik - wynik 6
	}
}
