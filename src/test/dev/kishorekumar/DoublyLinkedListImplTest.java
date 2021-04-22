package dev.kishorekumar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DoublyLinkedListImplTest {

    @Test
    @DisplayName("size() should exact size of nodes in collection")
    public void size() {
        DoublyLinkedListImpl<String> doublyLinkedList = new DoublyLinkedListImpl<>();
        doublyLinkedList.push("hello");
        doublyLinkedList.push("world");
        doublyLinkedList.push("this");
        doublyLinkedList.push("is");
        doublyLinkedList.push("our");
        doublyLinkedList.push("test");

        Assertions.assertEquals(6, doublyLinkedList.size());

    }

    @Test
    @DisplayName("push() should populate data to collection")
    public void push() {
        DoublyLinkedListImpl<String> doublyLinkedList = new DoublyLinkedListImpl<>();
        doublyLinkedList.push("I");
        doublyLinkedList.push("am");
        doublyLinkedList.push("pushing");
        doublyLinkedList.push("data");

        Assertions.assertEquals(4, doublyLinkedList.size());
        Assertions.assertEquals("data", doublyLinkedList.head.value);
        Assertions.assertEquals("pushing", doublyLinkedList.head.next.value);
        Assertions.assertEquals("am", doublyLinkedList.head.next.next.value);
        Assertions.assertEquals("I", doublyLinkedList.head.next.next.next.value);

    }

    @Test
    @DisplayName("insertAfter() should populate data after specified node")
    public void insertAfter() {

        DoublyLinkedListImpl<String> doublyLinkedList = new DoublyLinkedListImpl<>();
        doublyLinkedList.push("Paint");
        doublyLinkedList.push("the");
        doublyLinkedList.push("red");

        Assertions.assertEquals(3, doublyLinkedList.size());

        DoublyLinkedListImpl.Node<String> node = doublyLinkedList.head;
        doublyLinkedList.insertAfter(node, "town");

        Assertions.assertEquals(4, doublyLinkedList.size());

        Assertions.assertEquals("red", doublyLinkedList.head.value);
        Assertions.assertEquals("town", doublyLinkedList.head.next.value);
        Assertions.assertEquals("the", doublyLinkedList.head.next.next.value);
        Assertions.assertEquals("Paint", doublyLinkedList.head.next.next.next.value);

    }

    @Test
    @DisplayName("insertBefore() should populate data before specified node")
    public void insertBefore() {

        DoublyLinkedListImpl<String> doublyLinkedList = new DoublyLinkedListImpl<>();
        doublyLinkedList.push("Paint");
        doublyLinkedList.push("town");
        doublyLinkedList.push("red");

        Assertions.assertEquals(3, doublyLinkedList.size());

        DoublyLinkedListImpl.Node<String> node = doublyLinkedList.head.next;
        doublyLinkedList.insertAfter(node, "the");

        Assertions.assertEquals(4, doublyLinkedList.size());

        Assertions.assertEquals("red", doublyLinkedList.head.value);
        Assertions.assertEquals("town", doublyLinkedList.head.next.value);
        Assertions.assertEquals("the", doublyLinkedList.head.next.next.value);
        Assertions.assertEquals("Paint", doublyLinkedList.head.next.next.next.value);

    }

    @Test
    @DisplayName("delete() should delete the specified node")
    public void delete() {

        DoublyLinkedListImpl<String> doublyLinkedList = new DoublyLinkedListImpl<>();
        doublyLinkedList.push("Paint");
        doublyLinkedList.push("the");
        doublyLinkedList.push("town");
        doublyLinkedList.push("in");
        doublyLinkedList.push("red");

        Assertions.assertEquals(5, doublyLinkedList.size());

        DoublyLinkedListImpl.Node<String> node = doublyLinkedList.head.next;
        doublyLinkedList.delete(node);

        Assertions.assertEquals(4, doublyLinkedList.size());

        Assertions.assertEquals("red", doublyLinkedList.head.value);
        Assertions.assertEquals("town", doublyLinkedList.head.next.value);
        Assertions.assertEquals("the", doublyLinkedList.head.next.next.value);
        Assertions.assertEquals("Paint", doublyLinkedList.head.next.next.next.value);

    }



}
