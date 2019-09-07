/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oddevenlinkedlist;
import java.util.*;

/**
 * @author phuze
 * @leetcode 328
 */
public class OddEvenLinkedList {
    public static ListNode connectQueues(Queue<ListNode> odds, Queue<ListNode> evens) {
        ListNode retNode = odds.element();
        ListNode curNode = null;
        for(int i = 0;i<odds.size();i++) {
            curNode = odds.remove().next = odds.peek();
        }
        curNode.next = evens.element();
        for(int i = 0;i<evens.size();i++) {
            curNode = evens.remove().next = evens.peek();
        }
        curNode.next = null;
        return retNode;
    }
    
    public static ListNode oddEvenList(ListNode head) {
        Queue<ListNode> evens = new LinkedList<>();
        Queue<ListNode> odds = new LinkedList<>();
        while(head != null) {
            if(head.val % 2 == 0)
                evens.add(head);
            else
                odds.add(head);
            
            head = head.next;
        }
        head = connectQueues(odds,evens);
        return head;
    }
   
    public static void printList(ListNode head) {
        while(head != null) {
            System.out.println("" + head.val);
            head = head.next;
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        
        ListNode newHead = oddEvenList(head);
        printList(newHead);
    }
    
}
