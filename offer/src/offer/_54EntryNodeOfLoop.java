package offer;

public class _54EntryNodeOfLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode EntryNodeOfLoop(ListNode pHead) {
		if(pHead==null) {
			return null;
		}
		ListNode p=pHead.next;
		if(p==null) {
			return null;
		}
		ListNode p2=pHead.next.next;
		if(p2==null) {
			return null;
		}
		while(p!=p2) {
			p=p.next;
			if(p==null) {
				return null;
			}
			p2=p2.next.next;
			if(p2==null) {
				return null;
			}
		}
		p=pHead;
		while(p!=p2) {
			p=p.next;
			p2=p2.next;
		}
		return p;
	}
	public ListNode EntryNodeOfLoop1(ListNode pHead) {
		if(pHead==null||pHead.next==null) return  null;
		ListNode p1=pHead;
		ListNode p2=pHead;
		while(p2!=null&&p2.next!=null) {
			p1=p1.next;
			p2=p2.next.next;
			if(p1==p2) {
				p1=pHead;
				while(p1!=p2) {
					p1=p1.next;
					p2=p2.next;
				}
				return p1;
			}
		}
		return null;
	}

}
