package canady_chessjfx;

public class King extends Piece {

    private int x, y;
    private char symbol;
    private final String color;

    public King(int a, int b, String d) {
        this.x = a;
        this.y = b;
        System.out.println("Set this King's X to " + this.x);
        System.out.println("Set this King's Y to " + this.y);
        this.color = d;
        if (this.color.equals("w")) {
            this.symbol = '♔';
        } else if (this.color.equals("b")) {
            this.symbol = '♚';

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
