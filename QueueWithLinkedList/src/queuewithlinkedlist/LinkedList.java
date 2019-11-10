/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuewithlinkedlist;

public class LinkedList<E> {

	public class Node {

		public E value;
		public Node next = null;

		public Node(E value) {
			this.value = value;
		}
	}

	public Node head;

	//add to the end of the list
	public void add(E item) {
		
		if (head == null) {
			head = new Node(item);
		} else {
			Node iterator = head;
			while (iterator.next != null) {
				iterator = iterator.next;
			}
			iterator.next = new Node(item);
		}
	}

	//remove from the beginning of the list
	public E remove() throws Exception {

		E item;

		if (head.next != null) {
			item = head.value;
			head = head.next;
			return item;
		} else
			throw new Exception("The list is empty");
	}

	public E get(int index) throws Exception {

		E item = null;
		int counter = 0;

		if (head != null || index > size()) {

			Node iterator = head;
			while (iterator != null) {

				if (counter == index) {
					item = iterator.value;
				}
				counter++;
				iterator = iterator.next;
			}
		} else {
			throw new Exception("The list is empty or the index is out of bounds");
			
		}
		return item;
	}

	public void print() throws Exception {

		if (head != null) {
			Node iterator = head;
			while (iterator != null) {
				System.out.println(iterator.value + " ");
				iterator = iterator.next;
			}
		} else {
			throw new Exception("The list is empty");
		}
	}

	public int size() {

		Node iterator = head;
		int counter = 0;

		if (head == null) {
			return 0;
		}

		while (iterator != null) {
			iterator = iterator.next;
			counter++;
		}

		return counter;
	}
}
