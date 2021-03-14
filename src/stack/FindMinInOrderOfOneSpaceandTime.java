package stack;

public class FindMinInOrderOfOneSpaceandTime {


	//Come back -- negative use case and reading back is pending
	
	public static void main(String[] args) {

		int[] arr = {10,20,5,15,3,6,2,1};
		int min = 999999;
		Stack<Integer> newStack = new Stack<Integer>();
		
		//Find Min in Order of 1
		for(int i=0; i< arr.length ; i++) {
			
			if(arr[i] < min) {
				if(i==0) {
					newStack.push(arr[i]);
					min = arr[i];
					continue;
				}
				newStack.push(arr[i]- min );
				min = arr[i];
			}else {
				newStack.push(arr[i]);
			}
		}
		
		
		/*
		System.out.println("============");
		while(!newStack.isEmpty()) {

			System.out.println(newStack.pop()); 
		}
		*/
		 
		 
		System.out.println("MIN IS "+min);
		
		

		
	}
}
