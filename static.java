class Example {
	static int count = 0;

	Example() {
	}

	{
		count = count + 1;
	}

	{
		System.out.println("object created " + count);
	}
}

public class Main {
	public static void main(String[] args) {
		Example obj1 = new Example();
		Example obj2 = new Example();
		Example obj3 = new Example();
	}
}
