package custom_stack;

public interface MyStackImpl<E> {

    void addInTop(E value);
    E deleteTop();
    E getTop();
    E getAndRemoveTop();
    boolean isEmpty();


}
