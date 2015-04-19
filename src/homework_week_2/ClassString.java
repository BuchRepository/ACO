package homework_week_2;


import java.util.Scanner;

public class ClassString {
    private int size;
    private char[] value;

    public ClassString(int size, char[] value) {
        this.size = size;
        this.value = value;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public char[] getValue() {
        return value;
    }

    public void setValue(char[] value) {
        this.value = value;
    }
    /*
    public void createString (int size){
        char[] d = new char[size];

        for (int i = 0; i <d.length; i++) {
            System.out.println("Input "+i+"symbol -");
            Scanner sc = new Scanner(System.in); // System.in - console
            if (sc.hasNext()) {
                char ch = (char) sc.next();

        }
            ClassString s1 = new ClassString(d);
    }
    }*/


    public String madeString(ClassString x) {

        String srt = new String(getValue());
        // System.out.println(srt);
        return srt;
    }

    public void writeString(ClassString x) {

        String srt = new String(getValue());
        System.out.println(srt);
    }

    public void concatenation(ClassString x, ClassString y) {
        String srt1 = new String(x.getValue());
        String srt2 = new String(y.getValue());
        System.out.println(srt1 + srt2);
    }

    //Понижение регистра
    public void LowerString(ClassString x) {

        String srt = new String(x.getValue());
        System.out.println(srt.toLowerCase()); // выведет «firefox»
    }

    //Повышение регистра
    public void UpperString(ClassString x) {

        String srt = new String(x.getValue());
        System.out.println(srt.toUpperCase()); // выведет «FIREFOX»
    }

    public void searchString(ClassString x, ClassString y) {
        String srt1 = new String(x.getValue());
        String srt2 = new String(y.getValue());
        boolean b = srt1.equals(srt2);
        if (srt1.indexOf(srt2) != -1)
            System.out.println("Строка 1 содержит подстроку 2");
        else
            System.out.println("Строка 1 не содержит подстроку 2");
    }

    public void substringString(ClassString x) {
        String srt = new String(x.getValue());
        String substring = (srt);
        String result = substring.substring(2, 5);
        System.out.println(result);
    }


    public void deleteprobel(ClassString x) {
        String srt = new String(x.getValue());
        String result = srt.replaceAll(" ", "");
        System.out.println(result);
    }

    public void equalsString(ClassString x, ClassString y) {
        String srt1 = new String(x.getValue());
        String srt2 = new String(y.getValue());
        boolean b = srt1.equals(srt2);
        if(srt1.equals(srt2)) System.out.println("Строки равны"); else System.out.println("Строки не равны");
    }
}
