package org.datastructures.queue;

import org.datastructures.linkedlist.Node;

public class QueueLinkedList {
    Node front, rear;
    public QueueLinkedList() {
        this.front = null;
        this.rear = null;
    }

    /*
    Here is a data structure that implements a FIFO algorithm for data flow.
     */

    void enqueue(int key) {

        Node temp = new Node(key);
        if (this.rear == null) {
            this.front = this.rear = temp;
            return;

        }
        this.rear.next = temp;
        this.rear = temp;
    }


    Node dequeue() {

        if (this.front == null) return null;

        Node temp = this.front;
        this.front = this.front.next;

        if (this.front == null)
            this.rear = null;

        return temp;
    }

    public static void printList(QueueLinkedList list) {

        Node currentNode = list.front;

        System.out.print("Linked List Elements: "); while (currentNode != null) {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }

        System.out.println();
    }


    public static void main(String[] args) { QueueLinkedList q = new QueueLinkedList(); q.enqueue(1);
        q.enqueue(2); q.enqueue(3);
        printList(q);
        System.out.println("Dequeued item is " + q.dequeue().value);
        printList(q);
    }
}