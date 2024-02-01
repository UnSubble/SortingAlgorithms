# Sorting Algorithms  
This repository contains Java implementations of various sorting algorithms. Below, you can find brief explanations of each algorithm along with their respective implementations.  
## Bubble Sort  
#### Description 
Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.  
#### Implementation 
```
// Example usage of Bubble Sort 
public class Main {     
	public void sort(int[] arr) {         
		// Implementation code here     
	}          
	public static void main(String[] args) {         
		int[] arr = {9, 8, 7, 5, 4, 6, 1, 2, 3};         
		new Main().sort(arr);         
		System.out.println(Arrays.toString(arr));     
	} 
}
```

## Insertion Sort

#### Description

Insertion Sort is a simple sorting algorithm that builds the final sorted array one item at a time. It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort.

#### Implementation
```
// Example usage of Insertion Sort 
public class Main {     
	public void sort2(int[] arr) {         
		// Implementation code here     
	}          
	public static void main(String[] args) {         
		int[] arr = {9, 8, 7, 5, 4, 6, 1, 2, 3};         
		new Main().sort2(arr);         
		System.out.println(Arrays.toString(arr));     
	} 	
}
```

## Merge Sort

#### Description

Merge Sort is an efficient, stable, and comparison-based sorting algorithm. It works on the principle of dividing the array into two halves, sorting each half, and then merging them back together.

#### Implementation
```
// Example usage of Merge Sort 
public class Main {     
	public void sort2(int[] arr) {         
		// Implementation code here     
	}          
	public static void main(String[] args) {         
		int[] arr = {9, 8, 7, 5, 4, 6, 1, 2, 3};         
		new Main().sort2(arr);         
		System.out.println(Arrays.toString(arr));     
	} 
}
```

## Quick Sort

#### Description

Quick Sort is a highly efficient sorting algorithm that uses a divide-and-conquer strategy. It selects a 'pivot' element from the array and partitions the other elements into two sub-arrays according to whether they are less than or greater than the pivot.

#### Implementation
```
// Example usage of Quick Sort 
public class Main {     
	public void sort(int[] arr) {         
		// Implementation code here     
	}          
	public static void main(String[] args) {         
		int[] arr = {9, 8, 7, 5, 4, 6, 1, 2, 3};         
		new Main().sort(arr);         
		System.out.println(Arrays.toString(arr));     
	} 
}
```

## Selection Sort

#### Description

Selection Sort is a simple sorting algorithm that sorts an array by repeatedly finding the minimum element from the unsorted part of the array and putting it at the beginning.

#### Implementation
```
// Example usage of Selection Sort 
public class Main {     
	public void sort2(int[] arr) {         
		// Implementation code here     
	}          
	public static void main(String[] args) {         
		int[] arr = {9, 8, 7, 5, 4, 6, 1, 2, 3};         
		new Main().sort2(arr);         
		System.out.println(Arrays.toString(arr));     
	} 
}
```
