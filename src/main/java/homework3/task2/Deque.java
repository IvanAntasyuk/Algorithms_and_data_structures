package homework3.task2;

public interface Deque<E> extends Queue<E> {

    boolean insertLeft(E value);
    boolean insertRight(E value);

    E removeLeft();
    E removeRight();
}