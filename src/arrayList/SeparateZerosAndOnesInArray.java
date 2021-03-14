package arrayList;

public class SeparateZerosAndOnesInArray {
	
	//Separate Zero and One in a Array
	public static void main(String[] args) {
		  
		int[] arr = {0,1,1,0,1,1,0};
		
		//Solution 1:
		swapZeroAndOne(arr);
		
		//Solution 2:
		seperate0and1(arr,arr.length);
		
		for(int re:arr) {
			System.out.println(re);
		}
	}

	private static void swapZeroAndOne(int[] arr) {
		//Swap 0 and 1 to Separate values
		int left_pointer=0, mid = arr.length/2, right_pointer = arr.length-1,temp;
		
		while(left_pointer!=mid) {
			
			//Move Left Pointer
			if(arr[left_pointer] == 0) {
				left_pointer++;
			}
			
			//Swap Positions  with zero and one
			if(arr[right_pointer]==0) {
				temp = arr[right_pointer];
				arr[right_pointer] = arr[left_pointer];
				arr[left_pointer] = temp;
			}else {
				//Move Rigtt Pointer
				right_pointer--;
			}
		}
	}
	
	private static void seperate0and1(int arr[], int size)
	{
		int leftIndex = 0, rightIndex = size-1;
		while( leftIndex < rightIndex)
		{
			while((arr[leftIndex] == 0) && (leftIndex < rightIndex))
				leftIndex++;
			while((arr[rightIndex] == 1) && (rightIndex > leftIndex))
				rightIndex--;
			if(leftIndex < rightIndex)
			{
				arr[leftIndex++] = 0;
				arr[rightIndex--] = 1;
			}
		}
	}
	

}
