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
		System.out.println(Arrays.toString(arr));
	}
	
	public void sort(int[] arr) {
		helper(arr, 0, arr.length);
	}
	
	public static void main(String[] args) {
		int[] arr = {9,8,7,5,4,6,1,2,3};
		new Main().sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
