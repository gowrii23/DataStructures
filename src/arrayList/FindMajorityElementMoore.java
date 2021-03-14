package arrayList;

public class FindMajorityElementMoore {
	/**
	 * Given a Array of size n, find an element that occurs more than n/2 times
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {2,2,3,5,2,2};
		
		//Find by Moore voting algorithm
		int majorityElement = findByMajority(arr);
		System.out.println(majorityElement);
		
		//Verify the ans : as Moore voting algo is error prone at end of index
		verifyRealMajority(arr, majorityElement);
		
	}

	private static int findByMajority(int[] arr) {
		//Assumption:: First Element is majaority ele so count is 1
		int majorityElement = 0 ,count = 1;
		
		for(int i=1;i<arr.length;i++) {
			
			//Increase count if its majority
			if(arr[majorityElement] == arr[i]) {
				count++;
			}else {
				count--;
			}
			
			//If count comes to 0, set the current index value as new Majority 
			//and count as 1 , since its a majority element now
			if(count==0) {
				majorityElement = i ;
				count=1;
			}
		}
		
		return arr[majorityElement];
	}
	
	private static void verifyRealMajority(int[] arr, int majorityElement) {
		int count=0;
		//Verify really its a Majority
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==majorityElement) {
				count ++;
			}
		}
		if(count>arr.length/2) {
			System.out.println("Real Majority : true");
		}
	}
}
