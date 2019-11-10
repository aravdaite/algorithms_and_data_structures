/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.ArrayList;
import java.util.List;
import sun.misc.Queue;

public class Tree<E> {

	public class Node {

		public E value;
		public List<Node> children; // public Node children;

		public Node(E value) {
			this.value = value;
			this.children = new ArrayList<>();
		}
	}

	Node root = null;

	public Tree(E rootValue) {
		this.root = new Node(rootValue);
	}

	public void addChild(Node node, E value) {
		node.children.add(new Node(value));
	}

	public void order() throws InterruptedException {
		System.out.print("inOrder: ");
		inOrder(root);
		System.out.println();
		System.out.print("levelOrder: ");
		levelOrder();
		System.out.println();
	}

	private void inOrder(Node node) {
		int nodeSize = node.children.size();
		int middle = nodeSize / 2;

		if (node != null) {

			for (int left = 0; left < middle; left++) {
				inOrder(node.children.get(left));
			}

			System.out.print(node.value.toString());

			for (int right = middle; right < nodeSize; right++) {
				inOrder(node.children.get(right));
			}
		}
	}

	private void levelOrder() throws InterruptedException {

		Queue<Node> queue = new Queue<Node>();
		queue.enqueue(root);

		while (!queue.isEmpty()) {

			Node node = queue.dequeue();
			System.out.print(node.value.toString());

			for (int i = 0; i < node.children.size(); i++) {
				queue.enqueue(node.children.get(i));
			}
		}
	}
}
