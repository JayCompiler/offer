package offer;
public class _56GetNext {

	public static void main(String[] args) {
		TreeLinkNode root=new TreeLinkNode(8);
		root.left=new TreeLinkNode(6);
		root.left.next=root;
		root.right=new TreeLinkNode(10);
		root.right.next=root;
		root.left.left=new TreeLinkNode(5);
		root.left.left.next=root.left;
		root.left.right=new TreeLinkNode(7);
		root.left.right.next=root.left;
		root.right.left=new TreeLinkNode(9);
		root.right.left.next=root.right;
		root.right.right=new TreeLinkNode(11);
		root.right.right.next=root.right;
		System.out.println(GetNext(root.left.right).val);
	}

	public  static TreeLinkNode GetNext(TreeLinkNode pNode) {
		if (pNode == null) {
			return null;
		}
		if (pNode.next == null) {
			return getFirstNode(pNode.right);
		} else {
			if(pNode.right!=null) {
				return getFirstNode(pNode.right);
			}else {
				TreeLinkNode temp=pNode.next;
				while(temp!=null&&temp.left!=pNode) {
					pNode=temp;
					temp=temp.next;
				}
				return temp;
			}
		}
	}

	private static TreeLinkNode getFirstNode(TreeLinkNode right) {
		if (right == null) {
			return null;
		} else {
			while (right.left != null) {
				right = right.left;
			}
			return right;
		}
	}
}
