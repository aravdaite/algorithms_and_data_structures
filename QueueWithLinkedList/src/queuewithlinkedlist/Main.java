
package queuewithlinkedlist;

public class Main {

	public static void main(String[] args) {

		Queue newQueue = new Queue();

		int[] value = { 3, 4, 6, 4, 3, 8 };

		for (int i = 0; i < value.length; i++) {
			newQueue.enqueue(value[i]);
		}

		System.out.print("\nMean " + newQueue.mean());
		System.out.print("\nThe remaining size of the queue " + newQueue.size());

		for (int i = 0; i < value.length; i++) {
			newQueue.enqueue(value[i]);
		}

		System.out.print("\nMean " + newQueue.mean());
		System.out.print("\nThe remaining size of the queue " + newQueue.size());

	}
}
