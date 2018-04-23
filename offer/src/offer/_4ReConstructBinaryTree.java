package offer;

import java.util.Arrays;

public class _4ReConstructBinaryTree {

	public static void main(String[] args) {
		int[] pre= {1,2,4,7,3,5,6,8};
		int[] in= {4,7,2,1,5,3,8,6};
		TreeNode treeNode=reConstructBinaryTree(pre, in);
		printTree(treeNode);
	}

	public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		if(pre.length==0) {
			return null;
		}
		int tempin=pre[0];
		TreeNode reS=new TreeNode(tempin);
		int index=0;
		for(int i=0;i<in.length;i++) {
			if(in[i]==tempin) {
				index=i;
				break;
			}
		}
		reS.left=reConstructBinaryTree(Arrays.copyOfRange(pre, 1, index+1), Arrays.copyOfRange(in, 0, index));
		reS.right=reConstructBinaryTree(Arrays.copyOfRange(pre, index+1, pre.length), Arrays.copyOfRange(in, index+1, in.length));
		return reS;
	}
	
	public static void printTree(TreeNode tree) {
		if(tree==null) {
			return;
		}
		System.out.println(tree.val);
		printTree(tree.left);
		printTree(tree.right);
	}
}
