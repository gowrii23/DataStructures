package arrayList;

public class FindPairswhoSumCloseToZero {

	//Re learn
	public static void main(String[] args) {
		
		int[] arr = {-5,-2,1,2,6,9};
		
		//Quick sort the Array First
		
		int curr_sum,closest_sum = Integer.MAX_VALUE, l_index = 0,
				r_index=arr.length-1,min_l_index =l_index,min_r_index=arr.length-1; 
		//
		while(l_index<r_index) {
			curr_sum = arr[l_index] + arr[r_index];
			if( Math.abs(curr_sum) < Math.abs(closest_sum) ) {
				closest_sum = curr_sum;
				min_l_index = l_index;
				min_r_index = r_index;
			}
			if(curr_sum<0) {
				l_index++;
			}else {
				r_index--;
			}
		}
		System.out.println("ele is "+ arr[min_l_index] +" other ele is "+arr[min_r_index]);
	}
}
