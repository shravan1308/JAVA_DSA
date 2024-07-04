package nonPermitiveDataTypes;

import java.util.Scanner;

public class LinkedList{ 
    public static  Node<Integer> takeInput(){
        Node<Integer> head = null, tail = null;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        while(data != -1){
            Node<Integer> newNode = new Node<Integer>(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }else{
                // Node<Integer> temp = head;
                // while(temp.next != null){
                //     temp = temp.next;  // T.C = O(n^2)
                // }
                // temp.next = newNode;
                tail.next = newNode; //
                tail = newNode;// both ok tail.next;  T.C = O(n)
            }
            data = sc.nextInt();

        }
        sc.close();
        return head;
        
    }

    public static void printList(Node<Integer> head){
        // Node<Integer> temp = head; // when write jab do while loop likhenge tab ke liye line
        while(head != null){ 
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();

    }
    public static Node<Integer> deleteNode(Node<Integer> head, int pos){
        int i = 0;
        Node<Integer> temp = head;
        if(pos == 0){
            temp = temp.next;
            return temp;
        }
        while(i< pos-1){
            temp = temp.next;
            i++;
        }
        Node<Integer> temp1 = temp;
        if(temp1.next.next == null){
            temp1.next = null;
            return head;
        }
        temp.next = temp.next.next;
        return head;
    }

    public static Node<Integer> insert(Node<Integer>head,int data, int pos){
        Node<Integer> newNode = new Node<Integer>(data);
        if(pos == 0){
            newNode.next = head;
            return newNode;
        }
        int i = 0;
        Node<Integer> temp = head;
        while(i<pos-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }
    public static void increment(Node<Integer> head){
        // head = new Node<Integer>(123);  // 1
        Node<Integer> temp = head; 
        // head.data++;
        // System.out.println(head); // 1
        while(temp != null){
            temp.data++;
            temp = temp.next;
        }
    }
    public static int lengthOfLinkedList(Node<Integer> head){
        int i = 0;
        Node<Integer>temp = head;
        while(temp != null){
            temp = temp.next;
            i++;  //  yahan par ye wala code comment is liye kiya hai. hume length ke through nahi karna hai midPoint ko solve O.K
        }
        return i;
    }
    // public static int midPoint(Node<Integer> head){
    //     Node<Integer> temp = head;
    //     int n = 0;
    //     int mid = lengthOfLinkedList(head);
    //     while(n != mid/2-1){
    //         temp = temp.next; 
    //         n++;
    //     }
    //     int data = temp.data;
    //     return data;
    // }
    public static Node<Integer> midpointElse(Node<Integer> head){ 
        Node<Integer> slow = head , fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // int data = slow.data;
        return slow;
    }
    public static Node<Integer> mergeTwoLinkedList(Node<Integer> head1, Node<Integer> head2){
        if(head1 == null){
            return head2;
        }
        if(head2 == null){
            return head1;
        }
        
        Node<Integer> t1 = head1;
        Node<Integer> t2 = head2;
        Node<Integer> head = null , tail = null;
            if(t1.data <= t2.data){
                head = t1;
                tail = t1;
                t1 = t1.next;
            }else{
                head = t2;
                tail = t2;
                t2 = t2.next;
            }
            while(t1 != null && t2 != null){
                if(t1.data <= t2.data){
                    tail.next = t1;
                    tail = t1;
                    t1 = t1.next;
                }else{
                    tail.next = t2;
                    tail = t2;
                    t2 = t2.next;

                }
            }
            // one list is over
            if(t1 != null){
                // first line is remaining
                tail.next = t1;
            }else{
                tail.next = t2;
            }
            return head;
    }
    public static Node<Integer> reverseR(Node<Integer> head){
        if(head == null || head.next == null){
            return head;
        }
        Node<Integer> finalHead = reverseR(head.next) , temp;
        temp  = finalHead;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = head;
        head.next = null;
        return finalHead;
    }
    public static DoubleNode doublyReverseNodeBetterLL (Node<Integer> head){
        if(head == null || head.next == null){
            DoubleNode ans = new DoubleNode();
            ans.head = head;
            ans.tail = head;
            return ans;
        }
        DoubleNode smallAns = doublyReverseNodeBetterLL(head.next);
        smallAns.tail.next = head;
        head.next = null;
        
        DoubleNode ans = new DoubleNode();
        ans.head = smallAns.head;
        ans.tail = head;
        return ans;
    }
    public static Node<Integer> iterativeReverseLL(Node<Integer> head){
        Node<Integer> curr = head;
            Node<Integer> prev = null; 
            Node<Integer> temp;
        while(curr != null){ 
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp; 
        }
        return prev;
    }

   

    public static void main(String[] args) {
        Node<Integer> head0 = takeInput();
        System.out.println("555");
        Node<Integer> head1 = takeInput();
        // Node<Integer> head2 = takeInput();
        // Node<Integer> head = mergeTwoLinkedList(head1, head2);
        // printList(head);
        System.out.println("checking");

        Node<Integer> head3 = mergeTwoLinkedList(head0, head1);
        printList(head3);

        System.out.println("cheickkgj kldj");
        printList(head0);
        head1 = iterativeReverseLL(head1);
        printList(head1);
        DoubleNode headfinal =  doublyReverseNodeBetterLL(head0);
        printList(headfinal.head);
        // Node<Integer> mid  = midpointElse(head);
        // printList(head1);
        // printList(head2);
        // System.out.println(mid.data);
        // System.out.println(midPoint(head));




        // as beegning time code;
        // Node<Integer> node1 = new Node<Integer>(5);
        // Node<Integer> node2 = new Node<Integer>(10);
        // Node<Integer> node3 = new Node<>(15);
        // node1.next = node2;
        // node2.next = node3;
        // Node<Integer> head = node1;
        // System.out.println(node1.data);
        // printList(head);
        // printList(head);


    }
}
