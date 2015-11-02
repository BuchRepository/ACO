import java.util.Scanner;

/**
 * Created by Администратор on 30.05.2015.
 */

public class CrossAndZero{


        static Scanner sc = new Scanner(System.in);

        //drawing field croos and zero
        public static void showTurn(char[] field) {
            for (int i = 0; i <3; i++) {
                for (int j = 0; j <3 ; j++) {
                    System.out.printf("|%s|", field[j]);
                }
                System.out.println("\n---------");
            }
        }

        public static void takeTurn(char [] field, char player){
            int t=-1;
            System.out.println("Gamer "+player);
            do {
                int stage=sc.nextInt();
            } while (t<0 || t>8 || field[t]!=' ');
            field[t]=player;
        }

        public static char checkWinner(char[] field){

            if (field[0]=='x' && field[1]=='x' && field[2]=='x' ){
                return 'x';
            }
            return ' ';
        }

    }


