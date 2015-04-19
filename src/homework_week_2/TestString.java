package homework_week_2;


import java.util.Scanner;

public class TestString {

    public static void main(String[] args) {

       ClassString s1 = new ClassString(3, new char []  {'p', 'u', 't', 'i', 'n'});
       ClassString s2 = new ClassString(3, new char []  {'x', 'u', ' ', 'l', 'o'});
        System.out.println("List of possible commands:\n" +
                "1. Cоздание строки на основе массива символов\n" +
                "2. Вывод на экран\n" +
                "3. Конкатенация\n" +
                "4. Понижение регистра\n" +
                "5. Повышение регистра\n" +
                "6. Поиск подстроки\n" +
                "7. Выделение подстроки \n" +
                "8. Удаление пробелов\n" +
                "9. Метод для сравнения с другой строкой\n" +
                "\n"+
                "Just do it");
        int chooseAction = 0;

        Scanner sc = new Scanner(System.in); // System.in - console
        if (sc.hasNextInt()) {
            chooseAction = sc.nextInt(); // get int from console
            switch (chooseAction) {
                case 1:
                    s1.madeString(s1);
                    //      System.out.println(company.Print());
                    break;
                case 2:
                    s1.writeString(s2);
                    break;
                case 3:
                    s1.concatenation(s1, s2);
                    break;
                case 4:
                    s1.LowerString(s1);
                    break;
                case 5:
                    s1.UpperString(s1);
                    break;
                case 6:
                    s1.searchString(s1, s2);
                    break;
                case 7:
                    s1.substringString(s2);
                    break;
                case 8:
                    s1.deleteprobel(s2);
                    break;
                case 9:
                    s1.equalsString(s1, s2);
                    break;
            }


        }
    }
}
