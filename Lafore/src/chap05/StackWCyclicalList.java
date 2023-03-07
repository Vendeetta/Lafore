package chap05;

public class StackWCyclicalList {

    private CyclicalLinkedList list;

    public StackWCyclicalList() {
        list = new CyclicalLinkedList();
    }

    public void push(int a) {
        list.insert(a);
    }

    public int pop() {
        Link current = list.getCurrent();
        Link tmp = current.next;
        while (tmp.next != current)
            tmp = tmp.next;
        list.setCurrent(tmp);
        return list.delete();
    }

    public int peek() {
        return list.getCurrent().iData;
    }

    public void showStack() {
        list.show();
    }
}
class StackApp {

    public static void main(String[] args) {
        StackWCyclicalList stack = new StackWCyclicalList();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.showStack();
        stack.push(5);
        stack.showStack();
        System.out.println(stack.peek());
        System.out.println(stack.pop());
    }
}
