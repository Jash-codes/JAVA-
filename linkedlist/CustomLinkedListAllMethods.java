public class CustomLinkedListAllMethods {

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();

        list.add(10);
        list.add(20);
        list.add(30);

        list.display();

    }

}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

}

class MyLinkedList {
    Node head;

    public void add(int data) {
        addLast(data);
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public void addAtIndex(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            if (temp == null) {
                System.out.println("Index out of bounds");
                return;
            }

            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void remove(int key) {
        if (head == null)
            return;

        if (head.data == key) {
            head = head.next;
            return;
        }

        Node temp = head;
        Node prev = null;

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null)
            return;

        prev.next = temp.next;
    }

    public void display() {

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");

    }
}
