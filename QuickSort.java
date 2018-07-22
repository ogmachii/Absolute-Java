
public class QuickSort {
	
	public static void sort(double[] a, int begin, int end) {
		if((end - begin) >= 1) {
			int splitPoint = split(a,begin,end);
			sort(a, begin, splitPoint);
			sort(a, splitPoint + 1, end);
			join(a,begin, splitPoint,end);
		}
	}
	
	private static int split(double[] a, int begin, int end) {
		double[] temp;
		int size = (end - begin +1);
		temp = new double[size];
		double splitValue = a[begin];
		int up = 0;
		int down = size - 1;
		
		for(int i = begin + 1; i <= end; i++) {
			if(a[i] <= splitValue) {
				temp[up] = a[i];
				up++;
			}else {
				temp[down] = a[i];
				down--;
			}
		}
		
		temp[up] = a[begin];
		
		for(int i = 0; i < size; i++) 
			a[begin + i] = temp[i];
		return (begin + up);
		
	}
	private static void join(double[] a, int begin,int splitPoint, int end) {
		
	}
}
