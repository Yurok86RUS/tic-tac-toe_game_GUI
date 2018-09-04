package ru.geekbrains.lesson_7;

import javax.swing.*;

public class GameBoard extends JFrame {

    static int demension = 3;
    static int cellSize = 150;
    private char[][] gameField;
    private GameButton[] gameButtons;
    private Game game;

    public GameBoard(Game currentGame){
        this.game = currentGame;
    }

}
