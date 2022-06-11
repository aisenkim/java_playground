package algoexpert.linked_list;

public class DoublyLinkedListProgram {

    static class DoublyLinkedList {
        public Node head;
        public Node tail;

        public void setHead(Node node) {
            // Write your code here.
        }

        public void setTail(Node node) {
            // Write your code here.
        }

        public void insertBefore(Node node, Node nodeToInsert) {
            // Write your code here.
        }

        public void insertAfter(Node node, Node nodeToInsert) {
            // Write your code here.
        }

        public void insertAtPosition(int position, Node nodeToInsert) {
            // Write your code here.
        }

        public void removeNodesWithValue(int value) {
            // Write your code here.
        }

        public void remove(Node node) {
            if (node == this.head)
                this.head = this.head.next;
            if (node == this.tail)
                this.tail = this.tail.prev;
            removeNodeBindings(node);
        }

        public void removeNodeBindings(Node node) {
            // HELPER METHOD
            if (node.prev != null)
                node.prev.next = node.next;
            if (node.next != null)
                node.next.prev = node.prev;
            node.prev = null;
            node.next = null;
        }

        public boolean containsNodeWithValue(int value) {
            Node node = this.head;
            while (node != null) {
                if (node.value == value) return true;
                node = node.next;
            }
            return false;
        }
    }

    static class Node {
        public int value;
        public Node prev;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }

}
