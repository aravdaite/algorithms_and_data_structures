/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackwitharray;

public class Main {

	public static void main(String[] args) {

		int maxHeight = 5;
		Stack newStack = new Stack(maxHeight);

		String[] value = { "a", "b", "c", "d", "e", "f" };

		// add values to the stack
		for (int i = 0; i < value.length; i++) {
	
			newStack.push(value[i]);
			System.out.print("Push letter: " + value[i] + "\n");
			
			try {
				System.out.print("Stack: ");
				newStack.print(); 
			} catch (Exception e) {
				System.out.print(e);
			}
		
		}

		// pop values from the stack
		for (int i = 0; i < maxHeight + 1; i++) {
			
			String temp = "";
			
			try {
				temp = newStack.pop();
				System.out.print("Pop letter: " + temp + "\n");
				System.out.print("Stack: ");
				newStack.print();
				
			} catch (Exception e) {
				System.out.print(e);
			}	
		}
	}
}
