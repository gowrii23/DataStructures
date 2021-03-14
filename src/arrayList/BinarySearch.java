package arrayList;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {2,5,9,11,18,19};
		int key = 2;
		int val = binarySearch(arr, key);
		System.out.println(" Key is found at " + val +" th index and value is "+arr[val]);
	}

	
	static int binarySearch(int[] arr, int key) {
		
		//Set 3 Pointers
		int l_index = 0;
		int r_index = arr.length-1;
		int m_index = 0;
		
		while(l_index <= r_index) {
			
			m_index = (l_index + r_index) / 2 ;
			
			if(arr[m_index]==key) {
				return m_index;
			}
			
			if(arr[m_index] < key ) {
				l_index = m_index + 1; 
			}else {
				r_index = m_index - 1;
			}
			
			
		}
		
		return -1;
	}
}
