package ITEducation;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: Buch
 * Date: 16.05.2015
 * Time: 14:03:46
 * Homework week 1
 */
public  class Massiv {

    public static int [] bubbleSort(int[] arr){
        int []mas=arr;
        for(int i = mas.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( mas[j] > mas[j+1] ){
                int tmp = mas[j];
                mas[j] = mas[j+1];
                mas[j+1] = tmp;
                }
            }
        }
        for (int i=0; i<mas.length; i++){
            System.out.print(mas[i]+" ");
        }

        return mas;
    }

    //
    public static int [] arrayHelper (int sizeArray) {
        int []mas=new int [sizeArray];
        for (int i=0; i<mas.length; i++){
            mas[i]=(int)(Math.random()*sizeArray+1);
            System.out.print(mas[i]+" ");
            }
        return mas;
        }

    public static int  betwin (int [] array){
        int result=0, betwinResult=0, count=0;
        for (int i=0; i<array.length; i++){
            result=result+array[i];
            count=array.length;
        }
        betwinResult=result/count;
        return betwinResult;
        }
    // Find Moda
    public static int moda(int [] array) {
        int i, j, count, findMode,oldcount=0, md, oldmd=0;
        for (i=0; i<array.length; i++) {
            md = array[i];
            count = 1;
            for (j = i+1; j < array.length; j++) {
                if (md==array[j]) {
                    count=count+1;
                }
                if (count>oldcount) {
                    oldmd=md;
                    oldcount=count;
                }
            }
        }
        findMode=oldmd;
        return findMode;
    }

}
