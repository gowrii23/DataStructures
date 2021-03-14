package hashTable;

public class OrderByFirstOccurence {
	public static void main(String[] args) {
		
		int[] arr1 = {3,2,4,5,2,5,3,4,3};
		
		int big = 0 ;
		//find bigger number
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]>big) {
				big = arr1[i];
			}
		}
		
		//Look for better Solution than this. Hash table
		int[] hash = new int[big+1];
		for(int i=0;i<arr1.length;i++) {
			if(hash[arr1[i]] != 0) {
				hash[arr1[i]] = ++hash[arr1[i]];
			}else {
				hash[arr1[i]] = 1;
			}
		}
		
		//Main Logic
		int[] arr2 = new int[arr1.length];
		int j=0;
		for(int i=0;i<hash.length;i++) {
			if(hash[i]!=0) {
				int count=0;
				while(count < hash[i]) {
					arr2[j]= i;
					j++;
					count++;
				}
			}
		}
		
		for(int i=0;i<arr2.length;i++) {
			System.out.println(" "+ arr2[i]);
		}
		
	}

}
