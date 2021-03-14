package stack;

public class StockSpanDay {

	//Copied from other source: 
	// not own code
	public static void main(String[] args) {

		int price[] = {10, 4, 5, 90, 120, 80};
		int stock[] = new int[6];
		evaluateSpan(price, 6, stock);
		printSpan(stock, 6);
		
		
	}

	static int top = -1;

	static boolean isStackEmpty()
	{
		return (top == -1);
	}

	static void push(int stack[], int data, int size)
	{
		if(top == size)
			System.out.println("stack Full");
		else
			stack[++top] = data;
	}

	static void pop(int stack[])
	{
		if(isStackEmpty())
		{
			System.out.println("stack Empty\n");
			return;
		}
		top--;
	}

	static void evaluateSpan(int price[], int n, int stock[])
	{
		int stack[] = new int[n];
		push(stack, 0, n);
		stock[0] = 0;
		for(int i=1; i<n; i++)
		{
			while(!isStackEmpty() && price[stack[top]] <= price[i])
				pop(stack);

			stock[i] = (isStackEmpty() ? (i) : (i- stack[top]-1));
			push(stack, i, n);
		}
	}

	static void printSpan(int stock[], int n)
	{
		for(int i=0; i<n; i++)
			System.out.println( stock[i]);
	}

}
