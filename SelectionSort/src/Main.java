import java.util.Arrays;

public class Main {
	public void sort(int[] arr) {
		int[] cpy = new int[arr.length];
		int index = 0;
		while (index != arr.length) {
			int min = arr[0];
			int minIndex = 0;
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] < min) {
					minIndex = i;
					min = arr[i];
				}
			}
			arr[minIndex] = Integer.MAX_VALUE;
			cpy[index++] = min;
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = cpy[i];
		}
	}
	
	public void sort2(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min = arr[i];
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < min) {
					minIndex = j;
					min = arr[j];
				}
			}
			int temp = arr[i];
			arr[i] = min;
			arr[minIndex] = temp;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {9,8,7,5,4,6,1,2,3};
		new Main().sort2(arr);
		System.out.println(Arrays.toString(arr));
	}
}
