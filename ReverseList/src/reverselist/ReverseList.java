/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverselist;
import java.util.*;

/**
 *
 * @author dusti
 */
public class ReverseList {

    /**
     * @param args the command line arguments
     */
    
    public static ListNode reverseList(ListNode head) {
        ListNode tempPtr = head;
        Stack listStack = new Stack();
        while(tempPtr != null) {
            listStack.push(tempPtr);
            tempPtr = tempPtr.next;
        }
        
        ListNode newHead = (ListNode)listStack.pop();
        ListNode savedPtr = newHead;
        while(!listStack.isEmpty()) {
            ListNode newNode = (ListNode)listStack.pop();
            System.out.println("New Node: " + newNode.val);
            savedPtr.next = newNode;
            savedPtr = newNode;
            //printList(newHead);
        }
        
        return newHead;
    }
   
    public static void printList(ListNode head) {
        while(head != null) {
            System.out.println(head.val);
            head = head.next;
        }
        System.out.println("---------------------------");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        ListNode head = new ListNode(5);
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(1);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        printList(head);
        ListNode newHead = reverseList(head);
        //printList(newHead);
    }
    
}
