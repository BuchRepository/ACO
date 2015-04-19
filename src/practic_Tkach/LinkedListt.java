package practic_Tkach;

/**
 * Created by Администратор on 17.04.2015.
 */
public class LinkedListt {

    int size;
    String name;

    public LinkedListt() {
    }

    public LinkedListt(int size, String name){
        this.size=size;
        this.name=name;
    }

    public int getSize (){
        return size;
    }
    public void setSize(int size){
        this.size=size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString (){
        return ("size - "+getSize()+
                " name - "+getName());
    }
}
