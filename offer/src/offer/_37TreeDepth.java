package offer;

public class _37TreeDepth {

	public static void main(String[] args) {

	}

	public int TreeDepth(TreeNode root) {
		if(root==null) {
			return 0;
		}
		if(root.left==null&&root.right==null) {
			return 1;
		}
		int left=0;
		int right=0;
		if(root.left!=null)
			left=1+TreeDepth(root.left);
		if(root.right!=null) {
			right=1+TreeDepth(root.right);
		}
		return Math.max(left, right);
	}
}
