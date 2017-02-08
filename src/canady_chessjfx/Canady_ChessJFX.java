package canady_chessjfx;

import javafx.application.Application;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class Canady_ChessJFX extends Application {

    public static Piece[][] plist = new Piece[8][8];
    public static King wking, bking; //init
    public static Queen wqueen, bqueen;
    public static Knight wknight1, wknight2, bknight1, bknight2;
    public static Bishop wbishop1, wbishop2, bbishop1, bbishop2;
    public static Rook wrook1, wrook2, brook1, brook2;
    public static Pawn wpawn1, wpawn2, wpawn3, wpawn4, wpawn5, wpawn6, wpawn7, wpawn8,
            bpawn1, bpawn2, bpawn3, bpawn4, bpawn5, bpawn6, bpawn7, bpawn8;

    @Override
    public void start(Stage primaryStage) {
        Button[][] bbb = new Button[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                String sss = Character.toString(plist[i][j].getSymbol());
                bbb[i][j] = new Button(sss);
            }
        }
        Pane root = new Pane();
//        btn.setLayoutX(250);
//        btn.setLayoutY(220);
//        root.getChildren().add(btn);
        Scene scene = new Scene(root, 1280, 720);

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

        plist[0][3] = wking;
        plist[1][4] = wqueen;
        plist[0][2] = wbishop1;
        plist[0][5] = wbishop2;
        plist[0][1] = wknight1;
        plist[0][6] = wknight2;
        plist[0][0] = wrook1;
        plist[0][7] = wrook2;
        plist[1][0] = wpawn1;
        plist[1][1] = wpawn2;
        plist[1][2] = wpawn3;
        plist[1][3] = wpawn4;
        plist[1][4] = wpawn5;
        plist[1][5] = wpawn6;
        plist[1][6] = wpawn7;
        plist[1][7] = wpawn8;
        plist[7][4] = bking;
        plist[7][3] = bqueen;
        plist[7][2] = bbishop1;
        plist[7][5] = bbishop2;
        plist[7][1] = bknight1;
        plist[7][6] = bknight2;
        plist[7][0] = brook1;
        plist[7][7] = brook2;
        plist[6][0] = bpawn1;
        plist[6][1] = bpawn2;
        plist[6][2] = bpawn3;
        plist[6][3] = bpawn4;
        plist[6][4] = bpawn5;
        plist[6][5] = bpawn6;
        plist[6][6] = bpawn7;
        plist[6][7] = bpawn8;
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
