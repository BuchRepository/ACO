package class_week_3_day2;

public class Outer {
    private int a=5;

    public class Inner{
    private int a=2;
        public void method (int a){

            System.out.println(a);
            System.out.println(this.a);
        }
    }

    public static class  Nested{
        public void method (){
            System.out.println();
        }
    }

}
