// AddLinkedLists.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include <iostream>

using namespace std;

/**
* Definition for singly-linked list.*/
struct ListNode {
	int val;
	ListNode *next;
	//ListNode(int x) : val(x), next(NULL) {}
	ListNode(int x) {
		val = x;
		next = NULL;
	}
	ListNode() {
		val = 0;
		next = NULL;
	}
	ListNode(int x, ListNode* ptr) {
		val = x;
		next = ptr;
	}
};

ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
	int carry = 0;

	ListNode* retList = NULL;
	ListNode* saveNode = NULL;
	while (l1 != NULL || l2 != NULL) {
		ListNode* newList = new ListNode(1);
		if (saveNode != NULL)
			saveNode->next = newList;						// saving next pointer
		else
			retList = newList;								// saving as head

		int num1 = l1 == NULL ? 0 : (*l1).val;
		int num2 = l2 == NULL ? 0 : (*l2).val;

		newList->val = (num1 + num2 + carry) % 10;
		carry = num1 + num2 + carry >= 10 ? 1 : 0;
		l1 = l1 == NULL ? NULL : l1->next;
		l2 = l2 == NULL ? NULL : l2->next;
		saveNode = newList;

		cout << newList->val << " ";
	}

	if (carry != 0) {
		ListNode* newList = new ListNode(1);
		saveNode->next = newList;
		cout << newList->val;
	}
	cout << endl;

	return retList;
}

void printList(ListNode* addedList) {
	while (addedList != NULL) {
		cout << addedList->val << " ";
		addedList = addedList->next;
	}
	cout << endl;
}

int main()
{
	ListNode* list1 = NULL;
	ListNode* list2 = NULL;

	ListNode* num1 = new ListNode(1);
	list1 = num1;

	ListNode* num2 = new ListNode(9);
	ListNode* num3 = new ListNode(9);
	num2->next = num3;
	list2 = num2;

	printList(list1);
	printList(list2);
	ListNode* addedList = addTwoNumbers(list1,list2);
	//printList(addedList);

	system("pause");

    return 0;
}