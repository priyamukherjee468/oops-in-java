package TicTac;
//import TicTacToe.*;

public class Solution {
    public static void main(String[] args) {
        Player1 A=new Player1("james",'0');
        //A.setName("james");
        //A.setSymbol('0');
        Player1 B=new Player1("Harry",'X');
        // B.setName("Harry");
        // B.setSymbol('X');
        Player1 []players={A,B};

    
    Board board=new Board(3);
    Game game=new Game(players,board);
       game.play();
    

    }
}
