package stack;

public class ReverseStackRecursion {

	//try to push val in same stack --- to avoid space O(n)
	public static void main(String[] args) {

		int[] arr = {10,9,8,7,6,5,4,3,2,1};
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			stack.push(arr[i]);
		}
		
		Stack<Integer> reversedStack  =  new Stack<Integer>();
		reverseStack(stack , reversedStack);
		
		while(!reversedStack.isEmpty()) {
			System.out.println("-->  " + reversedStack.pop());
		}
		
		
	}

	private static void reverseStack(Stack<Integer> stack, Stack<Integer> reversedStack) {
		while(!stack.isEmpty() ) {
			int tempValue = stack.pop();
			System.out.println("first -> " + tempValue);
			reverseStack(stack,reversedStack);
			System.out.println("after Recursion variable -> "+tempValue);
			reversedStack.push(tempValue);
		}
		
	}

}
