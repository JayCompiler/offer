package offer;

import java.util.ArrayList;
import java.util.Stack;

public class _26Convert {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList=new ArrayList<>();
		TreeNode aNode=new TreeNode(10);
		TreeNode bnode=aNode.left=new TreeNode(6);
		TreeNode cnode=aNode.right=new TreeNode(14);
		TreeNode dnode=bnode.left=new TreeNode(4);
		TreeNode enode=bnode.right=new TreeNode(8);
		TreeNode fNode=cnode.left=new TreeNode(12);
		TreeNode gNode=cnode.right=new TreeNode(16);
		TreeNode rTreeNode= Convert(aNode);
		while(rTreeNode!=null) {
			System.out.println(rTreeNode.val);
			rTreeNode=rTreeNode.right;
		}
		
	}

	public static TreeNode Convert(TreeNode pRootOfTree) {
		if(pRootOfTree==null||(pRootOfTree!=null&&pRootOfTree.left==null&&pRootOfTree.right==null)) {
			return pRootOfTree;
		}
		Stack<TreeNode> stack=new Stack<>();
		ArrayList<TreeNode> rearr=new ArrayList<>();
		while(pRootOfTree!=null||!stack.isEmpty()) {
			while(pRootOfTree!=null) {
				stack.push(pRootOfTree);
				pRootOfTree=pRootOfTree.left;
			}
			pRootOfTree=stack.pop();
			rearr.add(pRootOfTree);
			pRootOfTree=pRootOfTree.right;
		}
		TreeNode res=rearr.get(0);
		res.left=null;
		res.right=rearr.get(1);
		for(int i=1;i<rearr.size()-1;i++) {
			rearr.get(i).left=rearr.get(i-1);
			rearr.get(i).right=rearr.get(i+1);
		}
		rearr.get(rearr.size()-1).left=rearr.get(rearr.size()-2);
		return res;
	}
}
