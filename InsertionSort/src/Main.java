import java.util.Arrays;

public class Main {
	private int search(int[] cpy, int val, int length) {
		int start = 0;
		int end = length - 1;
		while (start < end) {
			int middle = (start + end) >> 1;
			if (cpy[start] > val)
				return start;
			if (cpy[middle] > val) {
				end = middle;
			} else if (cpy[middle] == val) {
				return middle;
			} else {
				start = middle + 1;
			}
		}
		return start;
	}
	
	public void sort(int[] arr) {
		int[] cpy = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int index = search(cpy, arr[i], i + 1);
			int temp = cpy[index];
			for (int j = index + 1; j < i + 1; j++) {
				int temp2 = cpy[j];
				cpy[j] = temp;
				temp = temp2;
			}
			cpy[index] = arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = cpy[i];
		}
	}
	
	public void sort2(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int val = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > val) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = val;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {9,8,7,5,4,6,1,2,3};
		new Main().sort2(arr);
		System.out.println(Arrays.toString(arr));
	}
}
