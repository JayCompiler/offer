package offer;

public class _18Mirror {

	public static void main(String[] args) {

	}

	public void Mirror(TreeNode root) {
		if(root!=null) {
			TreeNode temp=root.left;
			root.left=root.right;
			root.right=temp;
			Mirror(root.left);
			Mirror(root.right);
		}
	}
}
