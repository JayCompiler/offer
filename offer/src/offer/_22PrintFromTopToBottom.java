package offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _22PrintFromTopToBottom {

	public static void main(String[] args) {

	}

	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		ArrayList<Integer> reS=new ArrayList<>();
		if(root==null) {
			return reS;
		}
		Queue<TreeNode> queue=new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			TreeNode temp=queue.poll();
			reS.add(temp.val);
			if(temp.left!=null) {
				queue.add(temp.left);
			}
			if(temp.right!=null) {
				queue.add(temp.right);
			}
		}
		return reS;
	}
}
