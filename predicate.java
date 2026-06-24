import java.util.function.Predicate;
public class Main
{
	public static void main(String[] args) {
		Predicate<String> Length =str->str.length()>5;
		System.out.println(Length.test("helloo"));
	}
}
