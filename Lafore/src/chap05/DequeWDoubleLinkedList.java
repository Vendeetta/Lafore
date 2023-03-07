package chap05;

public class DequeWDoubleLinkedList {
    private DoublyLinkedList list;

    public DequeWDoubleLinkedList() {
        list = new DoublyLinkedList();
    }

    public void insertRight(int a) {
        list.insertLast(a);
    }

    public void insertLeft(int a) {
        list.insertFirst(a);
    }

    public int peekRight() {
        return list.peekLast().iData;
    }

    public int peekLeft() {
        return list.peekFirst().iData;
    }

    public int removeRight() {
        return list.deleteLast().iData;
    }

    public int removeLeft() {
        return list.deleteFirst().iData;
    }

    public void showDeque() {
        list.displayForward();
    }

    public int size() {
        return list.count;
    }

    public void isEmpty() {
        list.isEmpty();
    }
}

class DoublyLinkedList {
    private Link first;
    private Link last;

    int count;

    public DoublyLinkedList() {
        first = null;
        last = null;
        count = 0;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int dd) //
    {
        Link newLink = new Link(dd);
        if (isEmpty())
            last = newLink;
        else
            first.previous = newLink;
        newLink.next = first;
        first = newLink;
        count++;
    }

    public void insertLast(int dd) {
        Link newLink = new Link(dd);
        if (isEmpty())
            first = newLink;
        else {
            last.next = newLink;
            newLink.previous = last;
        }
        last = newLink;
        count++;
    }

    public Link deleteFirst() {
        Link temp = first;
        if (first.next == null)
            last = null;
        else
            first.next.previous = null; // null <-- старое значение next
        first = first.next;
        count--;
        return temp;
    }

    public Link deleteLast() {
        Link temp = last;
        if (first.next == null)
            first = null;
        else
            last.previous.next = null; // старое значение previous --> null
        last = last.previous;
        count--;
        return temp;
    }

    public void displayForward() {
        System.out.print("List (first-->last): ");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }

    public void displayBackward() {
        System.out.print("List (last-->first): ");
        Link current = last;
        while (current != null) {
            current.displayLink();
            current = current.previous; // Переход к следующему элементу
        }
        System.out.println("");
    }

    public Link peekLast() {
        return last;
    }

    public Link peekFirst() {
        return first;
    }
}

class DoublyLinkedApp {
    public static void main(String[] args) {

        DequeWDoubleLinkedList deque = new DequeWDoubleLinkedList();
        deque.insertLeft(1);
        deque.insertRight(2);
        deque.insertRight(3);
        deque.insertRight(4);
        deque.insertRight(5);
        deque.insertRight(6);
        deque.insertRight(7);
        deque.showDeque();
        System.out.println(deque.size());
        System.out.println(deque.peekLeft());
        System.out.println(deque.peekRight());
        System.out.println(deque.removeLeft());
        System.out.println(deque.removeRight());
        deque.showDeque();
        System.out.println(deque.size());
    }
}
