package Flyweight;

public class ChessPiece {

    private ChessPieceUnit chessPieceUnit;
    private int x;
    private int y;

    public ChessPiece(ChessPieceUnit unit, int x, int y) {
        this.chessPieceUnit = unit;
        this.x = x;
        this.y = y;
    }

    // 省略 getter()、setter()方法
}
