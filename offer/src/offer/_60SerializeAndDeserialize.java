package offer;

import java.util.LinkedList;
import java.util.Queue;

public class _60SerializeAndDeserialize {
	static String string = "";

	public static void main(String[] args) {
		TreeNode aNode = new TreeNode(5);
		aNode.left = new TreeNode(4);
		aNode.left.left = new TreeNode(3);
		aNode.left.left.left = new TreeNode(2);
		TreeNode bNode=null;
		String aString = Serialize(bNode);
		System.out.println(aString.length());
		String string=null;
		TreeNode aNode2=Deserialize(string);
		print(aNode2);
	}

	private static void print(TreeNode aNode2) {
		if(aNode2==null) {
			return;
		}
		LinkedList<TreeNode> linkedList=new LinkedList<>();
		linkedList.add(aNode2);
		while(!linkedList.isEmpty()) {
			TreeNode aNode=linkedList.poll();
			System.out.println(aNode.val);
			if(aNode.left!=null) 
				linkedList.add(aNode.left);
			if(aNode.right!=null) {
				linkedList.add(aNode.right);
			}
		}
	}

	static String Serialize(TreeNode root) {
		if (root == null) {
			 string += " #";
			 return string.trim();
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		string += " " + root.val;
		while (!queue.isEmpty()) {
			TreeNode temp = queue.poll();
			if (temp.left != null) {
				string += " " + temp.left.val;
				queue.add(temp.left);
			} else {
				string += " #";
			}
			if (temp.right != null) {
				string += " " + temp.right.val;
				queue.add(temp.right);
			} else {
				string += " #";
			}
		}
		return string.trim();
	}

	static TreeNode Deserialize(String str) {
		if (str==null||str.length()== 0) {
			return null;
		}
		String[] s = str.split(" ");
		if(s.length == 1 && s[0].equals("#")) {
			return null;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		TreeNode root = new TreeNode(Integer.valueOf(s[0]));
		queue.add(root);
		int flag = 1;
		int count = 1;
		while (!queue.isEmpty()) {
			TreeNode aNode = queue.poll();
			for (int i = 0; i <= 1; i++) {
				if (!s[count+i].equals("#")) {
					int a=Integer.valueOf(s[count+i]);
					TreeNode temp = new TreeNode(a);
					if (flag == 1) {
						aNode.left = temp;
						queue.add(temp);
						flag = -flag;
					} else {
						aNode.right = temp;
						queue.add(temp);
						flag = -flag;
					}
				} else {
					if (flag == 1) {
						aNode.left = null;
						flag=-flag;
					} else {
						aNode.right = null;
						flag=-flag;
					}
				}
			}
			count=count+2;
		}
		return root;
	}
}
