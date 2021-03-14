package hashTable;

//Sliding Window Problem
public class CountDistintElementsInAllWindowsOfSizeK {
	public static void main(String[] args) {
		
		 //Jut started

		int[] arr = {10, 10, 20, 30, 30, 40, 10 };
		int k = 3;

		int big = 0 ;
		//find bigger number
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>big) {
				big = arr[i];
			}
		}
		//Look for better Solution than this. Hash table
		int[] hash = new int[big+1];
		
		
		int count= 0;
		int distint = 0;
		int distinctPrint = 0;
		for(int i=0;i<=arr.length-1;i++ ) {
			
			if(hash[arr[i]] == 0) {
				hash[arr[i]]++;
				distint++;
			}else if (hash[arr[i]] != 0) {
				hash[arr[i]]++;
				distint--;
			}
			
			if(count>=k-1) {
				System.out.println(distint + "->");
				
				//Bad logic :: 
				if(hash[arr[i-k+1]]==2) {
					hash[arr[i-k+1]]--;
					distint++;
				}else if(hash[arr[i-k+1]]==1) {
					hash[arr[i-k+1]]--;
					distint--;
				}

			}
			
			count++;
			
		}
		

	}

}
