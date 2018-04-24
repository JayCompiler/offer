package offer;

import java.util.ArrayList;
import java.util.Stack;

public class _21IsPopOrder {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 4, 5, 3, 2, 1 };
		System.out.println(IsPopOrder1(a, b));
	}

	public static boolean IsPopOrder(int[] pushA, int[] popA) {
		if (pushA == null) {
			return true;
		}
		ArrayList<Integer> a = new ArrayList<>();
		for (int i = 0; i < pushA.length; i++) {
			a.add(pushA[i]);
		}
		int index = a.indexOf(popA[0]);
		if (index == -1) {
			return false;
		}
		for (int i = 0; i < popA.length - 1; i++) {
			if (a.isEmpty())
				return true;
			if (index + 1 <= a.size() - 1) {
				if (a.get(index + 1) == popA[i + 1]) {
					a.remove(index);
					continue;
				} else if (index - 1 >= 0) {
					if (a.get(index - 1) == popA[i + 1]) {
						a.remove(index);
						index = index - 1;
						continue;
					} else if (a.get(a.size() - 1) != a.get(index) && a.get(a.size() - 1) == popA[i + 1]) {
						a.remove(index);
						index = a.size() - 1;
						continue;
					} else {
						return false;
					}
				}
			} else if (index - 1 >= 0) {
				if (a.get(index - 1) == popA[i + 1]) {
					a.remove(index);
					index = index - 1;
					continue;
				} else {
					return false;
				}
			} else {
				return true;
			}
		}
		return true;
	}

	public static boolean IsPopOrder1(int[] pushA, int[] popA) {
		if (pushA == null || popA == null || pushA.length != popA.length || pushA.length == 0 || popA.length == 0)
			return false;
		Stack<Integer> stack = new Stack<>();
		int count = 0;
		for (int i = 0; i < pushA.length;i++) {
			stack.push(pushA[i]);
			while (!stack.isEmpty()&&stack.peek() == popA[count]) {
				stack.pop();
				count++;
			}
		}
		if (stack.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
