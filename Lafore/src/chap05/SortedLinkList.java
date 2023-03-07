package chap05;

public class SortedLinkList {
    // Ссылка на первый элемент списка
    private Link first;

    public SortedLinkList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insert(int id, double dd) {
        Link newLink = new Link(id);
        Link current = first;
        Link previus = null;
        while (current != null && id > current.iData) {
            previus = current;
            current = current.next;
        }
        if (previus == null)
            first = newLink;
        else {
            previus.next = newLink;
        }
        newLink.next = current;
    }



    public Link delete() {
        Link tmp = first;
        first = first.next;
        return tmp;
    }

    public void displayList() {
        System.out.print("List (first-->last): ");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next; // Переход к следующему элементу
        }
        System.out.println("");
    }
}

class SortedListApp {
    public static void main(String[] args) {
        SortedLinkList theList = new SortedLinkList();
        theList.insert(22, 2.99);
        theList.insert(11, 4.99);
        theList.insert(33, 6.99);
        theList.insert(15, 8.99);
        theList.displayList();
    }
}