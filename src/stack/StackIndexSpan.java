package stack;

import java.util.EmptyStackException;

public class StackIndexSpan<T,Z> {

	private static class StackNode<T,Z>{
		private T data;
		private Z index;
		private StackNode<T,Z> next;
		
		public StackNode(T data, Z index) {
			this.data = data;
			this.index = index;
		}
	}
	
	private StackNode<T,Z> top;
	
	public void push(T data,Z index) {
		StackNode<T,Z> newNode = new StackNode<T,Z>(data,index);
		newNode.next = top;
		top = newNode;
	}
	
	public ValClass<T,Z>  pop() {
		if(top==null) throw new EmptyStackException();
		T data =    top.data;
		Z index =    top.index;
		ValClass<T,Z> val = new ValClass<T,Z>(data,index);
		top = top.next;
		return val;
	}
	
	public ValClass<T,Z> peek() {
		if(top==null) throw new EmptyStackException();
		T data =    top.data;
		Z index =    top.index;
		ValClass<T,Z> val = new ValClass<T,Z>(data,index);
		return val;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	
}
