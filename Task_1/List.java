
public class List {
    Node head;


    public void revert() {
        if (head != null && head.next != null) {
            Node temp = head;
            revert(head.next, head);
            temp.next = null;
        }
    }

    private void revert(Node currentNode, Node previousNode) {
        if (currentNode.next == null) {
            head = currentNode;
        } else {
            revert(currentNode.next, previousNode);
        }
        currentNode.next = previousNode;

    }

    public class Node {
        int value;
        Node next;

    }
}