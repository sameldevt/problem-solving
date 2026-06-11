package br.com.samiac.problems.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class LRUCache {

	private int capacity;

	private int size;

	private Map<Integer, Node> map;

	private Stack<Node> stack;

	public LRUCache(int capacity) {
		this.capacity = capacity;
		this.map = new HashMap<>();
		this.stack = new Stack<>();
	}

	public int get(int key) {
		if (this.map.containsKey(key)) {
			Node n = this.map.get(key);
			this.stack.remove(n);
			this.stack.push(n);

			return n.value;
		}

		return -1;
	}

	public void put(int key, int value) {
		if (map.containsKey(key)) {
			Node n = this.map.get(key);
			n.value = value;
			this.stack.remove(n);
			this.stack.push(n);
			return;
		}

		if (this.size >= this.capacity) {
			Node r = this.stack.removeFirst();
			this.map.remove(r.key);
			size--;
		}

		Node n = new Node(key, value);
		this.map.put(key, n);
		this.stack.push(n);

		this.size++;
	}

	class Node {

		private int key;

		private int value;

		public Node(int key, int value) {
			this.key = key;
			this.value = value;
		}
	}
}