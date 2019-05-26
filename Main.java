
public class Main {
	
	public static void main(aString[] args) {
		
		int[] arr1 = {0, 1, 0, 2, 0, 0, 3, 4, 0, 5, 0, 0, 6};
		// expected = { 1,2,3,4,5,6,0,0,0,0,0,0}
		
		int[] arr2 = {};
		// expected = {};

		int[] arr3 = null;
		// expected error 
		
		int[] arr4 = {1};
		
		int[] arr5 = {1,2};
		
		int[] arr6 = {3, 2, 0};
		
		
		
		Solution s = new Solution();
		
		s.moveZeroes(arr5);
		
		System.out.println(toString(arr5));
		
	}
	
	
	public static String toString(int[] arr) {
		
		String str = "[ ";
		
		for(int i = 0 ; i < arr.length; ++i) {
			
			str += arr[i] + ", ";
		}
		
		str += "]";
		
		return str;
		
	}
	
}
