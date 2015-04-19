package test.car;

/**
 * Created by Администратор on 15.03.2015.
 */
class Запорожец extends ВедросБолтами implements Машина {

    private String качество = "хреново";
    private String name = this.getClass().getName();

    Запорожец(String качество) {
        this.качество = качество;
    }

    @Override
    void налево() {
        System.out.println(super.getName() + " налево " + качество);
    }

    @Override
    void направо() {
        System.out.println(super.getName() + " направо " + качество);
    }

    @Override
    void тормозить() {
        System.out.println(super.getName() + " тормозим " + качество);
    }

    @Override
    public void ехать() {
        System.out.println(super.getName() + " едем " + качество);
    }
}