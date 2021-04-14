package Queue;

import java.util.EmptyStackException;

import linkedList.Node;

public class QueueIndex<T,Z> {

	
	static class StackNode<T,Z>{
		private T data;	
		private Z index;
		StackNode<T,Z> next;
		
		public StackNode(T data, Z index) {
			this.data = data;
			this.index = index;
		}
	}
	
	 StackNode<T,Z> top;
	
	public void push(T data,Z index) {
		
		StackNode<T,Z> newNode = new StackNode<T,Z>(data,index);
		//refernce and copy it// then iterate
		StackNode<T,Z> newQueue = this.top;
		if(newQueue==null) {
			top = newNode;
			return;
		}
		while(newQueue.next!=null) {
			newQueue = newQueue.next;
		}
		newQueue.next = newNode;
		
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
