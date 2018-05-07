package offer;

public class _55deleteDuplication {

	public static void main(String[] args) {
		ListNode node=new ListNode(1);
		node.next=new ListNode(1);
		node.next.next=new ListNode(1);
		node.next.next.next=new ListNode(1);
		node.next.next.next.next=new ListNode(1);
		node.next.next.next.next.next=new ListNode(1);
		node.next.next.next.next.next.next=new ListNode(1);
		ListNode res=deleteDuplication(node);
		while(res!=null) {
			System.out.println(res.val);
			res=res.next;
		}
	}

	public static ListNode deleteDuplication(ListNode pHead) {
		if (pHead == null) return null;
		ListNode newhead =new ListNode(-1);
		newhead.next=pHead;
		ListNode head=newhead;
		ListNode p=pHead;
		ListNode q=pHead.next;
		while(q!=null&&p!=null) {
			if(p.val!=q.val) {
				head.next=p;
				head=p;
				p=p.next;
				q=q.next;
			}else {
				while(q!=null&&p.val==q.val) {
					q=q.next;
				}
				p=q;
				if(p!=null) {
					q=p.next;
				}
			}
		}
		head.next=p;
		return newhead.next;
	}
}
