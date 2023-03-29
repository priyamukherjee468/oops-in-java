package TicTac;

 class Player1 {
    private String name;
    private char symbol;
    Player1(String name,char symbol){
        this.name =name;
        this.symbol=symbol;
    }
    Player1(){
        
    }
    public String getName(){
        return this.name;
    }
    public char getSymbol(){
        return this.symbol;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSymbol(char symbol){
        this.symbol=symbol;
}
}
