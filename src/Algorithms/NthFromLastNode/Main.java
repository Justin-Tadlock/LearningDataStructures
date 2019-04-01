package Algorithms.NthFromLastNode;

import AuxPkg.Node;

public class Main {
    public static void main(String[] args) {
        Node current = new Node(1, null);
        for (int i = 2; i < 8; i++) {
            current = new Node(i, current);
        }
        Node head = current;
        // head = 7 -> 6 -> 5 -> 4 -> 3 -> 2 -> 1 -> (null)

        Node current2 = new Node(4, null);
        for (int i = 3; i > 0; i--) {
            current2 = new Node(i, current2);
        }
        Node head2 = current2;
        // head2 = 1 -> 2 -> 3 -> 4 -> (null)

        // nthFromLast(head, 1) should return 1.
        System.out.println("Value should be 1: " + NthFromLastNode(head, 1).value );
        // nthFromLast(head, 5) should return 5.
        // nthFromLast(head2, 2) should return 3.
        // nthFromLast(head2, 4) should return 1.
        // nthFromLast(head2, 5) should return null.
        System.out.println("Value should be null: " + NthFromLastNode(head2, 5));
        // nthFromLast(null, 1) should return null.
    }

    private static Node NthFromLastNode(Node head, int n) {
        if(head == null) {
            return null;
        }

        Node nth = head;

        for(int i = 0; i < n; i++) {
            if(nth == null) {
                return null;
            }
            nth = nth.child;
        }

        while(nth != null) {
            head = head.child;
            nth = nth.child;
        }

        return head;
    }
}
