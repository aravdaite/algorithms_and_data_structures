/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

public class QuickSort {

	public static void sort(Comparable[] array) {
		sort(array, 0, array.length - 1);
	}

	static void sort(Comparable[] array, int low, int high) {
		if (low < high) {
			int pivot = partition(array, low, high);

			sort(array, low, pivot - 1); // sort left
			sort(array, pivot + 1, high);// sort right
		}
	}

	static int partition(Comparable[] array, int low, int high) {
		Comparable pivot = array[high];
		int i = (low - 1);
		for (int j = low; j < high; j++) {
			if (lessEqual(array[j], pivot)) {
				i++;
				exchange(array, i, j);
			}
		}
		exchange(array, i + 1, high);
		return i + 1;
	}

	private static boolean lessEqual(Comparable v, Comparable w) {
		return (v.compareTo(w) <= 0);
	}

	private static void exchange(Comparable[] array, int i, int j) {
		Comparable t = array[i];
		array[i] = array[j];
		array[j] = t;
	}

	public static boolean isSorted(Double[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				return false;
			}
		}
		return true;
	}
}
