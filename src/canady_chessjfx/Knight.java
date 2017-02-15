package canady_chessjfx;

public class Knight extends Piece {

    private int x, y;
    private char symbol;
    private final String color;

    public Knight(int a, int b, String d) {
        this.x = a;
        this.y = b;
        this.color = d;
        if (this.color.equals("w")) {
            this.symbol = '♘';
        } else if (this.color.equals("b")) {
            this.symbol = '♞';
        }
    }

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public int getY() {
        return this.y;
    }

    @Override
    public char getSymbol() {
        return this.symbol;
    }
}
