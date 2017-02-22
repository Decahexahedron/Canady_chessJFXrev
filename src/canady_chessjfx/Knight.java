package canady_chessjfx;

import javafx.scene.control.*;

public class Knight extends Piece {

    private int x, y;
    private int a, b;
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

    @Override
    public void move(int ax, int ay) {
        this.setX(this.x + (ax * a));
        this.setY(this.y + (ay * b));
    }

    @Override
    public void display(Button[][] bbb) {
        if (this.x > 1) { // top ones
            bbb[this.x - 2][this.y - 1].setText("o");
            bbb[this.x - 2][this.y + 1].setText("o");
        }

        if (this.x < 6) { // bottom ones
            bbb[this.x + 2][this.y - 1].setText("o");
            bbb[this.x + 2][this.y + 1].setText("o");
        }

        if (this.y > 1) { // left ones
            bbb[this.x - 1][this.y - 2].setText("o");
            bbb[this.x + 1][this.y - 2].setText("o");
        }

        if (this.y < 6) { // right ones
            bbb[this.x - 1][this.y + 2].setText("o");
            bbb[this.x + 1][this.y + 2].setText("o");
        }
    }
}
