import java.util.function.Predicate;
public class Main
{
	public static void main(String[] args) {
		Predicate<Integer> ispositive =num-> num > 0;
		System.out.println(ispositive.test(2));
			System.out.println(ispositive.test(-2));
	}
}
