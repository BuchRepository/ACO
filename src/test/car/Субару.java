package test.car;

/**
 * Created by Администратор on 15.03.2015.
 */
class Субару extends ГоночнаяТачка implements Машина {

    private String качество = "отлично";
    private String name = this.getClass().getName();

    Субару(String качество) {
        this.качество = качество;
    }

    @Override
    public void ехать() {
        System.out.println(super.getName() + " едем " + качество);
    }

    @Override
    void азот() {
        System.out.println(super.getName() + " пыщ пыщ " + качество);
    }

    @Override
    void гидравлика() {
        System.out.println(super.getName() + " прыг скок " + качество);
    }

    @Override
    void крутоеМузло() {
        System.out.println(super.getName() + " ё ё браза браза " + качество);
    }
}
