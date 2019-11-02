public class Main
{
	public static void main(String args[])
	{
		Stack stack = new Stack();
		System.out.println("Stack isEmpty " + stack.isEmpty());
		stack.push(05);
		stack.push(15);
		stack.push(25);
		stack.push(35);
		stack.push(45);

		System.out.println("Stack show");
		stack.show();

		System.out.println("Stack peek " + stack.peek());

		System.out.println("Stack pop " + stack.pop());
		stack.show();

		System.out.println("Stack size " + stack.size());

		System.out.println("Stack isEmpty " + stack.isEmpty());
	}
}