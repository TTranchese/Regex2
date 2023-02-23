import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		String input = "tup tuup tuuup tuuuup";
		//definisco il pattern e il matcher da usare sull'input, la regex l'ho cambiata a qualcosa di più semplice rispetto a quella di prima
		Pattern pattern = Pattern.compile("u{2,3}");
		Matcher matcher = pattern.matcher(input);
		//definisco e assegno la variabile result utilizzando .replaceAll("x")
		String result = matcher.replaceAll("x");
		//stampo la variabile result
		System.out.println(result);
	}
}