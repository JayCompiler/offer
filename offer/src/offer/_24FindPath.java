package offer;

import java.util.ArrayList;

public class _24FindPath {

	public static void main(String[] args) {

	}

	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
		ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
		if (root==null)
			return null;
		if (root.val == target) {
			arrayList.add(new ArrayList<>(root.val));
			return arrayList;
		} else {
			remain = target - root.val;
			if (root.left != null) {
				helpFind(root.left, remain, arrayList);
				
			}
			if (root.right != null) {
				 helpFind(root.right, remain, arrayList);
				
			}
		}
		return null;
	}

	private ArrayList<ArrayList<Integer>> helpFind(TreeNode left, int remain, ArrayList<ArrayList<Integer>> arrayList) {
		return null;
	}


}
