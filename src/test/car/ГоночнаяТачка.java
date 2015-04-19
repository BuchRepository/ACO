package test.car;

/**
 * Created by Администратор on 15.03.2015.
 */
abstract class ГоночнаяТачка {

    private String name = this.getClass().getName();

    public String getName() {
        return name;
    }
    private String качество;

    public void setКачество(String качество) {
        this.качество = качество;
    }

    void налево() {
        System.out.println(name + " налево в заносе " + качество);
    }

    void направо() {
        System.out.println(name + " направо в заносе" + качество);
    }

    void тормозить() {
        System.out.println(name + " тормозим с дымом " + качество);
    }

    abstract void азот();

    abstract void гидравлика();

    abstract void крутоеМузло();
}