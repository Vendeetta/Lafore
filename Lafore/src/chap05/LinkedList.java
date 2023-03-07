package chap05;

public class LinkedList {

    public static void main(String[] args) {
        LinkList theList = new LinkList();
        theList.insertFirst(22);
        theList.insertFirst(44);
        theList.insertFirst(66);
        theList.insertFirst(88);
        theList.displayList();
        // Вывод содержимого списка
//        while (!theList.isEmpty())
//        // Пока остаются элементы,
//        {
//            Link aLink = theList.deleteFirst();
//            // Удаление элемента
//            System.out.print("Deleted ");
//            // Вывод удаленного элемента
//            aLink.displayLink();
//            System.out.println("");
//        }
        theList.deleteFirst();
        theList.displayList();
        // Вывод содержимого списка
    }
}

class Link {
    // Данные (ключ)
    public int iData;
    // Данные
    // Следующий элемент в списке
    public Link next;
    public Link previous;

    public Link(int id) {
        iData = id;
    }

    public void displayLink() {
        System.out.print("{" + iData + "} ");
    }
}

class LinkList {
    // Ссылка на первый элемент списка
    private Link first;

    public LinkList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(int id) {
        Link newLink = new Link(id);
        newLink.next = first;
        first = newLink;
    }

    public Link deleteFirst() {
        Link temp = first;
        first = first.next;
        return temp;
    }

    public Link find(int key) {
        Link current = first;
        while (current.iData != key) {
            if (current.next == null)
                return null;
            else
                current = current.next;
        }
        return current;
    }

    public Link delete(int key) {
        Link current = first;
        Link previous = first;
        while (current.iData != key) {
            if (current.next == null)
                return null;
            else {
                previous = current;
                current = current.next;
            }
        }
        if (current == first)
            first = first.next;
        else
            previous.next = current.next;
        return current;
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
