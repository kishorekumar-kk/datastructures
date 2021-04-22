package dev.kishorekumar;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class QueueWithStackImplTest {

    @Test
    @DisplayName("Queue has to follow FIFO data structure")
    public void queue_has_to_follow_FIFO(){
        QueueWithStackImpl<String> queueWithStackImpl = new QueueWithStackImpl<>();
        queueWithStackImpl.enqueue("Here's");
        queueWithStackImpl.enqueue("is");
        queueWithStackImpl.enqueue("the");
        queueWithStackImpl.enqueue("test");
        queueWithStackImpl.enqueue("data");

        Assertions.assertEquals("Here's", queueWithStackImpl.dequeue());
        Assertions.assertEquals("is", queueWithStackImpl.dequeue());
        Assertions.assertEquals("the", queueWithStackImpl.dequeue());
        Assertions.assertEquals("test", queueWithStackImpl.dequeue());
        Assertions.assertEquals("data", queueWithStackImpl.dequeue());
    }

    @Test
    @DisplayName("size() method should return valid size of Queue")
    public void valid_size_has_to_be_returned_by_size(){
        QueueWithStackImpl<String> queueWithStackImpl = new QueueWithStackImpl<>();
        queueWithStackImpl.enqueue("Here's");
        queueWithStackImpl.enqueue("is");
        queueWithStackImpl.enqueue("the");
        queueWithStackImpl.enqueue("test");
        queueWithStackImpl.enqueue("data");

        Assertions.assertEquals(5, queueWithStackImpl.size());
    }

}
