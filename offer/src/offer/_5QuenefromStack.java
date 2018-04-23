package offer;

import java.util.Stack;
/**
 * 
 * @author JayMining
 * 使用栈实现队列
 */
public class _5QuenefromStack {
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	public static void main(String[] args) {

	}
	public void push(int node) {
		stack1.push(node);
	}

	public int pop() {
		while(!stack1.isEmpty())
			stack2.push(stack1.pop());
		int reS=stack2.pop();
		while(!stack2.isEmpty())
			stack1.push(stack2.pop());
		return reS;
	}
}
