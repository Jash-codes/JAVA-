public class new1 {

    public static void main(String[] args) {

        linkedlist list = new linkedlist();

        list.add(10);
        list.add(20);
        list.add(30);
        list.display();

        list.addfirst(5);
        list.display();

        list.addlast(35);
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

class linkedlist {
    Node head;

    public void add(int data) {
        addlast(data);
    }

    public void addfirst(int data) {
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }

    public void addlast(int data) {
        Node newnode = new Node(data);

        if (head == null) {
            head = newnode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }

    public void addatindex(int index, int data){
        if (index == 0){
            addfirst(data);
            return;
        }

        
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