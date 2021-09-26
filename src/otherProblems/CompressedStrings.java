package otherProblems;

public class CompressedStrings {
	
	//wrong code
	public static void main(String... args) {
		
		String inputString = "a1b2c3d4e7d3";
		int val = 16;
		
		//ans 1st line::::::  abbcccddddeeeeeeeDDD
		//2nd line::::::  e
		
		//String inputString = "mnopqrst34";
		//int val = 23;
		
		//ans 1st line::::::  mnopqrstmnopqrstmnopqrstmnopqrstmnopqrstmnopqrstmnopqrst
		//2nd line::::::  t
		
		char[] ch = inputString.toCharArray();
		StringBuilder dummyString = new StringBuilder();
		StringBuilder dummyNumber = new StringBuilder();;
		StringBuilder ans = new StringBuilder();
		
		//wrong logic
		for(char c : ch) {
			if(!dummyNumber.isEmpty()) {
				for(int i=0; i< Integer.valueOf(dummyNumber.toString()) ;i++) {
					ans.append(dummyString);
				}
				dummyString = new StringBuilder();
				dummyNumber = new StringBuilder();
			}
			if(Character.isLetter(c)) {
				dummyString.append(c);
			}
			if(Character.isDigit(c)) {
				
				dummyNumber.append(c);
			}
		}
		
		System.out.println(ans);
		
		int count =0;
		for(char c : ans.toString().toCharArray()) {
			if(count == val) {
				System.out.println(c);
			}
			count++;
		}
	}
	
	
	
	private static boolean isLetterOrNumber(char c) {
	    return (c >= 'a' && c <= 'z') ||
	           (c >= 'A' && c <= 'Z') ||
	           (c >= '0' && c <= '9');
	}
	
	

}
