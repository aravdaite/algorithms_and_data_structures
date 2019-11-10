/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

public class InsertionSort {

	public static void sort(Comparable[] array) {
		sort(array, 0, array.length);
	}

	static void sort(Comparable[] array, int start, int end) {
		int N = end;
		for (int i = start; i < N; i++) {
			for (int j = i; j > 0; j--) {
				if (less(array[j], array[j - 1]))
					exchange(array, j, j - 1);
				else {
					break;
				}
			}
		}
	}

	private static boolean less(Comparable v, Comparable w) {
		return (v.compareTo(w) < 0);

	}

	private static void exchange(Comparable[] array, int i, int j) {
		Comparable t = array[i];
		array[i] = array[j];
		array[j] = t;
	}
}
