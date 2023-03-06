import java.util.*;
public class LinkList {
    public static void main(String[] args) {
        LinkedList<Integer> link = new LinkedList();
        link.add(56);
        link.add(70);
        System.out.println("link list before inserting 30 : "+link);
        link.add(1,30);
        System.out.println("Linked list : "+link);

    }
}
