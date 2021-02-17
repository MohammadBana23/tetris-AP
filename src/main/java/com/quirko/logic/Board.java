package com.quirko.logic;

public interface Board {

    boolean moveBrickDown();

    void moveBrickLeft();

    void moveBrickRight();

    void rotateLeftBrick();

    boolean createNewBrick();

    int[][] getBoardMatrix();

    ViewData getViewData();

    void mergeBrickToBackground();

    ClearRow clearRows();

    Score getScore();

    void newGame();
}
