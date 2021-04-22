package dev.kishorekumar;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class QueueImplementationWithStackTest {

    @Test
    @DisplayName("Queue has to follow FIFO data structure")
    public void queue_has_to_follow_FIFO(){
        QueueImplementationWithStack<String> queueImplementationWithStack = new QueueImplementationWithStack<>();
        queueImplementationWithStack.enqueue("Here's");
        queueImplementationWithStack.enqueue("is");
        queueImplementationWithStack.enqueue("the");
        queueImplementationWithStack.enqueue("test");
        queueImplementationWithStack.enqueue("data");

        Assertions.assertEquals("Here's", queueImplementationWithStack.dequeue());
        Assertions.assertEquals("is", queueImplementationWithStack.dequeue());
        Assertions.assertEquals("the", queueImplementationWithStack.dequeue());
        Assertions.assertEquals("test", queueImplementationWithStack.dequeue());
        Assertions.assertEquals("data", queueImplementationWithStack.dequeue());
    }

}
