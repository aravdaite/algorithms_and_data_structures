/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Random;

public class RandomArray {

	private static Double[] array;

	public Double[] fillArray(int length) {

		array = new Double[length];
		Random rand = new Random(System.currentTimeMillis());

		for (int i = 0; i < length; i++) {
			array[i] = rand.nextDouble();
		}
		return array;
	}
}