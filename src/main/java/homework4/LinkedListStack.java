package homework4;

import Lesson3.stack.Stack;

public class LinkedListStack<E> implements Stack {
    private final LinkedList<E> data;

    public LinkedListStack() {
        this.data = new SimpleLinkedListImpl<>();
    }

    @Override
    public void push(Object value) {
        data.insertFirst((E) value);
    }

    @Override
    public E pop() {
        return data.removeFirst();
    }

    @Override
    public E peek() {
        return data.getFirst();
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void display() {
        data.display();
    }

    @Override
    public String toString() {
        return "LinkedListStack{" + "data=" + data + '}';
    }
}
