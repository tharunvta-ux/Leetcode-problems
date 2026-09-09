/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
       static ListNode l;
    public  void add(int data)
    {
        ListNode newNode=new ListNode(data,null);
        if(l==null)
        {
            l=newNode;
        }
        else
        {
            ListNode temp=l;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newNode;

        }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode p1=list1;
        ListNode p2=list2;
        l=null;
        while(p1!=null && p2!=null)
        {
            if(p1.val<=p2.val)
            {
                add(p1.val);
                p1=p1.next;
            }
            else
            {
                add(p2.val);
                p2=p2.next;
            }
        }
        while(p1!=null)
        {
            add(p1.val);
            p1=p1.next;
        }
         while(p2!=null)
        {
            add(p2.val);
            p2=p2.next;
        }
        return l;
    }
}