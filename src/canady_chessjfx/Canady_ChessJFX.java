package canady_chessjfx;

import javafx.application.Application;
//import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import java.util.*;

public class Canady_ChessJFX extends Application {

    public static ArrayList<Piece> wlist = new ArrayList();
    public static ArrayList<Piece> blist = new ArrayList();
    public static King wking, bking; //init
    public static Queen wqueen, bqueen;
    public static Knight wknight1, wknight2, bknight1, bknight2;
    public static Bishop wbishop1, wbishop2, bbishop1, bbishop2;
    public static Rook wrook1, wrook2, brook1, brook2;
    public static Pawn wpawn1, wpawn2, wpawn3, wpawn4, wpawn5, wpawn6, wpawn7, wpawn8,
            bpawn1, bpawn2, bpawn3, bpawn4, bpawn5, bpawn6, bpawn7, bpawn8;

    @Override
    public void start(Stage primaryStage) {
        initPieces();
        assign();
        Button[][] bbb = new Button[8][8];
        Group root = new Group();
        Scene scene = new Scene(root, 1280, 720);
        for (Piece p : wlist) {
            String sss = Character.toString(p.getSymbol());
            bbb[p.getX()][p.getY()] = new Button(sss);
            bbb[p.getX()][p.getY()].setLayoutX(p.getX() * 50);
            bbb[p.getX()][p.getY()].setLayoutY(p.getY() * 50);
            root.getChildren().add(bbb[p.getX()][p.getY()]);
            System.out.println("Button added at " + bbb[p.getX()][p.getY()].getLayoutX() + ", " + bbb[p.getX()][p.getY()].getLayoutY());
//            System.out.println(p.getX());
        }
        for (Piece p : blist) {
            String sss = Character.toString(p.getSymbol());
            bbb[p.getX()][p.getY()] = new Button(sss);
            bbb[p.getX()][p.getY()].setLayoutX(p.getX() * 50);
            bbb[p.getX()][p.getY()].setLayoutY(p.getY() * 50);
            root.getChildren().add(bbb[p.getX()][p.getY()]);
            System.out.println("Button added at " + bbb[p.getX()][p.getY()].getLayoutX() + ", " + bbb[p.getX()][p.getY()].getLayoutY());
        }
        root.getChildren().add(bbb[0][0]);
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++) {
//                Button b = bbb[i][j];
//                root.getChildren().add(bbb[i][j]);
//                if (b != null) {
//                    
//                }
//            }
//        }
//

//        btn.setOnAction(new EventHandler<ActionEvent>() { //button action
//            @Override
//            public void handle(ActionEvent event) {
//            }
//        });
        primaryStage.setTitle("Chess"); //make window
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {

        launch(args);
    }

    public static void chess() {

    }

    static void assign() {
        wlist.add(wking);
        wlist.add(wqueen);
        wlist.add(wbishop1);
        wlist.add(wbishop2);
        wlist.add(wknight1);
        wlist.add(wknight2);
        wlist.add(wrook1);
        wlist.add(wrook2);
        wlist.add(wpawn1);
        wlist.add(wpawn2);
        wlist.add(wpawn3);
        wlist.add(wpawn4);
        wlist.add(wpawn5);
        wlist.add(wpawn6);
        wlist.add(wpawn7);
        wlist.add(wpawn8);
        blist.add(bking);
        blist.add(bqueen);
        blist.add(bbishop1);
        blist.add(bbishop2);
        blist.add(bknight1);
        blist.add(bknight2);
        blist.add(brook1);
        blist.add(brook2);
        blist.add(bpawn1);
        blist.add(bpawn2);
        blist.add(bpawn3);
        blist.add(bpawn4);
        blist.add(bpawn5);
        blist.add(bpawn6);
        blist.add(bpawn7);
        blist.add(bpawn8);
    }

    public static void initPieces() {
        wking = new King(0, 3, "w");
        bking = new King(7, 4, "b");
        wqueen = new Queen(0, 4, "w");
        bqueen = new Queen(7, 3, "b");
        wknight1 = new Knight(0, 1, "w");
        wknight2 = new Knight(0, 6, "w");
        bknight1 = new Knight(7, 1, "b");
        bknight2 = new Knight(7, 6, "b");
        wbishop1 = new Bishop(0, 2, "w");
        wbishop2 = new Bishop(0, 5, "w");
        bbishop1 = new Bishop(7, 2, "b");
        bbishop2 = new Bishop(7, 5, "b");
        wrook1 = new Rook(0, 0, "w");
        wrook2 = new Rook(0, 7, "w");
        brook1 = new Rook(7, 0, "b");
        brook2 = new Rook(7, 7, "b");
        wpawn1 = new Pawn(1, 0, "w");
        wpawn2 = new Pawn(1, 1, "w");
        wpawn3 = new Pawn(1, 2, "w");
        wpawn4 = new Pawn(1, 3, "w");
        wpawn5 = new Pawn(1, 4, "w");
        wpawn6 = new Pawn(1, 5, "w");
        wpawn7 = new Pawn(1, 6, "w");
        wpawn8 = new Pawn(1, 7, "w");
        bpawn1 = new Pawn(6, 0, "b");
        bpawn2 = new Pawn(6, 1, "b");
        bpawn3 = new Pawn(6, 2, "b");
        bpawn4 = new Pawn(6, 3, "b");
        bpawn5 = new Pawn(6, 4, "b");
        bpawn6 = new Pawn(6, 5, "b");
        bpawn7 = new Pawn(6, 6, "b");
        bpawn8 = new Pawn(6, 7, "b");
    }
}
