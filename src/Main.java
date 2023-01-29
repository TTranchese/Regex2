public class Main {
	public static void main(String[] args) {
		String string = "tup tuup tuuup tuuuup";
		string = string.replaceAll("(uu|uuu)(?!u)", "x");
		System.out.println(string);
	}
}