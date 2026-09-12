// HackerRank Problem: Delete a Node
// Link: https://www.hackerrank.com/challenges/delete-a-node-from-a-linked-list/problem
// Difficulty: Easy
// Language: java8



class Result {

    /*
     * Complete the 'deleteNode' function below.
     *
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
     * The function accepts following parameters:
     *  1. INTEGER_SINGLY_LINKED_LIST llist
     *  2. INTEGER position
     */

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
    // Write your code here
    
    if (position == 0){
        return llist.next;
    }
    
    SinglyLinkedListNode temp = llist;
    for(int i = 0; i < position - 1; i++){
        temp = temp.next;
    }
    temp.next = temp.next.next;
    return llist;
    }

}

