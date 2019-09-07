/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergelists;

/**
 *
 * @author dusti
 */
public class MergeLists {

    /**
    * Definition for singly-linked list.
    * public class ListNode {
    *     int val;
    *     ListNode next;
    *     ListNode(int x) { val = x; }
    * }
    */
    public static int returnSmallest(ListNode l1, ListNode l2) {
        int retInt = -1;
        if(l1 != null && l2 != null) {
            retInt = l1.val < l2.val ? l1.val : l2.val;
        }
        else if (l1 == null) retInt = l2.val;
        else if (l2 == null) retInt = l1.val;
        return retInt;
    }
    public static ListNode incrementPointer(ListNode list, int comp) {
        if(list != null) {
            if(list.val == comp) list = list.next;
        }
        return list;
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newList = null;
        ListNode saveList = null;
        ListNode headList = null;
        boolean same;
        
        if(l1 != null && l2 != null) {
            same = l1.val == l2.val;
            newList = new ListNode(returnSmallest(l1,l2));
            headList = newList;
            saveList = newList;
            
            if(!same) {
                l1 = incrementPointer(l1,newList.val);
                l2 = incrementPointer(l2,newList.val); 
            }
            else {
                l1 = l1.next;
            }         
        }
        same = l1.val == l2.val;
        while(l1 != null || l2 != null) {
            saveList = newList;
            newList = new ListNode(returnSmallest(l1,l2));
            saveList.next = newList;
            if(!same) {
                l1 = incrementPointer(l1,newList.val);
                l2 = incrementPointer(l2,newList.val); 
            }
            else {
                l1 = l1.next;
            }   
        }
        return headList;
    }
    
    public static void printList(ListNode list) { 
        while(list != null) {
            System.out.println("" + list.val + ",");
            list = list.next;
        }
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
        
        //printList(l1);
        
        ListNode l4 = new ListNode(1);
        ListNode l5 = new ListNode(3);
        ListNode l6 = new ListNode(4);
        l4.next = l5;
        l5.next = l6;
        
        //printList(l4);
        
        ListNode newList = mergeTwoLists(l1,l4);
        printList(newList);
    }
}
