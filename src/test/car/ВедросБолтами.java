package test.car;

/**
 * Created by Администратор on 15.03.2015.
 */
abstract class ВедросБолтами {

    private String name = this.getClass().getName();

    public String getName() {
        return name;
    }
    private String качество;

    public void setКачество(String качество) {
        this.качество = качество;
    }

    void налево() {
        System.out.println(name + " налево " + качество);
    }

    void направо() {
        System.out.println(name + " направо " + качество);
    }

    void тормозить() {
        System.out.println(name + " тормозим " + качество);
    }
}

