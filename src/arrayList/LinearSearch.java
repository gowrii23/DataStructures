package arrayList;

public class LinearSearch {

	public static void main(String[] args) {

		int[] input = {7,5,9,2,10};
		int key = 10;
		
		
		//To Iterate and find the exact key
		for(int i=0 ; i< input.length ; i++) {
			
			if(input[i]==key) {
				System.out.println("Val "+key+" found");
			}
			
		}
		
		
	}

}
