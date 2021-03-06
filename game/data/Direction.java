package data;

public enum Direction {

    STAY(0, 0),

    UP(0, -1),

    DOWN(0, 1),

    LEFT(-1, 0),

    RIGHT(1, 0);

    private int dx;
    private int dy;

    Direction(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public int getDx() {
        return dx;
    }

    public int getDy() {
        return dy;
    }
}
