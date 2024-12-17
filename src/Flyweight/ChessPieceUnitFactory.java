package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class ChessPieceUnitFactory {

    private static final Map<Integer, ChessPieceUnit> unitMap = new HashMap<>();

    static {
        unitMap.put(1, new ChessPieceUnit(1, "車", Color.RED));
        unitMap.put(2, new ChessPieceUnit(2, "馬", Color.RED));
        unitMap.put(3, new ChessPieceUnit(3, "象", Color.RED));
        // 添加中国象棋的 32 个棋子 ...
    }

    public static ChessPieceUnit getChessPieceUnit(int id) {
        return unitMap.get(id);
    }
}
