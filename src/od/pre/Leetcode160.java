//class ListNode {
//    int val;
//    ListNode next;
//    ListNode(int x) {
//        val = x;
//        next = null;
//    }
//}
//
//public class Leetcode160 {
//
//    public static void main(String[] args) {
//
//    }
//
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//
//
////        while (headA != null){
////            ListNode pB = headB;
////            while (pB.next != null){
////                if(headA.equals(pB)){
////                    return headA;
////                } else {
////                    pB = pB.next;
////                }
////            }
////
////            headA = headA.next;
////        }
////
////        return null;
//
//        int countA = 0;
//        int countB = 0;
//        ListNode aEnd = null;
//        ListNode bEnd = null;
//
//        while (headA != null){
//            if(headA.next == null){
//                aEnd = headA;
//            }
//            headA = headA.next;
//
//            countA++;
//        }
//
//        while (headB != null){
//            if(headB.next == null){
//                bEnd = headB;
//            }
//            headB = headB.next;
//            countB++;
//        }
//
//        if(!aEnd.equals(bEnd)){
//            return null;
//        }
//
//        if(countA>countB){
//            while(countA - countB>0){
//                headA = headA.next;
//                countA--;
//            }
//
//            return headA.next;
//        } else {
//            while(countB - countA>0){
//                headB = headB.next;
//                countB--;
//            }
//
//            return headB.next;
//        }
//
//
//    }
//}
