package class_week_3_day1;



public class Apple implements Comparable<Apple>{
    private int size;
    private String type;

    public Apple(int size, String type) {
        this.size = size;
        this.type=type;

    }

    @Override
    public int compareTo(Apple apple) {
        //size > apple.size ? 1: size
        int result=0;
        if (size>apple.size){
            result=1;
        }
        if (size<apple.size){
            result=-1;
        }
        return result;

    }
/*

    for(int i=0; i<a.length; i++)
    {
        a[i]=(int)(Math.random()*100);
        System.out.print(a[i] + "  ");
    }
    System.out.print(" \n ");
    for(int i=a.length-1; i>0; i--)
    {
        //System.out.print(a[i] + "  ");
        for (int j=0; j<i; j++)
        {
            if (a[j]>a[j+1])
            {
                int tmp = a[j];
                a[j] = a[j+1];
                a[j+1] = tmp;
            }
        }
        System.out.print(a[i] + "  ");
    }*/
}
