import java.util.*;
public class LinkList {
    public static void main(String[] args) {
        LinkedList<Integer> link = new LinkedList();
        link.add(56);
        link.add(30);
        link.add(70);
        System.out.println("link list before deleting 56 : "+link);
        link.removeFirst();
        System.out.println("Linked list : "+link);

    }
}
