package canady_chessjfx;

public class Piece {

    private int x, y;
    private char symbol;
    private String color;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Piece{" + "x=" + x + ", y=" + y + ", symbol=" + symbol + ", color=" + color + '}';
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public char getSymbol() {
        return this.symbol;
    }

    public String getColor() {
        return this.color;
    }
}
