import java.util.Arrays;

public class Main {
	private void helper(int[] arr, int l, int r) {
		if (l + 1 >= r) 
			return;
		int divider = l + (r - l) / 2;
		helper(arr, l, divider);
		helper(arr, divider, r);
		while (l < divider && divider < r) {
			if (arr[divider] < arr[l]) {
				int temp = arr[l];
				for (int i = l + 1; i < divider + 1; i++) {
					int innertemp = arr[i];
					arr[i] = temp;
					temp = innertemp;
				}
				arr[l] = temp;
				divider++;
			} 
			l++;
		}
	}
	
	public void sort(int[] arr) {
		helper(arr, 0, arr.length);
	}
	
	private int[] helper2(int[] arr, int l, int r) {
		if (l + 1 >= r) 
			return arr;
		int divider = l + (r - l) / 2;
		int[] leftArr = helper2(Arrays.copyOfRange(arr, l, divider), 0, divider - l);
		int[] rightArr = helper2(Arrays.copyOfRange(arr, divider, r), 0, r - divider);
		int leftIndex = 0;
		int rightIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (leftIndex < leftArr.length && rightIndex < rightArr.length) {
				int left = leftArr[leftIndex];
				int right = rightArr[rightIndex];
				if (left < right) {
					arr[i] = left;
					leftIndex++;
				} else {
					arr[i] = right;
					rightIndex++;
				}
			} else if (leftIndex < leftArr.length) 
				arr[i] = leftArr[leftIndex++];
			else
				arr[i] = rightArr[rightIndex++];
		}
		return arr;
	}
	
	public void sort2(int[] arr) {
		helper2(arr, 0, arr.length);
	}
	
	public static void main(String[] args) {
		int[] arr = {9,8,7,5,4,6,1,2,3};
		new Main().sort2(arr);
		System.out.println(Arrays.toString(arr));
	}
}
