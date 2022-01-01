package practice;

import java.util.Deque;
import java.util.LinkedList;

public class Practice {

    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.add(1);
        deque.add(2);
        deque.add(3);


        System.out.println(deque.peekFirst());
    }
}
