package ru.geekbrains.lesson_7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameActionListener implements ActionListener
{
    private int row;
    private int cell;
    private GameButton button;

    public GameActionListener(int row, int cell, GameButton gButton){
        this.row = row;
        this.cell = cell;
        this.button = gButton;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        GameBoard board = button.getBoard();
        if (board.isTurnable(row, cell)){
            updateByPlayerData(board);
            if (board.isFull()){
                board.getGame().showMessage("Fish!");
                board.emptyField();
            }
        }
        else {
            board.getGame().showMessage("Error turn!");
        }

    }

    private void updateByPlayerData(GameBoard board){
        board.updateGameField(row, cell);
        button.setText(Character.toString(board.getGame().getCurrentPlayer().getPlayerSign()));
        if (board.checkWin()){
            button.getBoard().getGame().showMessage("You win!");
            board.emptyField();
        }
        else {
            board.getGame().passTurn();
        }
    }
}
