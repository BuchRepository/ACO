package TestSierra.Echo;

/**
 * Урок 4 - ООП - Java для тестировщиков  on 05.04.2015. https://www.youtube.com/watch?v=CYUgc0EhqS4&index=4&list=PLB0276A0A62BDEF06
 */
public class TestSum {
    public static void main(String[] args) {
        int a=10;
        Integer b= new Integer(5);
        Sum sum = new Sum();
        int result=sum.sum(a,b);
        System.out.println(result);
        System.out.println(a+" "+b);
    }
}
