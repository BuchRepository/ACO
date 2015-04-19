package class_week_4_day2;


public class Binary {

    public static int searchValue(int[] mas, int searchValue) {

        int length = mas.length; //length massiv
        int start=0;//starts index massiv
        int end=length-1;//finished index

        do {
           int mid = (start+end)/2;
            if (mas[mid]==searchValue){
                return mid;
            }
            if (mas[mid]>searchValue){
                end=mid-1;

            } else if (mas[mid]<searchValue)
            start=mid+1;
        }
        while (start <= end);
        return -1;
    }

}



