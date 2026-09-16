// HackerRank Problem: Merge two sorted linked lists
// Link: https://www.hackerrank.com/challenges/merge-two-sorted-linked-lists/problem
// Difficulty: Easy
// Language: java8



    // Complete the mergeLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

        SinglyLinkedListNode dummy = new SinglyLinkedListNode(0);
        SinglyLinkedListNode current = dummy;
        
        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                current.next = head1;
                head1 = head1.next;
            }
            else{
                current.next = head2;
                head2 = head2.next;
            }
            current = current.next;
        } 
        if (head1 != null){
            current.next = head1;
        }
        else{
            current.next = head2;
        }
        return dummy.next;
    }

