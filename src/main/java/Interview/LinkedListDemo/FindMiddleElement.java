package Interview.LinkedListDemo;


import java.util.LinkedList;

public class FindMiddleElement {

    Node head;

    class  Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }

    }

        void printMiddle(){
            Node slowPointer = head;
            Node fastPointer = head;

            if(head != null){
                while (fastPointer != null && fastPointer.next != null){

                    fastPointer = fastPointer.next.next;
                    slowPointer = slowPointer.next;
                }

                System.out.println("Middle Element:" + slowPointer.data);
            }
        }

        public void add(Node node){
            if(head == null){
               head = node;
            }else {
                Node temp = head;
                while (temp.next != null){
                    temp = temp.next;
                }
                temp.next = node;
            }
        }

        public void printAll(){
            Node tnode = head;
            while (tnode != null){
                System.out.print(tnode.data + "->");
                 tnode= tnode.next;
            }
            System.out.println("NULL");
        }

        public boolean hasCycle(){
        if (head == null){
            return false;
        }

        Node slowpointer = head;
        Node fastpointer = head;

        while (fastpointer != null && fastpointer.next != null){
                slowpointer = slowpointer.next;
                fastpointer = fastpointer.next.next;

                if (fastpointer == slowpointer){
                    return true; // found Cycle
                }
        }

        return false; // No cycle found
        }



    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        System.out.println(linkedList);

        FindMiddleElement ll = new FindMiddleElement();

        Node first = ll.new Node(1);
        Node second = ll.new Node(2);
        Node third = ll.new Node(3);
        Node fourth = ll.new Node(4);
        Node fifth = ll.new Node(5);

        ll.add(first);
        ll.add(second);
        ll.add(third);
        ll.add(fourth);
        ll.add(fifth);

        fifth.next = third;

       // ll.printAll();

        //ll.printMiddle();

        if (ll.hasCycle()) {
            System.out.println("Cycle detected in the linked list.");
        } else {
            System.out.println("No cycle detected in the linked list.");
        }


    }
}
