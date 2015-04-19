package test.BinarySearch;

    public class BinarySearch {
        private int []mas;
        private int searchNumbers;
        int result=0;

        public BinarySearch(int[] mas, int searchNumbers) {
            this.mas = mas;
            this.searchNumbers = searchNumbers;
        }
        public int getSearchNumbers() {
            return searchNumbers;
        }

        public void setSearchNumbers(int searchNumbers) {
            this.searchNumbers = searchNumbers;
        }

        public void searchNumber (BinarySearch binary){
            int length=binary.mas.length;
            int s=0, f=length-1, mid=0;
            System.out.println (length);
            System.out.println ("mid"+mid+"f"+f+"s"+s);
            while(s <= f){
                mid=s+(f-s)/2;
                System.out.println ("mid"+mid+"f"+f+"s"+s);
                if (binary.mas[mid]==searchNumbers){
                    System.out.println("You guess number - "+binary.mas[mid]);
                    break;
                }else if(binary.mas[mid]<searchNumbers){
                    s=(mid+1);
                }else if (binary.mas[mid]>searchNumbers){
                    f=(mid-1);
                }
            }
        }
    }




