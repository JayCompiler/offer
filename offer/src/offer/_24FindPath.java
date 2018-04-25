package offer;

import java.util.ArrayList;
import java.util.Stack;

public class _24FindPath {

	public static void main(String[] args) {
		TreeNode a=new TreeNode(1);
		ArrayList<ArrayList<Integer>>arrayList= FindPath(a, 1);
		for (ArrayList<Integer> arrayList2 : arrayList) {
			System.out.println(arrayList2);
		}
	}

	public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
		ArrayList<ArrayList<Integer>> res=new ArrayList<>();
		if(root==null) {
			return res;
		}
		if(root.right==null&&root.left==null&&target==root.val) {
			ArrayList<Integer> temp=new ArrayList<>();
			temp.add(root.val);
			res.add(temp);
		    return res;
		}
		Stack<TreeNode> stack=new Stack<>();
		stack.push(root);
		if(root.left!=null)
			helpFind(root.left, target-root.val, stack,res);
		if(root.right!=null)
			helpFind(root.right, target-root.val, stack, res);
		return res;
	}

	private static void helpFind(TreeNode node, int target, Stack<TreeNode> stack, ArrayList<ArrayList<Integer>> res) {
		stack.push(node);
		if(node.left==null&&node.right==null&&target-node.val==0) {
			ArrayList<Integer> arrayList=new ArrayList<>();
			Stack<TreeNode> temp=new Stack<>();
			while(!stack.isEmpty())
				temp.push(stack.pop());
			while(!temp.isEmpty()) {
				arrayList.add(temp.peek().val);
				stack.push(temp.pop());
			}
			res.add(arrayList);
			stack.pop();
			return;
		}
		if(node.left!=null)
			helpFind(node.left, target-node.val, stack, res);
		if(node.right!=null)
			helpFind(node.right, target-node.val, stack, res);
		stack.pop();
	}




}
