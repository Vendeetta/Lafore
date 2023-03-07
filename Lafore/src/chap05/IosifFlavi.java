package chap05;

public class IosifFlavi {

    public static void main(String[] args) {
        lastInCycl(20, 7, 3);
    }

    private static void lastInCycl(int peopleInCircle, int step, int startNumber) {
        CyclicalLinkedList list = new CyclicalLinkedList();
        for (int i = 1; i < peopleInCircle; i++) {
            list.insert(i);
        }
        list.show();
        list.setCurrent(list.find(startNumber));
        while (!list.isEmpty()){
            for (int i = 1; i < step; i++) {
                list.step();
            }
            System.out.println(list.delete());
        }
    }

}
