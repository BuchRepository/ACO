package ITEducation.homework_w1;

/**
 * Created by Администратор on 30.05.2015.
 */
public class TestCrossAndZero {

    public static void main(String[] args) {
        char[] field = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        field[4]='x';
        for (int i = 0; i <9; i++) {
            if ((i%2)==0){
                takeTurn(field,'x');
            }else{
                takeTurn(field,'o');
            }
            showTurn(field);
            char w = checkWinner(field);
            if(w!=' '){
                System.out.println("Game Over");
                break;
            }
        }
    }
}
