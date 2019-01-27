/*
W pliku Main4.java znajduje się program z obsługą 2 wyjątków.
Uruchom program i zaobserwuj jaki wyjątek jest zwracany.
Popraw kod tak aby dodatkowy wyjątek z komentarza był poprawnie obsłużony.
*/

package e_Wyjatki;

public class Main4 {

	public static void main(String[] args) {
		int a = 1, b = 0, c;
		try {
			c = a / b;
			System.out.println(c);

		} catch (ArithmeticException ex) {
			System.out.println("Arithmetic Exception: You can't divide by 0");
		}
		catch (Exception ex) {
			System.out.println("Exception");
		}
	}
}

/*
public static void main(String[] args) {
        int a = 1, b = 0, c;
        try {
            c = a / b;
            System.out.println(c);

        } catch (Exception ex) {
            System.out.println("Exception");

        } 
//        catch (ArithmeticException ex) {
//            System.out.println("Arithmetic Exception: You can't divide by 0");
//        }
    }
}

Komentarz do zadania:
Stosując kilka klauzul catch powinniśmy zaczynać od najbardziej szczegółowych do najbardziej
ogólnych zgodnie z hierarchią. Przed poprawa kodu otrzymamy wyjątek: 
Unreachable catch block for ArithmeticException.
It is already handled by the catch block for Exception
To dlatego, że klasa ArithmeticException jest pochodną klasy Exception - w związku z tym drugi
blok catch nigdy nie zostanie wykonany.
Należało zmienić kolejność klauzuli cacth.
*/











