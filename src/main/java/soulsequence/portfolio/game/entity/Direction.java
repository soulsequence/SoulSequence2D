package soulsequence.portfolio.game.entity;

public enum Direction {
    Down(0),
    Left(1),
    Right(2),
    Up(3);

    private final int direction;

    Direction(int i) {
        this.direction = i;
    }

    public int getDirection() {
        return direction;
    }
}
