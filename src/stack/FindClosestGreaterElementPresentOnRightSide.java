package stack;


public class FindClosestGreaterElementPresentOnRightSide {

	public static void main(String[] args) {

		int[] arr = {10,20,1,5,25,500,60};
		int[] result = new int[arr.length];
		StackIndex<Integer,Integer> stack = new StackIndex<Integer,Integer>();

		for(int i=0;i<arr.length;i++) {
			if(i==0 && stack.isEmpty()) {
				stack.push(arr[i],i);
				continue;
			}
			
			if(arr[i] > stack.peek()) {
				ValClass<Integer, Integer> temp = stack.pop();
				System.out.println(temp.getData() +" " +temp.getIndex());
				result[temp.getIndex()] = arr[i];
				
				//Directly take index from stack and reduce this for loop iteration :: TODO
				for(int j=0;j<i;j++) {
					if(result[j]==0 &&  arr[i] > stack.peek()) {
						result[j] = arr[i];
					}
				}
				stack.push(arr[i],i);
				
				
			}else {
				stack.push(arr[i],i);
			}
			
		}


		for(int r: result) {
			System.out.println("--> "+ r);
		}
		
		
		
	}
}
