package offer;

public class _17HasSubtree {

	public static void main(String[] args) {

	}

	public boolean HasSubtree(TreeNode root1, TreeNode root2) {
		if (root2 == null || root1 == null) {
			return false;
		}
		boolean flag=false;
		if (root1.val != root2.val) {
			return HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
		} else {
			flag = isSame(root1, root2);
			if(!flag) {
				return HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
			}else {
				return flag;
			}
		}
	}

	private boolean isSame(TreeNode root1, TreeNode root2) {
		if(root2==null) {
			return true;
		}
		if(root1==null) {
			return false;
		}
		if(root1.val==root2.val) {
			return isSame(root1.left, root2.left)&&isSame(root1.right, root2.right);
		}else {
			return false;
		}
	}

}
