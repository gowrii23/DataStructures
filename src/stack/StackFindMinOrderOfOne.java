package stack;

public class StackFindMinOrderOfOne {
	//Stack LIFO - last in first out
	public static void main(String[] args) {

		int[] arr = {10,6,20,25,5};
		Stack<Integer> newStack = new Stack<Integer>();
		
		Stack<Integer> minStack = new Stack<Integer>();
		
		//Find Min in Order of 1
		for(int i=0; i< arr.length ; i++) {
			newStack.push(arr[i]);
			if(i==0) {
				minStack.push(arr[i]);
			}else if(minStack.peek() > arr[i]) {
				minStack.push(arr[i]);
			}else {
				minStack.push(minStack.peek());
			}
		}
		
		while(!newStack.isEmpty()) {
			System.out.println(newStack.pop());
		}
		
		System.out.println("============");
		while(!minStack.isEmpty()) {
			System.out.println(minStack.pop());
		}
		
		//Now pop both the stack to Get Min at any point of time
		System.out.println("Now pop both the stack to Get Min at any point of time in O(1)"
				+ "but space is O(n)");
	}

}
