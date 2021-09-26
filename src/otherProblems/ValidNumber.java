package otherProblems;

public class ValidNumber {

	public static void main(String[] args) {
		
		/*
		 * Input : str = "11.5" Output : true
		 * 
		 * Input : str = "abc" Output : false
		 * 
		 * Input : str = "2e10" Output : true
		 * 
		 * Input : 10e5.4 Output : false
		 */
		
		String str = "10e5.4";
		
		char[] arr = str.toCharArray();

		int count = 0;
		//Not a best solution 
		for(char ar:arr) {
			//asci 48 to 57 is number 46 is .
			if((ar>47 && ar<58 )|| ar==46 ) {
				count++;
			}
			//asci 101 is e
			if(ar == 101) {
				count++;
			}
		}
		
		System.out.println( arr.length == count ? "true" : "false" );
		
		
	}

}
