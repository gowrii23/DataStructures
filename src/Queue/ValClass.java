package Queue;

public class ValClass<T,Z> {

	private T data;
	private Z index;
	
	public ValClass(T data, Z index) {
		// TODO Auto-generated constructor stub
		this.data =  data;
		this.index = index;
	}


	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Z getIndex() {
		return index;
	}

	public void setIndex(Z index) {
		this.index = index;
	}

	
}
