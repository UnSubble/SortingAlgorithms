import java.util.Arrays;

public class Main {
	
	private void helper(int[] arr, int start, int end) {
		if (start >= end)
			return;
		int index = partition(arr, start, end);
		helper(arr, start, index - 1);
		helper(arr, index + 1, end);
	}
	
	private int partition(int[] arr, int start, int end) {
		int pivot = arr[end];
		int pIndex = start;
		for (int i = start; i < end; i++) {
			if (arr[i] <= pivot) {
				swap(arr, i, pIndex);
				pIndex++;
			}
		}
		swap(arr, pIndex, end);
		return pIndex;
	}
	
	private void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
	
	public void sort(int[] arr) {
		helper(arr, 0, arr.length - 1);
	}

	public static void main(String[] args) {
		int[] arr = {9,8,7,5,4,6,1,2,3};
		new Main().sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
