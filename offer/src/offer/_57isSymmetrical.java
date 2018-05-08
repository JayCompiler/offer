package offer;

public class _57isSymmetrical {

	public static void main(String[] args) {

	}

	boolean isSymmetrical(TreeNode pRoot) {
		if(pRoot==null) {
			return true;
		}
		if(pRoot.left==null&&pRoot.right==null) return true;
		boolean flag=isSame(pRoot.left,pRoot.right);
		return flag;
	}

	private boolean isSame(TreeNode left, TreeNode right) {
		if(left==null&&right==null) return true;
		if((left!=null&&right==null)||(left==null&&right!=null)) return false;
		if(left.val!=right.val) {
			return false;
		}else {
			return isSame(left.left, right.right)&&isSame(left.right, right.left);
		}
	}


}
