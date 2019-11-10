
package stackwitharray;

public class Stack implements IStack {

	int maxHeight;
	String[] stackArray;

	public Stack(int length) {

		this.maxHeight = length;
		this.stackArray = new String[length];
	}

	public void push(String input) {

		if (height() == maxHeight) {

			for (int i = 0; i < maxHeight - 1; i++) {
				stackArray[i] = stackArray[i + 1];
			}

			stackArray[maxHeight - 1] = input;

		} else {
			stackArray[height()] = input;
		}
	}

	public String pop() throws Exception {

		String poppedElement = "";

		if (height() != 0) {
			poppedElement = stackArray[height() - 1];

		} else {
			throw new Exception("Cannot pop an element bacause stack is empty");
		}

		stackArray[height() - 1] = null;

		return poppedElement;

	}

	public int height() {

		int height = 0;
		for (int i = 0; i < maxHeight; i++) {
			if (stackArray[i] != null) {
				height++;
			}
		}
		return height;
	}

	public void print() throws Exception {

		if (height() != 0) {
			for (int i = 0; i < height(); i++) {
				System.out.print(" " + stackArray[i]);
			}
			System.out.print("\n");
		} else {
			throw new Exception("Cannot print the stack because it's empty!");
		}
	}

}
