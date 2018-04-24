package offer;

import java.util.Stack;

public class _20Stack {
	Stack<Integer> stack;

	public _20Stack() {
		stack = new Stack<>();
	}

	public static void main(String[] args) {
		_20Stack a_20Stack = new _20Stack();
		a_20Stack.push(3);
		System.out.println(a_20Stack.min());
		a_20Stack.push(4);
		System.out.println(a_20Stack.min());
	}

	public void push(int node) {
		stack.push(node);
	}

	public void pop() {
		stack.pop();
	}

	public int top() {
		return stack.peek();
	}

	public int min() {
		Stack<Integer> temp = new Stack<>();
		int min = Integer.MAX_VALUE;
		while (!stack.isEmpty()) {
			int t = stack.pop();
			temp.push(t);
			if (t < min)
				min = t;
		}
		while (!temp.isEmpty()) {
			stack.push(temp.pop());
		}
		return min;
	}

}
