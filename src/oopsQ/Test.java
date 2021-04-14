package oopsQ;

public class Test {

	public static void main(String[] args) {
		C c = new C();
		c.startFromHere();
		
		//waht if with static/ without static
	}

	public static class A {
		Integer getValue() {
			return 10;
		}
	}
	
	
	public static class B extends A {
		public Integer getValue() {
			return Integer.MAX_VALUE;
		}
	}
	
	public static class C extends B {
		public void startFromHere() {
			System.out.println(this.getValue());
		}
	}
	
}
