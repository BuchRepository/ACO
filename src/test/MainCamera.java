package test;

/**
 * Created by Администратор on 03.03.2015.
 */
class MainCamera {
    public static void main(String [] args) {
        Camera [] myBooks = new Camera[3];
        int x = 0;
        myBooks[0] = new Camera ("Плоды Java","Боб");
        myBooks[1] = new Camera ("Java Гэтсби", "Сью");
        myBooks[2] = new Camera ("Сборник рецептов по Джава", "Ян");

      /*  myBooks[0].setTitle("Плоды Java");
        myBooks[1].setTitle("Java Гэтсби");
        myBooks[2].setTitle("Сборник рецептов no Java");
        myBooks[0].author = "Боб";
        myBooks[1].author = "Сью";
        myBooks[2].author = "Ян";*/
        //myBooks[1].getTitle();
        while (x < 3) {
            myBooks[x].print();
            x = x + 1;
        }


    }
}
