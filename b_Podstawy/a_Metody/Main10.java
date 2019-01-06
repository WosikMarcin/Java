/*
Gdy klub piłkarski A gra dwumecz z klubem piłkarskim B, oznacza to,
że grają jeden mecz na boisku drużyny A i jeden na boisku drużyny B.
Wygrywa ta drużyna, która zdobędzie więcej goli w obu meczach.
W przypadku, gdy drużyny zdobyły tyle samo bramek,
gole zdobyte na wyjeździe liczą się jako "trochę ważniejsze" i wygrywa ta drużyna,
która zdobyła więcej bramek na wyjeździe.
Remis w dwumeczu wypada wtedy, gdy obie drużyny mają tyle samo bramek na wyjeździe.
Na przykład:
W Pucharze Polski grają dwa zespoły: Grom i Błyskawica. Zespoły rozegrały następujące mecze:
Gospodarz: Grom.
Grom 0:2 Błyskawica
Gospodarz: Błyskawica.
Błyskawica 1:3 Grom
Sumaryczny wynik dwumeczu wynosi 3:3. Jednak Grom na wyjeździe zdobył 3 bramki,
a Błyskawica tylko 2. Zatem wygrywa Grom.
Napisz metodę, footballWin, która przyjmie następujące parametry:
Gole zdobyte przez zespół A w pierwszym meczu (na boisku zepołu A),
Gole zdobyte przez zespół B w pierwszym meczu (na boisku zepołu A),
Gole zdobyte przez zespół A w drugim meczu (na boisku zespołu B),
Gole zdobyte przez zespół B w drugim meczu (na boisku zespołu B),
po czym zwróci "Win a", jeśli dwumecz wygrał zespół A, "Win b" – jeśli B. W przypadku remisu, zwróć Draw.
Wynik ma być łańcuchem tekstowym, nie liczbą!
*/

package a_Metody;

public class Main10 {

	public static void main(String[] args) {
		int aHome = 1;
		int bOut = 3;
		int bHome = 3;
		int aOut = 5;
		System.out.println(footbalWin(aHome, bOut, bHome, aOut));
	}

	static String footbalWin(int aHome, int bOut, int bHome, int aOut) {
		String result = "Draw";
		String result2 = "Win a";
		String result3 = "Win b";
		if (((aHome + aOut) == (bHome + bOut)) && (aOut == bOut)) {
			return result;
		} else if (((aHome > bOut) && (aOut > bHome)) != ((aHome > bOut) && (aOut == bHome)) != ((aHome == bOut)
				&& (aOut > bHome)) != ((aHome < bOut) && (aOut > bHome)
						&& ((aHome + aOut) > (bHome + bOut))) != ((aHome < bOut) && (aOut > bHome)
								&& ((aHome + aOut) == (bHome + bOut)) && (aOut > bHome))) {
			return result2;
		} else {
			return result3;
		}
	}
}
