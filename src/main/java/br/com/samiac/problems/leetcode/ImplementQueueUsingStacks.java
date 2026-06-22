package br.com.samiac.problems.leetcode;

import java.util.Stack;

public class ImplementQueueUsingStacks {

	private Stack<Integer> stack;

	public ImplementQueueUsingStacks() {
		this.stack = new Stack<Integer>();
	}

	public void push(int x) {
		this.stack.push(x);
	}

	public int pop() {
		int element = this.stack.firstElement();
		this.stack.removeElementAt(0);
		return element;
	}

	public int peek() {
		return this.stack.firstElement();
	}

	public boolean empty() {
		return this.stack.isEmpty();
	}
}
