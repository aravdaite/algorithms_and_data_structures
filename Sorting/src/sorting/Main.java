/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;


public class Main {

	public static void main(String[] args) throws Exception {

		long start;
		long stop;
		long elapsedTime;

		long sum1, sum2, sum3, sum4;
		sum1 = sum2 = sum3 = sum4 = 0;
		int numTests = 1000;
		int arrayLength = 1000;

		Double[] newArray;
		
		RandomArray array = new RandomArray(); // create a RandomArray

		for (int i = 0; i < numTests; i++) {

			// fill in the array
			newArray = array.fillArray(arrayLength);

			start = System.nanoTime();
			QuickSort2.sort(newArray); // test QuickSort2
			stop = System.nanoTime();
			elapsedTime = stop - start;
			sum1 += elapsedTime;
			
			//check if array was sorted correctly
			if(!QuickSort2.isSorted(newArray)) {
				throw new Exception("The array is not sorted");
			}

			// fill in the array
			newArray = array.fillArray(arrayLength);

			start = System.nanoTime();
			QuickSort.sort(newArray);// test QuickSort
			stop = System.nanoTime();
			elapsedTime = stop - start;
			sum2 += elapsedTime;
			
			//check if array was sorted correctly
			if(!QuickSort2.isSorted(newArray)) {
				throw new Exception("The array is not sorted");
			}

			// fill in the array
			newArray = array.fillArray(arrayLength);

			start = System.nanoTime();
			java.util.Arrays.sort(newArray);// test java.util.Arrays.sort
			stop = System.nanoTime();
			elapsedTime = stop - start;
			sum3 += elapsedTime;
			
			//check if array was sorted correctly
			if(!QuickSort2.isSorted(newArray)) {
				throw new Exception("The array is not sorted");
			}
			
			// fill in the array
			newArray = array.fillArray(arrayLength);

			start = System.nanoTime();
			InsertionSort.sort(newArray);// test java.util.Arrays.sort
			stop = System.nanoTime();
			elapsedTime = stop - start;
			sum4 += elapsedTime;
			
			//check if array was sorted correctly
			if(!QuickSort2.isSorted(newArray)) {
				throw new Exception("The array is not sorted");
			}
		}

		System.out.println("Time performance of QuickSort2:					" + sum1 / numTests);
		System.out.println("Time performance of QuickSort:					" + sum2 / numTests);
		System.out.println("Time performance of java.util.Arrays.sort:		" + sum3 / numTests);
		System.out.println("Time performance of InsertionSort:				" + sum4 / numTests);

	}
}
