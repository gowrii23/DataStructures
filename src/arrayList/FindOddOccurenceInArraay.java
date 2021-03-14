package arrayList;

public class FindOddOccurenceInArraay {

	//Find the number occuring odd number of times in an array given that
	// exactly one number occurs odd number of Lines
	public static void main(String[] args) {

		
		int[] arr = {3,2,1,2,3,1,1,2,1,2,2};
		
		getOddOccurence(arr);
		
		//Solution by XOR logic
		// XOR of Even number is 0 and XOR of odd number is sameNumber itself
		int index, result = 0;
		for(index = 0; index < arr.length; index++) {
			result = result ^ arr[index];
		}
		System.out.println("XOR result --"+result);
		
	}

	private static void getOddOccurence(int[] arr) {
		int[] hashTable = new int[10];
		
		for(int i=0;i<arr.length;i++) {
			if(hashTable[arr[i]]>0) {
				hashTable[arr[i]] += 1;
			}else {
				hashTable[arr[i]] = 1;
			}
		}
		
		//Get result from this iteration
		for(int hash:hashTable) {
			System.out.println(hash);
		}
	}

}
