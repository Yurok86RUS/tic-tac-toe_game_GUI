package ru.geekbrains.lesson_7;

public class Game {

    private GameBoard board;
    private GamePlayer[] gamePlayers = new GamePlayer[2];
    private int playersTurn = 0;

    public Game(){
        this.board = new GameBoard(this);
    }

    public void initGame(){
        gamePlayers[0] = new GamePlayer(true, 'X');
        gamePlayers[1] = new GamePlayer(false, 'O');
    }

}
