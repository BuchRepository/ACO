package test;
public class TestNumber {
  /*  public TestNumber() {
    }*/

    public static void main(String[] args) {
        Number n1 = new Number(5.0);
        Number n2 = new Number(8.0);
        Number result=(n1.addNumber(n2));
        System.out.println("d");
        System.out.println(n1.addNumber(n2));

        System.out.println(result);
        System.out.println(n1.equals(n2));

        System.out.println(n1.getValue());
        System.out.println(result.getValue());
        System.out.println(result.toString());
        String s = new String("test");
        String s2 = "test";
        System.out.println(s == s2);
        Integer i = Integer.valueOf(5);
        Integer i2 = Integer.valueOf(5);
        System.out.println(i == i2);
    }
}
