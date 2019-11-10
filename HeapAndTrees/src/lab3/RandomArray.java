package lab3;

import java.util.Random;

public class RandomArray {

	private static Double[] array;

	public static Double[] fillArray(int length) {

		array = new Double[length];
		Random rand = new Random(System.currentTimeMillis());

		for (int i = 0; i < length; i++) {
			array[i] = rand.nextDouble();
		}
		return array;
	}
	
	public static boolean isSorted(Double[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				return false;
			}
		}
		return true;
	}
}
