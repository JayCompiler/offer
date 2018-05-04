package offer;


public class _35FindFirstCommonNode {

	public static void main(String[] args) {

	}

	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		ListNode p=pHead1;
		ListNode q=pHead2;
		ListNode res=null;
		Out:
		while(p!=null) {
			while(q!=null) {
				if(p.val==q.val&&p.next==q.next) {
					res=p;
					break Out;
				}else {
					q=q.next;
				}
			}
			q=pHead2;
			p=p.next;
		}
		return res;
	}
}
