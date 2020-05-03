package linkedlists;


//public class SinglyLinkedLists {
//
//    Node head;
//
//    //Creating Node
//    static class Node {
//
//        int data;
//        Node next;
//
//        Node(int data) {
//            this.data = data;
//        }
//    }
//
//    public static SinglyLinkedLists insert(SinglyLinkedLists lists, int data) {
//
//        Node new_node = new Node(data);
//
//        new_node.next = null;
//
//        return lists;
//    }
//}


class check {
    check mycheck;
    int b, c;

    check() {

    }

    check(int a, int b) {
        this.b = a;
        this.c = b;
    }

    void checkMethod() {
        check data = new check(22, 33);
        mycheck = data;
    }

    void printValues() {
        System.out.println(mycheck.b);
        System.out.println(mycheck.c);

    }

    public static void main(String[] args) {
        check c = new check();
        c.checkMethod();
        c.printValues();

    }

}