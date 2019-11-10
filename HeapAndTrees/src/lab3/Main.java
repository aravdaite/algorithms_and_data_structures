/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

public class Main {

	public static void main(String[] args) throws Exception {

		// task 1: Iterate through a tree
		Tree<String> tree = new Tree<String>("D");
		tree.addChild(tree.root, "B");
		tree.addChild(tree.root, "E");
		tree.addChild(tree.root, "F");
		tree.addChild(tree.root.children.get(0), "A");
		tree.addChild(tree.root.children.get(0), "C");
		tree.addChild(tree.root.children.get(2), "G");
		tree.order();

		// task 2: Compare time behavior of QuickSort and HeapSort
		int arrayLength = 10000;
		int numTests = 100;

		long start;
		long end;
		long elapsedTime;
		long sum1 = 0;
		long sum2 = 0;

		for (int i = 0; i < numTests; i++) {

			Double[] array1 = RandomArray.fillArray(arrayLength);
			Double[] array2 = RandomArray.fillArray(arrayLength);

			start = System.nanoTime();
			QuickSort.sort(array1); // test QuickSort
			end = System.nanoTime();
			elapsedTime = end - start;
			sum1 += elapsedTime;

			// check if array was sorted correctly
			if (!RandomArray.isSorted(array1)) {
				throw new Exception("The array is not sorted");
			}

			start = System.nanoTime();
			HeapSort.sort(array2); // test QuickSort
			end = System.nanoTime();
			elapsedTime = end - start;
			sum2 += elapsedTime;

			// check if array was sorted correctly
			if (!RandomArray.isSorted(array2)) {
				throw new Exception("The array is not sorted");
			}
		}

		System.out.println("Time performance of QuickSort:					" + sum1 / numTests);
		System.out.println("Time performance of HeapSort:					" + sum2 / numTests);

	}
}
