package arrayList;

public class FindSumofPair {

	public static void main(String[] args) {
		int[] arr = {1,4,3,3,5,2,6};
		int sum = 9; 	 	
		int size = arr.length;
		
		
		//1::: Store the past value in hash table
		//2::: Check the sum value and see in has table
		
		printPair(arr,size,sum);
		
	}

	private static void printPair(int[] arr, int size, int sum) {
		
		//Maintain hash values using array
		int temp;
		//Assumption::: only 10 values in Array. Get the values from input to be dynamic if needed
		int hash[] = new int[10];
		
		for(int i=0;i<arr.length;i++) {
			
			//Formula: a+temp=sum  => temp= sum -a where a is input array 
			//2:::
			temp = sum - arr[i];
			if(hash[temp]==1) {
				System.out.println( "Pairs  {"+ arr[i]+ "} {" + temp +"}" );
			}
			
			//Update the values in Array on single pass for future use
			//1:::
			hash[arr[i]] = 1;
		}
	}
}
