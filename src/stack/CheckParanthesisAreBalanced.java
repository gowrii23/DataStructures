package stack;

class CheckParanthesisAreBalanced {

	public static void main(String[] args) {

		char[] str = {'[','(',')',']','{','}','{','[','(',')','(',')','(',')',']','}'};
		
		Stack<Character> stack = new Stack<>();
		for(char st : str) {
			if(stack.isEmpty()) {
				stack.push(st);
				continue;
			}
			if(isEqual(stack.peek(),st)) {
				stack.pop();
			}else {
				stack.push(st);
			}
			
		}
		
		if(stack.isEmpty()) {
			System.out.println("Balanced");
		}else {
			System.out.println("Not Balanced");
		}
	}

	private static boolean isEqual(Character peek, char st) {
		
		//Check for Closing Bracket
		switch (st) {
		
		case ')' :
			if( peek.equals('(') ) {
				return true;
			}
		case '}' :
			if( peek.equals('{') ) {
				return true;
			}
		case ']' :
			if( peek.equals('[') ) {
				return true;
			}
		}
		
		return false;
	}

}
