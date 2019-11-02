public class Stack
{
	int stack[] = new int[5];
	int index = 0;
	public void push(int data)
	{
		stack[index] = data;
		index++;
	}

	public void show()
	{
		for(int i = 0; i < stack.length; i++)
		{
			System.out.println(stack[i]);
		}
	}

	public int pop()
	{
		int data = 0;
		if(isEmpty())
		{
			System.out.println("Stack is Empty");
		}
		else
		{
			data = stack[index - 1];
			stack[index - 1] = 0;
			index--;
		}
		return data;
	}

	public int peek()
	{
		int data;
		data = stack[index - 1];
		return data;
	}

	public int size()
	{
		return index;
	}

	public boolean isEmpty()
	{
		return index <= 0;
	}
}