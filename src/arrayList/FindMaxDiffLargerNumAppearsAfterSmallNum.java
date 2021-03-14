package arrayList;

public class FindMaxDiffLargerNumAppearsAfterSmallNum {

	//Find the max diff in a array such that larger element appears after smaller number
	public static void main(String[] args) {
		
		getMaxDiff();
		
		int[] arr = {4,3,10,2,9,1,6};
		//int[] arr = {9,7,6,5,4,3,2};
		
		//correct Solution  
		//Assumption : Atleast two elements in a Array ,, gives negative/0 value is array is sorted in Descending Order
		
		int min_so_far = 999999;
		int max_diff_so_far=0;
		for(int i=0;i<arr.length;i++) { 
			//track Min element so far
			if( arr[i] < min_so_far  ) {
				min_so_far = arr[i];
			}
			//Update Max diff only if it exceeds past max diff
			//arr[i] - min_so_far =====> gives the current difference
			if(arr[i] - min_so_far > max_diff_so_far) {
				max_diff_so_far =  arr[i] - min_so_far;
			}
		}
		System.out.println("max diff -- " +max_diff_so_far);

		
	}

	
	//This is not the actual solution
	// This only gives the max Diff in given array
	private static void getMaxDiff() {
		int[] arr = {4,3,10,2,9,1,6};
		// ans : 4, 10 gives 6
		// larger element appears after smaller ele menas - b-a such that b is gtr 
		int diff=0;
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr.length;j++) {
				if(((arr[j]-arr[i]) > diff) ) {
					diff = (arr[j]-arr[i]);
				}
			}
		}
			//System.out.println(diff);
	}

}
