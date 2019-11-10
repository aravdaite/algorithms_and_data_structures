/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuewithlinkedlist;

public class Queue implements IQueue {

	LinkedList<Integer> list;
	
	public Queue() {
		this.list = new LinkedList<>();
	}

	public void enqueue(int item) {

		list.add(item);
	}

	public int dequeue() {

		int item = 0;

		try {
			item = list.remove();

		} catch (Exception e) {
			System.out.print(e);
		}

		return item;
	}

	public int get(int index) {

		int item = 0;

		try {
			item = list.get(index);

		} catch (Exception e) {
			System.out.print(e);
		}

		return item;
	}

	public int size() {

		int size = list.size();
		return size;

	}
	
	public void print() {

		try {
			list.print();

		} catch (Exception e) {
			System.out.print(e);
		}

	}

	public double mean() {

		int sum = 0;
		double mean;
		
		for (int i = 0; i < 5; i++) {
			try {
			sum = sum + list.remove();
			}
			catch (Exception e) {
				System.out.print(e);
			}
		}
		mean = sum / 5;
		return mean;

	}

}
