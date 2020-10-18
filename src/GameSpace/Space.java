package GameSpace;

/*
        1. Массив для игрового поля компьютера
        2. Массив для игрового поля игрока
 */

import Figures.Figure;
import Figures.PlayerColor;

public class Space {

    public Figure[][] space = new Figure[8][8];

    public void print() {
        for (int i = 0; i < space.length; i++) {
            for (int j = 0; j < 8; j++) {
                Figure figure = space[i][j];
                System.out.print(figure.getFigureType() + " ");

            }
            System.out.println();
        }

    }

    //Заполним масив нулями
    public void initialization() {
        for (int i = 0; i < space.length; i++) {
            for (int j = 0; j < 8; j++) {
                space[i][j] = new Figure(i, j, FigureType.None, PlayerColor.White);
            }
        }
        pawnRow();
        kingRow();
        knightRow();
        queenRow();
        bishopRow();
        rockRow();
    }

    //Заполняю пешками
    public void pawnRow() {
        for (int x = 0; x < space.length; x++) {
            space[1][x] = new Figure(x, 1, FigureType.Pawn, PlayerColor.White);
            space[6][x] = new Figure(x, 6, FigureType.Pawn, PlayerColor.Black);
        }
    }

    public void knightRow() {
        space[0][1] = new Figure(0, 1, FigureType.Knight, PlayerColor.White);
        space[0][6] = new Figure(0, 6, FigureType.Knight, PlayerColor.White);
        space[7][1] = new Figure(0, 6, FigureType.Knight, PlayerColor.Black);
        space[7][6] = new Figure(7, 6, FigureType.Knight, PlayerColor.Black);
    }

    public void kingRow() {
        space[0][3] = new Figure(0, 3, FigureType.King, PlayerColor.White);
        space[7][3] = new Figure(7, 3, FigureType.King, PlayerColor.Black);
    }

    public void queenRow() {
        space[0][4] = new Figure(0, 4, FigureType.Queen, PlayerColor.White);
        space[7][4] = new Figure(7, 4, FigureType.Queen, PlayerColor.Black);
    }

    public void bishopRow() {
        space[0][2] = new Figure(0, 2, FigureType.Bishop, PlayerColor.White);
        space[0][5] = new Figure(0, 5, FigureType.Bishop, PlayerColor.White);
        space[7][2] = new Figure(7, 2, FigureType.Bishop, PlayerColor.Black);
        space[7][5] = new Figure(7, 5, FigureType.Bishop, PlayerColor.Black);
    }

    public void rockRow() {
        space[0][0] = new Figure(0, 0, FigureType.Rook, PlayerColor.White);
        space[0][7] = new Figure(0, 7, FigureType.Rook, PlayerColor.White);
        space[7][0] = new Figure(7, 0, FigureType.Rook, PlayerColor.Black);
        space[7][7] = new Figure(7, 7, FigureType.Rook, PlayerColor.Black);
    }


    // куда могу передвигаться фигуры?

}
