package offer;

import java.util.Stack;

public class _61KthNode {

	public static void main(String[] args) {

	}

	TreeNode KthNode(TreeNode pRoot, int k) {
		if (pRoot == null) {
			return null;
		}
		Stack<TreeNode> stack = new Stack<>();
		TreeNode res=null;
		int count = 0;
		while (pRoot != null || !stack.isEmpty()) {
			while (pRoot != null) {
				stack.push(pRoot);
				pRoot = pRoot.left;
			}
			count++;
			if(count==k) {
				res=stack.peek();
			}
			pRoot = stack.pop().right;
		}
		if(count<k) {
			return null;
		}else {
			return res;
		}
	}
}
