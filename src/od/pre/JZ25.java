//
//  class ListNode {
//    int val;
//    ListNode next = null;
//    public ListNode(int val) {
//      this.val = val;
//    }
//  }
//
//
//public class JZ25 {
//
//    public static void main(String[] args) {
//
//    }
//
//    public static  Merge (ListNode pHead1, ListNode pHead2) {
//
//        ListNode header = new ListNode(0);
//        ListNode node = header;
//
//       while (pHead1 != null && pHead2 != null) {
//
//           if(pHead1.val> pHead2.val ) {
//               ListNode tmp1 = pHead2;
//               ListNode tmp2 = pHead2.next;
//
//               tmp1.next = null;
//               node.next = tmp1;
//               node = node.next;
//               pHead2 =tmp2;
//
//           } else {
//               ListNode tmp1 = pHead1;
//               ListNode tmp2 = pHead1.next;
//
//               tmp1.next = null;
//               node.next = tmp1;
//               node = node.next;
//               pHead1 =tmp2;
//           }
//       }
//
//        while (pHead1 == null && pHead2 != null){
//            node.next = pHead2;
//            node = node.next;
//            pHead2 = pHead2.next;
//        }
//
//
//        while (pHead1 != null && pHead2 == null){
//            node.next = pHead1;
//            node = node.next;
//            pHead1 = pHead1.next;
//        }
//
//
//        return header;
//        // write code here
//    }
//}
