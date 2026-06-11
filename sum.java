class Sum {
	private int a,b,c;
	public void Setter(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public int get_a()
	{
		return a;
	}
	public int get_b()
	{
		return b;
	}
	public void disp()
	{
		c=a+b;
		System.out.println(c);
	}

}
public class Main
	{
		public static void main(String[] args) {
			Sum obj=new Sum();
			obj.Setter(5,10);
			System.out.println("a=" +obj.get_a());
			System.out.println("b=" +obj.get_b());
			obj.disp();
		}
}