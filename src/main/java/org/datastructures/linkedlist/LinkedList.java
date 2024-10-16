    package org.datastructures.linkedlist;

    public class LinkedList {

        Node head;


        public boolean isEmpty() {
            return head.next == null;
        }

        public Node insertNode(int value) {
            if (isEmpty()) {
                head = new Node(value);
            } else {
                Node lastNode = head;
                while (lastNode.next != null) {
                    lastNode = lastNode.next;
                }
                lastNode.next = new Node(value);
            }
            return head;
        }


        public void deleteNode(int value) {

            /*
             Java no tiene una gestion de memoria tan directa como C,
             asi que se lo dejamos como tarea al Garbage Collector. OJO
             */

            if (head == null) return;

            if (head.value == value) {
                head = head.next;
                return;
            }

            Node prev = null;
            Node current = head;

            while (current != null && current.value != value) {
                prev = current;
                current = current.next;
            }

            if (current != null) {
                prev.next = current.next;
                current.next = null;
            }
        }



        public void deleteAllNodes() {
            /*
            Esto no borra nada, solo hace perder la referencia de los nodos
            dentro de la linked list.
             */
            head = null;
        }



        public void printAllNodes() {
            Node current = head;
            while (current.next != null) {
                System.out.println(current.value + " -> ");
                current = current.next;
            }
            System.out.println(" -> null");
        }

        public static void main(String[] args) {

            LinkedList list = new LinkedList();

            System.out.println("Insertando nodos:");
            list.insertNode(10);
            list.insertNode(20);
            list.insertNode(30);
            list.printAllNodes();

            System.out.println("\nEliminando el nodo con valor 20:");
            list.deleteNode(20);
            list.printAllNodes();

            System.out.println("\nEliminando el nodo con valor 10:");
            list.deleteNode(10);
            list.printAllNodes();

            System.out.println("\nEliminando el nodo con valor 30:");
            list.deleteNode(30);
            list.printAllNodes();

            System.out.println("\nIntentando eliminar un nodo de una lista vacia:");
            list.deleteNode(40);
            list.printAllNodes();
        }
    }


