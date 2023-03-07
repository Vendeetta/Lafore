package chap05;

public class CyclicalLinkedList {

    private Link current;

    private Link first;

    public CyclicalLinkedList() {
        current = null;
        first = null;
    }

    public void insert(int a) {
        if (first == null) {
            first = new Link(a);
            current = first;
        } else {
            Link tmp = current.next;
            current.next = new Link(a);
            if (tmp == null)
                current.next.next = first;
            else
                current.next.next = tmp;
            step();
        }
    }

    public int delete() {
        if (current.next == null || current == current.next){
            int last = current.iData;
            current = null;
            return last;
        }
        Link tmp = current.next.next;
        int res = current.next.iData;
        current.next = tmp;
        return res;
    }

    public Link find(int key) {
        Link curs = current;
        do {
            if (curs.iData == key)
                return curs;
            curs = curs.next;
        }
        while (curs != current);
        return null;
    }

    public void show() {
        Link curs = current;
        do {
            System.out.print(curs.iData + " ");
            curs = curs.next;
        }
        while (curs != current);
        System.out.println();
    }

    public Link getCurrent() {
        return current;
    }

    public void step() {
        current = current.next;
    }

    public void setCurrent (Link current) {
        this.current = current;
    }

    public boolean isEmpty() {
        return current == null;
    }
}

class CyclicalListApp {

    public static void main(String[] args) {
        CyclicalLinkedList list = new CyclicalLinkedList();
        System.out.println(list.isEmpty());
        list.insert(1);
        list.insert(2);
        System.out.println(list.isEmpty());
        list.delete();
        list.delete();
        System.out.println(list.isEmpty());
//        list.insert(1);
////        System.out.println(list.getCurrent());
//        list.insert(2);
////        System.out.println(list.getCurrent());
//        list.insert(3);
//        list.insert(4);
//        list.insert(5);
//        list.insert(6);
//        list.insert(7);
//        System.out.println(list.getCurrent());
//        list.show();
//        list.step();
////        System.out.println();
//        System.out.println(list.getCurrent());
//        System.out.println(list.delete());
//        list.show();
//        System.out.println(list.getCurrent());
//        list.step();
//        System.out.println(list.getCurrent());
//        list.step();
//        list.step();
//        System.out.println(list.getCurrent());
//        System.out.println(list.find(1).iData);
//        System.out.println(list.find(4).iData);
//        System.out.println(list.find(11));

    }
}
