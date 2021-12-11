package homework4;

import Lesson3.stack.Stack;

public class Main {

    public static void main(String[] args) {
        LinkedList  <String>linkedList = new SimpleLinkedListImpl();
        Stack <Integer> stack =new LinkedListStack<>();
        TwoSideLinkedListImpl <String> twoSideLinkedList = new TwoSideLinkedListImpl<>();


        linkedList.insertFirst("Java");
        linkedList.insertFirst("World");
        linkedList.insertFirst("Hello");
        linkedList.display();
        System.out.println("");
        System.out.println(linkedList.contains("World"));
        linkedList.remove("World");
        System.out.println(linkedList.contains("World"));
        linkedList.display();

        stack.push(10);
        stack.push(11);
        stack.push(13);
        stack.display();
        System.out.println(stack.pop());
        stack.display();


        twoSideLinkedList.insertFirst("One");
        twoSideLinkedList.insertFirst("two");
        twoSideLinkedList.insertLast("zero");
        twoSideLinkedList.display();



    }
}
