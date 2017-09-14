import edu.princeton.cs.algs4.StdOut;

public class sort {
	public static int[] insertionSort(int[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j = j -1;
			}
			arr[j+1] = key;
		}
		return arr;
	}
	
	public static void mergeSort(int[] arr, int left, int right) {
		if (left == right) return;
		int mid = left + (right - left) / 2;
		mergeSort(arr, left, mid);
		mergeSort(arr, mid + 1, right);
		merge(arr, left, right, mid); 
	}
	
	public static void merge(int[] arr, int left, int right, int mid) {
		int n1 = mid - left + 1;
		int n2 = right - mid;
		int[] L = new int[n1+1];
		int[] R = new int[n2+1];
		for (int i = 0; i < n1; i++) {
			L[i] = arr[left+i];
		}
		for (int j = 0; j < n2; j++) {
			R[j] = arr[mid+j+1];
		}
		int i = 0;
		int j = 0;
		L[n1] = Integer.MAX_VALUE;
		R[n2] = Integer.MAX_VALUE;
		for (int k = left; k <= right; k++) {
			if (L[i] <= R[j]) arr[k] = L[i++];
			else arr[k] = R[j++];
		}
	}
	
	public static void quickSort(int[] arr, int left, int right) {
		if (left >= right) return;
		int split = Partition(arr, left, right);
		quickSort(arr, left, split-1);
		quickSort(arr, split+1, right);
	}
	
	public static int Partition(int[] arr, int left, int right) {
		int pivot = arr[right];
		int split = left-1;
		int temp;
		
		for (int i = left; i < right; i++) {
			if (arr[i] <= pivot) {
				temp = arr[split+1];
				arr[split+1] = arr[i];
				arr[i] = temp;
				split++;
			}
		}
		
		temp = arr[split+1];
		arr[split+1] = arr[right];
		arr[right] = temp;
		return split+1;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[8];
		arr[0] = 1;
		arr[1] = 7;
		arr[2] = 4;
		arr[3] = 3;
		arr[4] = 5;
		arr[5] = 8;
		arr[6] = 6;
		arr[7] = 2;
		
		//int[] newArr = insertionSort(arr);
		//mergeSort(arr, 0, 7);
		quickSort(arr, 0, 7);
		for (int i = 0; i < 8; i++) {
			StdOut.println(arr[i]);
		}
	}
}
