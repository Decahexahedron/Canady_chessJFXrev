package canady_chessjfx;

import javafx.scene.control.*;

public class Bishop extends Piece {

    private int x, y;
    private int a, b;
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
        for (int i = 0; i <= this.y; i++) { // up left
            if(this.color == "w"){
                for(Piece p : Canady_ChessJFX.wlist){
                
            }
            }
            for(Piece p : Canady_ChessJFX.blist){
                
            }
            bbb[this.x - i][this.y - i].setText("o");
            System.out.println(this.x + ", " + this.y);
        }
    }
}
