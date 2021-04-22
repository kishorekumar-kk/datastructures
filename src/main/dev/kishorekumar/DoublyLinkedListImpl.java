package dev.kishorekumar;

public class DoublyLinkedListImpl<T> {

    Node<T> head;

    static class Node<T> {
        T value;

        Node<T> prev;

        Node<T> next;

        public Node(T value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    '}';
        }
    }

    public void push(T data) {
        Node<T> node = new Node<T>(data);
        node.next = head;
        node.prev = null;

        if (head != null) {
            head.prev = node;
        }

        head = node;
    }

    public void insertAfter(Node<T> previousNode, T data) {
        if(previousNode == null) {
            return;
        }

        Node<T> newNode = new Node<>(data);
        newNode.next = previousNode.next;
        previousNode.next = newNode;
        newNode.prev = previousNode;

        if(newNode.next != null) {
            newNode.next.prev = newNode;
        }
    }

    public void insertBefore(Node<T> nextNode, T data) {
        if(nextNode == null) {
            return;
        }

        Node<T> newNode = new Node<>(data);
        newNode.prev = nextNode.prev;
        nextNode.prev = newNode;
        newNode.next = nextNode;

        if(newNode.prev != null) {
            newNode.prev.next = newNode;
        } else {
            head = newNode;
        }

    }

    public void delete(Node<T> node) {
        if(head == null || node == null) {
            return;
        }

        if (head == node) {
            head = node.next;
        }

        if(node.next != null) {
            node.next.prev = node.prev;
        }

        if (node.prev != null) {
            node.prev.next = node.next;
        }
    }

    public int size() {
        int size = 0;
        Node<T> node = head;
        while (node != null) {
            node = node.next;
            size++;
        }
        return size;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("DoublyLinkedListImpl{");
        stringBuilder.append("head=").append(head).append(",values=").append(head);
        Node<T> next = head.next;
        while (next != null) {
            Node<T> data = next;
            stringBuilder.append(",").append(data.toString());
            next = data.next;
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

}
