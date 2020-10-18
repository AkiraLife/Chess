package Figures;

import GameSpace.FigureType;

public class Figure {

    private int x;
    private int y;
    private FigureType figureType;
    private PlayerColor playerColor;


    public Figure(int x, int y, FigureType figureType, PlayerColor playerColor) {
        this.x = x;
        this.y = y;
        this.figureType = figureType;
        this.playerColor = playerColor;
    }


    public PlayerColor getPlayerColor() {
        return playerColor;
    }

    public FigureType getFigureType() {
        return figureType;
    }
}
