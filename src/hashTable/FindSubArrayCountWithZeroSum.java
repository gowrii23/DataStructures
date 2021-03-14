package hashTable;

public class FindSubArrayCountWithZeroSum {

	public static void main(String[] args) {
		int[] arr = {11,10,-5,-3,-2,10,5,-1,-6};
		
		//Algo::
		//calculate cumulative sum 
		//then if any two cumulative sum is same then its a sub array
		//eg: 11,10,-5,-3,-2,10,5,-1,-6}
		//cumulative sum will be 11,21,16,13,11,21,26,25,19 // 11 and 21 is repeatet so sub array with zeo sum is 2
		
		int[] sumArray = new int[arr.length];
		for(int i=0;i<arr.length ; i++) {
			if(i==0) {
				sumArray[i] =  arr[i];
			}else {
				sumArray[i] = sumArray[i-1] + arr[i];
			}
		}
		
		int count = 0;
		
		//find bigger number
		int big = 0 ;
		for(int i=0;i<sumArray.length;i++) {
			if(sumArray[i]>big) {
				big = sumArray[i];
			}
		}
		//Look for better Solution than this. Hash table
		int[] hash = new int[big+1];
		for(int i=0;i<sumArray.length;i++) {
			if(hash[sumArray[i]] != 0) {
				hash[sumArray[i]] = ++hash[sumArray[i]];
				count++;
			}else {
				hash[sumArray[i]] = 1;
			}
		}


			System.out.println("Sub aray sum zero count -> "+count);

		
		

	}

}
