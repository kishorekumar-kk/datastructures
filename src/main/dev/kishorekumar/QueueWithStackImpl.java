package dev.kishorekumar;

import java.util.Stack;

public class QueueWithStackImpl<T> {

    private final Stack<T> stack = new Stack<>();

    private final Stack<T> tempStack = new Stack<>();

    public void enqueue(T inValue) {
        while (!stack.empty()) {
            tempStack.push(stack.pop());
        }
        stack.push(inValue);
        while (!tempStack.empty()) {
            stack.push(tempStack.pop());
        }
    }

    public T dequeue() {
        if (!stack.empty()) {
            return stack.pop();
        }
        return null;
    }

    public int size() {
        return this.stack.size();
    }

    @Override
    public String toString() {
        return "QueueImplementationWithStack{" +
                "stack=" + stack +
                '}';
    }
}
