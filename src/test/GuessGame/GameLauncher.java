package test.GuessGame;

/**
 * Created by Администратор on 24.03.2015.
 */
public class GameLauncher {

        public static void main(String[] args) {

            GuessGame guessGame = new GuessGame ();
            Players[] players=new Players[3];
            guessGame.startGame(players);
            players[0].name="Petrov";
            players[1].name="Ivanov";
            players[2].name="George";

        }

    }

