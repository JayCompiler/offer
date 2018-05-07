package offer;


public class _38IsBalanced {

	public static void main(String[] args) {
		TreeNode aNode = new TreeNode(4);
		aNode.left = new TreeNode(2);
		aNode.left.left = new TreeNode(1);
		aNode.left.right = new TreeNode(3);
		aNode.right = new TreeNode(6);
		aNode.right.left = new TreeNode(5);
		aNode.right.right = new TreeNode(7);
		boolean flag = IsBalanced_Solution(aNode);
		System.out.println(flag);
	}

	public static boolean IsBalanced_Solution(TreeNode root) {
		if (root == null) {
			return true;
		}
		boolean flag = IsBalanced(root);
		return flag;
	}

	private static boolean IsBalanced(TreeNode root) {
		if(root==null) {
			return true;
		}
		int left=getHeighty(root.left);
		int right=getHeighty(root.right);
		if(Math.abs(left-right)>1) {
			return false;
		}else {
			return IsBalanced(root.right)&&IsBalanced(root.left);
		}
	}

	private static int  getHeighty(TreeNode root) {
		if(root==null) {
			return 0;
		}
		if(root.left==null&&root.right==null) {
			return 1;
		}
		int left=0;
		int right=0;
		if(root.left!=null) {
			left= 1+getHeighty(root.left);
		}
		if(root.right!=null) {
			right= 1+getHeighty(root.right);
		}
		return left>right?left:right;
	}

	// private static void inorder(TreeNode root, ArrayList<TreeNode> arrayList) {
	// if(root==null) {
	// return;
	// }
	// inorder(root.left, arrayList);
	// arrayList.add(root);
	// inorder(root.right, arrayList);
	// }
}
