package arrayList;

public class FindEquilibriumIndex {

	public static void main(String[] args) {

		int[] arr = {7,2,1,4,6,4,0};
		//int[] arr = {10,5,15,3,4,21,2};
		
		//wrongSol(arr);
		
		int index, leftSum=0,sum=0,size=arr.length;
		for(index = 0; index<size ; index++) {
			sum += arr[index];
		}
		for(index = 0; index<size ; index++) {
			sum -= arr[index];
			if(leftSum == sum) {
				System.out.println("Equilibrium index is "+index);
				break;
			}
			leftSum += arr[index];
		}
	}

	private static void wrongSol(int[] arr) {
		int totalSum=0,tempSum=0;
		for(int sum:arr) {
			totalSum+=sum;
		}
		System.out.println("total Sum "+totalSum);
		
		for(int i=0;i<arr.length ; i++) {
			tempSum += arr[i];
			if(tempSum==totalSum/2) {
				System.out.println("Equ at index "+ ++i);
			}
		}
	}

}