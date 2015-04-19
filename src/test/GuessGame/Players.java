package test.GuessGame;

/**
 *
 */
public class Players {

        String name;

        public void setName(String name){

        }
        public String getName(){
            return name;
        }

        public void showPlayers(Players [] players){
            for (int i=0; i<players.length; i++){
                System.out.println("Players["+i+"]"+" - "+players[i].getName()+"!");
            }
        }



    }


