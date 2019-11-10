/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author apple
 */
public class HeapSort {

	public static void sort(Comparable[] array) {

		sort(array, 0, array.length - 1);
	}

	static void sort(Comparable[] array, int low, int high) {

		Heap heap = new Heap(array.length);
		heap.heapify(array); // create heap array

		for (int root = low; root < high; root++) {

			heap.getMax();
		}

		for (int i = 0; i <= high; i++) {

			array[i] = heap.heap[i + 1];
		}
	}
}
