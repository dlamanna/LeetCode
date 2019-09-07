/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addlinkedlists;

/**
 *
 * @author dusti
 */

public class AddLinkedLists {
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        int carry = 0;
        
        if(l1 == null && l2 == null && carry == 0)
            return null;
        
        //ListNode newList = new ListNode();
        //ListNode* retList = null;
        while(l1->next != null && l2->next != null) {
            ListNode newList = new ListNode();
            newList.val = (l1.val + l2.val + carry) % 10;
            carry = l1.val + l2.val > 10 ? 1 : 0;
            l1 = l1->next;
            l2 = l2->next;
        }
        
        return retList;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    } 
}

// Definition for singly-linked list.
struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
};
