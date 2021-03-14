package arrayList;

public class FindTripletSumOfGivenValue {

	public static void main(String[] args) {
		
		int[] arr = {1,4,3,3,5,2,6};
		
		findTriplet(arr, arr.length, 8);
	}
	
	static int findTriplet(int arr[], int size, int sum)
	{
		int leftIndex, rightIndex, tripletSum;
		
		//Quick sort the array
		//qsort(arr, size, sizeof(int), compareFun);
		
		for(int index = 0; index < size; index++)
		{
			leftIndex = index + 1;
			rightIndex = size - 1;
			while( leftIndex < rightIndex)
			{
				tripletSum = arr[index] + arr[leftIndex] + arr[rightIndex];
				if(tripletSum == sum)
				{
					System.out.printf("Triplet is %d, %d and %d", arr[index], arr[leftIndex],
							arr[rightIndex]);
					return 1;
				}
				if(tripletSum < sum)
					leftIndex++;
				else
					rightIndex--;
			}
		}
		return 0;
	}
}
