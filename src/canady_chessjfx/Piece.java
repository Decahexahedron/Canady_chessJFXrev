package canady_chessjfx;

import javafx.scene.control.*;

public class Piece {

    private int x, y;
    private int a, b;
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

    public void move(int ax, int ay) {
        this.setX(this.x + (ax * a));
        this.setY(this.y + (ay * b));
    }

    public void display(Button[][] bbb) {

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

    public boolean check(Piece p, int cx, int cy) {
        return cx == p.getX() && cy == p.getY();
    }
}
