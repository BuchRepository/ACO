package test.BinarySearch;
/*
 * Class exemple 21/03/15 from Malin work
 */

     public class TestBinary {

        public static void main(String[] args) {

            int mas[]= {1,3,4,5,8,10,11,15};
            BinarySearch binary=new BinarySearch(mas, 3); //не получилось массив сразу передать в конструктор класа
            binary.searchNumber(binary);

        }

    }

