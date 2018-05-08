package offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class _58Print {

	public static void main(String[] args) {
		TreeNode aNode=new TreeNode(5);
		aNode.left=new TreeNode(4);
		aNode.left.left=new TreeNode(3);
		aNode.left.left.left=new TreeNode(2);
		ArrayList<ArrayList<Integer>>arrayList=Print(aNode);
		for (ArrayList<Integer> arrayList2 : arrayList) {
			for (Integer integer : arrayList2) {
				System.out.print(integer+" ");
			}
			System.out.println();
		}
	}

	public static ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		if (pRoot == null) {
			return res;
		}
		Stack<TreeNode> sk = new Stack<>();
		sk.push(pRoot);
		Stack<TreeNode> sk1 = new Stack<>();
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(pRoot);
		int flag = 1;
		while (!sk.isEmpty()) {
			ArrayList<Integer> arrayList = new ArrayList<>();
			while (!sk.isEmpty()) {
				TreeNode temp = sk.pop();
				TreeNode tp = queue.poll();
				arrayList.add(tp.val);
				if (flag == 1) {
					if (temp.right != null) {
						sk1.push(temp.right);
						queue.add(temp.right);
					}
					if (temp.left != null) {
						sk1.push(temp.left);
						queue.add(temp.left);
					}
				} else {
					if (temp.left != null) {
						sk1.push(temp.left);
						queue.add(temp.left);
					}
					if (temp.right != null) {
						sk1.push(temp.right);
						queue.add(temp.right);
					}
				}
			}
			flag = -flag;
			res.add(arrayList);
			Stack<TreeNode> t = sk1;
			sk1 = sk;
			sk = t;
		}
		return res;
	}
}
