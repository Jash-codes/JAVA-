import java.util.*;

public class a {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Current List : " + list);

        list.addFirst(5);

        list.addLast(35);

        System.out.println("List after changes : " + list);

        list.add(3, 25);
        System.out.println("List after adding in middle : " + list);

        list.remove(1);
        System.out.println("List after removing in middle : " + list);

    }
}