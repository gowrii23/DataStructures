package hashTable;

public class FindDuplicatesInKDistance {
	public static void main(String[] args) {
		
		// int[] arr = {1,2,3,4,1,2,3,4}; int k = 3;
		 

		int[] arr = { 1, 2, 3, 1, 4, 5 };
		int k = 3;

		/*
		 * int[] arr = {1,2,3,4,5}; int k = 3;
		 * 
		 * int[] arr = {1,2,3,4,4}; int k = 3;
		 */
		
		int[] hash = new int[k];
		boolean isFound = false;
		
		for(int i=0;i<=arr.length;i++ ) {
			
			if((i+k) == arr.length) {
				break;
			}
			//move array like window :: later make it dynamic
			hash[0] = arr[i+1];
			hash[1] = arr[i+2];
			hash[2] = arr[i+3];

			for(int j=0; j< hash.length ;j++ ) {
				if(arr[i] == hash[j]) {
					isFound = true;
					System.out.println(" Found Duplicte in Kth Distane " + arr[i]);
				}
			}
		}
		
		if(!isFound) {
			System.out.println("Not Found");
		}

	}

}
