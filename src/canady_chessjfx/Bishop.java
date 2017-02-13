package canady_chessjfx;

public class Bishop extends Piece {

    private int x, y;
    private char symbol;
    final private String color;

    public Bishop(int a, int b, String d) {
        this.x = a;
        this.y = b;
        this.color = d;
        if (this.color.equals("w")) {
            this.symbol = '♗';
        } else if (this.color.equals("b")) {
            this.symbol = '♝';
        }
    }

    @Override
    public int getX() {
        System.out.println("This happened");
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
