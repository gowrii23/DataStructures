package stack;

public class StockSpanProblemOwn {

	public static void main(String[] args) {

		int price[] = {10, 4, 5, 90, 120, 80};
		int stock[] = new int[6];
		StackIndexSpan<Integer,Integer> stack = new StackIndexSpan<Integer,Integer>();

		
		stock[0] = 0;
		
		for(int i=0; i<price.length; i++) {
			
			
			if(i==0) {
				stack.push(price[i], i);
				continue;
			}
			
			while(!stack.isEmpty() && price[stack.peek().getIndex()] <= price[i] ) {
				 stack.pop();
			}
			
			stock[i] = stack.isEmpty()  ? i :  i-stack.peek().getIndex()-1;
			stack.push(price[i], i);
			
		}
		
		for(int spanDay: stock) {
			System.out.println("== "+spanDay);
		}
		
	}

}
