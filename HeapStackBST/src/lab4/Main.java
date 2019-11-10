/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		// task 1.a put the speech of Cicero in a String array
		String path = "...speech.txt"; //add path to speech.txt
		String delimiter = " ";
		String[] speech = TextReader.readFromFile(path, delimiter);

		// task 1.b put the keys and list of occurrences in the BST
		BST<String, List<Integer>> bstSpeech = new BST<String, List<Integer>>(); // initiate a BST (the BST contains the
																					// word (key)
		for (int i = 0; i < speech.length; i++) { // and the list of occurrences (value))

			List<Integer> occurrences = new ArrayList<Integer>(); // list to store the positions at which a word occurs
																	// in the text

			// Check if there exists a same key
			if (bstSpeech.get(speech[i]) == null) {
				occurrences.add(i); // add the position of the word in the text at which the word occurs for the
									// first time
				bstSpeech.put(speech[i], occurrences); // add the word and the list of occurrences to the BST
			} else {
				bstSpeech.get(speech[i]).add(i); // if the word occurs again, add the position of the word in the text
			} // to the List of Integer in the BST
		}

		// task 1.c put out the word index in an alphabetical order
		System.out.println("Cicero's first speech against Catiline - Index");

		String key;
		List<Integer> value;
		int occurrences = 0;
		Iterator<String> iterator = bstSpeech.iterator();
		Stack<String> keysStack = new Stack<String>(); // keys are words from the speech
		Heap<Node<String, Integer>> priorityQueue = new Heap<>(105); // node stores the value of word (String) and the
																		// number of occurrences (Integer)

		while (iterator.hasNext()) {
			key = iterator.next().toString(); // iterate though the BST to get the words in alphabetical order
			keysStack.push(key);
			value = bstSpeech.get(key); // get the list of occurrences
			occurrences = value.size(); // get the number of occurrences

			System.out.println(key + ":" + value);

			// task 2.b map words and the number of occurrences in a heap
			priorityQueue.insert(new Node<String, Integer>(key, occurrences)); // heap sorts words according to the
																				// number of occurrences
		}

		// print out the number of keys (stackSize()) and the depth of BST
		System.out.println("\nThe total number of keys in this BST: " + keysStack.size());
		System.out.println("The depth of this BST: " + bstSpeech.depth() + "\n");

		
		System.out.println("3 words with the most occurrences are:");
		// task 2.c print out three most occurring words in order
		for (int i = 1; i < 4; i++) {
			Node<String, Integer> max = priorityQueue.getMax(); // the word with the biggest number of occurrences is
																// going to be at the start of the maxHeap
			System.out.println("No " + i + ". '" + max.getKey() + "' Occurrences: " + max.getOccrrences());
		}
	}
}
