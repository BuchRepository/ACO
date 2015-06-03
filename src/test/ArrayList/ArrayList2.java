package test.ArrayList;

import java.util.ArrayList;

/**
 * Created by Администратор on 28.03.2015.
 */
public class ArrayList2 {
    public static void main(String[] args) {

        ArrayList <Egg> s;
        s = new ArrayList <Egg>();

        Egg egg=new Egg();
        egg.setSize(10);
        egg.setName("Crokodile");
        Egg eg2=new Egg();
        eg2.setSize(15);
        eg2.setName("Pungin");
        s.add(egg);
        s.add(eg2);
        int num=s.indexOf(egg);
        System.out.println(egg.getName()+eg2.getSize()+num);
        s.remove(eg2);
        for (Egg name: s) {
            System.out.println(name);
        }




    }


}
