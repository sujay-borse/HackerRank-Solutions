// HackerRank Problem: Insert a Node at the Tail of a Linked List
// Link: https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list/problem
// Difficulty: Easy
// Language: java8



    // Complete the insertNodeAtTail function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {

        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        if(head == null){
            return newNode;
        }
        
        SinglyLinkedListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
            
        }
        temp.next = newNode;
        return head;
        
    }

