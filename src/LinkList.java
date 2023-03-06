import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class LinkList {

    LinkedList<Integer> link = new LinkedList();


    public static void main(String[] args) {

        LinkList ll = new LinkList();
        ll.link.add(56);
        ll.link.add(30);
        ll.link.add(70);

            int check=0;
        for(int i = 0; i<ll.link.size();i++){
            if(ll.link.get(i) == 30){
                System.out.println("link list contains 30");
                check = 1;
            }
        }
        if(check != 1){
            System.out.println("link list dose not contain 30");
        }

        System.out.println("\nLink list before inserting 40 : "+ll.link);

        ll.link.add(2,40);
        System.out.println("\nLink list after inserting 40 : "+ll.link);


    }
    public boolean checkThirty(LinkedList<Integer> l){
        return l.contains(30);

    }
    @Test
    public void checkNode(){
        link.add(30);
        assertEquals(true, checkThirty(link));

    }

}
