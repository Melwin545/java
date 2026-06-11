class Singlylinkedlist {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public void insertatbeg(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
        } else {
            temp.next = head;
            head = temp;
        }
    }

    public void insertatmid(int data) {
        int key = 23;
        Node temp = new Node(data);
        Node prev = head;

        while (prev != null && prev.data != key) {
            prev = prev.next;
        }

        if (prev != null) {
            temp.next = prev.next;
            prev.next = temp;
        } else {
            System.out.println("Key not found");
        }
    }

    public void insertatend(int data) {
        Node temp = new Node(data);

        if (head == null) {
            head = temp;
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = temp;
    }

    public void delete(int key) {
        Node temp = head;
        Node prev = null;

        if (head != null && head.data == key) {
            head = head.next;
            return;
        }

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Node not present with the given key");
            return;
        }

        prev.next = temp.next;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {

    Singlylinkedlist list = new Singlylinkedlist();

    list.insertatbeg(10);
    list.insertatbeg(20);
    list.insertatend(30);
    list.insertatmid(25);

    list.display();
}
}-