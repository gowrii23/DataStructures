package hashTable;

public class FindDisjointInTwoSets {
	public static void main(String[] args) {
		
		int[] arr1 = {5,10,20,40,60};
		int[] arr2 = {15,21,50,70};
		
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
			hash[arr1[i]] = 1;
		}
		
		
		boolean flag = false;
		for(int i=0;i<arr2.length;i++) {
			if(arr2[i]>big) {
				continue;
			}
			if(hash[arr2[i]]==1) {
				flag = true;
				break;
			}
		}
		
		if(flag) {
			System.out.println("Not Disjoint");
		}else {
			System.out.println("Its a  disjoint Set of Array");
		}
		
	}

}
