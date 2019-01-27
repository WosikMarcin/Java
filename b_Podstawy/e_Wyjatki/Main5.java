/*
W pliku Main5.java znajduje się program, który zwraca wyjątek.
Popraw kod dodając obsługę zwracanego wyjątku.
*/

package e_Wyjatki;

public class Main5 {

	public static void main(String[] args) {
		try {
			int num = Integer.parseInt("xyz");
			System.out.println(num);
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
	}
}
