package practic_Tkach;

import java.util.LinkedList;

/**
 * Created by Администратор on 17.04.2015.
 */
public class TestLinkedList {
    public static void main(String[] args) {
        LinkedListt person1=new LinkedListt(20, "Sergey");
        LinkedList<LinkedListt> linkedListt= new LinkedList<LinkedListt>();
        linkedListt.add(person1);
        System.out.println(linkedListt.size());
        System.out.println(linkedListt);
        System.out.println("sdf");
        for (LinkedListt linkedListt1: linkedListt){
            System.out.println(linkedListt);
        }
    }
}
