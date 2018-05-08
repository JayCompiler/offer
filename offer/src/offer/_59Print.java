package offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _59Print {

	public static void main(String[] args) {
		Queue<Integer> aIntegers=new LinkedList<>();
		aIntegers.add(3);
		System.out.println(aIntegers.peek());
		aIntegers.clear();
		System.out.println(aIntegers.peek());
		aIntegers.add(3);
		System.out.println(aIntegers.peek());
	}

	ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> res=new ArrayList<>();
		if(pRoot==null) {
			return res;
		}
		Queue<TreeNode> quene=new LinkedList<>();
		Queue<TreeNode> quene1=new LinkedList<>();
		quene.add(pRoot);
		while(!quene.isEmpty()) {
			ArrayList<Integer> a=new ArrayList<>();
			while(!quene.isEmpty()) {
				TreeNode temp=quene.poll();
				a.add(temp.val);
				if(temp.left!=null) {
					quene1.add(temp.left);
				}
				if(temp.right!=null) {
					quene1.add(temp.right);
				}
			}
			res.add(a);
			Queue<TreeNode> t=quene1;
			quene1=quene;
			quene=t;	
		}
		return res;
	}
}
