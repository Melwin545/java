class Example {
	static int count;
	static
	{
		count=0;
		System.out.println("Static member initialized");
	} Example()
	{
		count=count+1;
	}
	static void disp()
	{
		System.out.println("count=" +count);
	}
}
class Main {
	public static void main(String[]args)
	{
		System.out.println("Driver class started");
		Example obj1 = new Example();
		Example obj2 = new Example();
		Example.disp();
	}
}
