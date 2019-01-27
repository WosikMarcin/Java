/*
W pliku Main6.java znajduje się program, który zwraca wyjątek.
Popraw kod dodając obsługę zwracanego wyjątku.
*/

package e_Wyjatki;

public class Main6 {

	public static void main(String[] args) {
		String str = null;
		try {
			System.out.println(str.length());
		} catch (NullPointerException e) {
			System.out.println(e);
		}
	}
}
