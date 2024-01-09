import java.util.Arrays;

public class Main {
	public void sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			boolean isDone = true;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
					isDone = false;
				}
			}
			if (isDone)
				return;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {9,8,7,5,4,6,1,2,3};
		new Main().sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
