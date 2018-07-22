
public class anotherBinarySearch {
	public static int search(int[] a, int lowEnd, int highEnd, int key) {
		
		int first = lowEnd;
		int last = highEnd;
		int mid;
		
		boolean found = false;
		int result = 0;
		
		while((first <= last) && !(found)) {
			mid = (first + last)/2;
			if(key == a[mid]) {
				found = true;
				result = mid; 
			}else if (key < a[mid]) {
				last = mid - 1;
				
			}else if (key > a[mid]){
				first = mid + 1;
			}
		}
		if(first > last)
			result = -1;
		return result;
	}
}