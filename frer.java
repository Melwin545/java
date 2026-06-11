
class Main
{
	static int size=5;
	static int[] queue = new int[size];


	static int front =0;
	static int rear = 4;

	public static void main(String[] args) {
		queue[0] = 2;
		queue[1] = 7;
		queue[2] = 8;
		queue[3] = 3;
		queue[4] = 1;

		front++;
		front++;

		rear=(rear +1)% size;

		queue[rear]=9;
		System.out.println("front value = " + queue[front]);
		System.out.println("rear value = " + queue[rear]);


	}
}
