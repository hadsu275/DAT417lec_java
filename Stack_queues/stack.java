package Stack_queues;

import java.util.ArrayList;

public class stack {
    private ArrayList<Integer> stack;

    // konstruktor
    public void Stack() {
        stack = new ArrayList<>();
    }

    // lägg till element i stacken (push)
    public void push(int elm) {
        stack.add(elm);
    }

    // ta bort top-element (pop)
    public Integer pop() {
        if (isEmpty()) {
            System.out.println("Stacken är tom");
            return null;
        }
        return stack.remove(stack.size() - 1);
    }

    // kolla top-element (peek)
    public Integer peek() {
        if (isEmpty()) {
            System.out.println("Stacken är tom");
            return null;
        }
        return stack.get(stack.size() - 1);
    }

    // kolla om stacken är tom
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // returnera storlek på stacken
    public int sizeStack() {
        return stack.size();
    }

    // skriva ut stacken
    @Override
    public String toString() {
        return stack.toString();
    }
}
