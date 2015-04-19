package test.GuessGame;

/**
 * GuessGame -exemple from book Sierra, page 70, worked at Malin
 */


    import java.util.Scanner;

    public class GuessGame {

        int needNumbers=0;
        public void startGame(Players []players){
            int []numberPlayers=new int[3];
            int needNumbers=(int)(Math.random()*10);
            int winner=0;
            int result=0;
            for (int i=0; i<3;i++){
                players[i]=new Players();
                System.out.println("Create players["+(i+1)+"]");
                System.out.println("Players ["+(i+1)+"]"+" input number");
                Scanner sc=new Scanner(System.in);
                numberPlayers[i]=sc.nextInt();
                System.out.println("Players["+(i+1)+"] input - "+numberPlayers[i]);
                if (numberPlayers[i]==needNumbers){
                    winner=i;
                    result=1;
                }
            }
            if (result==1){
                System.out.println("Win players ["+(winner+1)+"]");//Як виводити повну інформацію про переможця? Якщо додати обєкт класу то не працює
            }else System.out.println ("We have not winner");
            System.out.println("randomNumber"+needNumbers);
        }
    }


