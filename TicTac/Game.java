package TicTac;

 class Game {
  Player1 []players;
  Board board;
  int turn;   //torn=0(p1) & 1(p2)
  int moves;  //true/false
  boolean gameover;
  Game(Player1 []players,Board board){
    this.players=players;
    this.board=board;
    turn=0;
    moves=0;
    gameover=false;
  }
  private void printBoard(){
    for(int i=0;i<board.size;i++){
        for(int j=0;j<board.size;j++){
            System.out.print(board.board[i][j]+" ");
        
        } 
        System.out.println();
    }
  }
  public void play(){
    printBoard();
  }

}
