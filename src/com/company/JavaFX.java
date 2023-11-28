package com.company;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import java.util.ArrayList;

//TODO game design

public class JavaFX extends Application{
    public static int countMove = 0;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        GridPane root = new GridPane();
        ArrayList<Button> board = CreateBoard(root, stage);
        StartMenu(stage);
        Move(root, board, stage);
        stage.show();
    }

    static int LogicGame(Button first, Button second, Button third, Button fourth, Button five, Button six, Button seven,
                         Button eight, Button nine, Stage stage){
        int result;

        if(first.getText().equals("X") && second.getText().equals("X") && third.getText().equals("X")) {
            P1WinNewScene(stage);
            return 1;

        }else if(fourth.getText().equals("X") && five.getText().equals("X") && six.getText().equals("X")) {
            result = 1;
            P1WinNewScene(stage);
        }else if(seven.getText().equals("X") && eight.getText().equals("X") && nine.getText().equals("X")) {
            result = 1;
            P1WinNewScene(stage);
        }else if(first.getText().equals("X") && fourth.getText().equals("X") && seven.getText().equals("X")) {
            result = 1;
            P1WinNewScene(stage);
        }else if(second.getText().equals("X") && five.getText().equals("X") && eight.getText().equals("X")) {
            result = 1;
            P1WinNewScene(stage);
        }else if(third.getText().equals("X") && six.getText().equals("X") && nine.getText().equals("X")) {
            result = 1;
            P1WinNewScene(stage);
        }else if(first.getText().equals("X") && five.getText().equals("X") && nine.getText().equals("X")) {
            result = 1;
            P1WinNewScene(stage);
        }else if(third.getText().equals("X") && five.getText().equals("X") && seven.getText().equals("X")) {
            result = 1;
            P1WinNewScene(stage);
        }
        else if(first.getText().equals("O") && second.getText().equals("O") && third.getText().equals("O")) {
            result = 2;
            P2WinNewScene(stage);
        }else if(fourth.getText().equals("O") && five.getText().equals("O") && six.getText().equals("O")) {
            result = 2;
            P2WinNewScene(stage);
        }else if(seven.getText().equals("O") && eight.getText().equals("O") && nine.getText().equals("O")) {
            result = 2;
            P2WinNewScene(stage);
        }else if(first.getText().equals("O") && fourth.getText().equals("O") && seven.getText().equals("O")) {
            result = 2;
            P2WinNewScene(stage);
        }else if(second.getText().equals("O") && five.getText().equals("O") && eight.getText().equals("O")) {
            result = 2;
            P2WinNewScene(stage);
        }else if(third.getText().equals("O") && six.getText().equals("O") && nine.getText().equals("O")) {
            result = 2;
            P2WinNewScene(stage);
        }else if(first.getText().equals("O") && five.getText().equals("O") && nine.getText().equals("O")) {
            result = 2;
            P2WinNewScene(stage);
        }else if(third.getText().equals("O") && five.getText().equals("O") && seven.getText().equals("O")) {
            result = 2;
            P2WinNewScene(stage);
        }
        else
            result = 0;
        countMove++;
        if(countMove == 9)
            Draw(stage);
        return result;
    }
    static void P1WinNewScene(Stage stage){
        stage.close();
        Text text = new Text("Krestik Win");
        Button buttonRestart = new Button("Restart");

        VBox root = new VBox(10, text, buttonRestart);
        root.setAlignment(Pos.CENTER);
        Scene scene1 = new Scene(root, 450, 450);
        stage.setScene(scene1);
        stage.show();
        buttonRestart.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                GridPane root = new GridPane();
                ArrayList<Button> board = CreateBoard(root, stage);
                Scene scene = new Scene(root);
                stage.setScene(scene);
            }
        });
    }
    static void P2WinNewScene(Stage stage){
        stage.close();
        Text text = new Text("Nolik Win");
        Button buttonRestart = new Button("Restart");

        VBox root = new VBox(10, text, buttonRestart);

        root.setAlignment(Pos.CENTER);
        Scene scene1 = new Scene(root, 450, 450);
        stage.setScene(scene1);
        stage.show();
        buttonRestart.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                GridPane root = new GridPane();
                ArrayList<Button> board = CreateBoard(root, stage);
                Scene scene = new Scene(root);
                stage.setScene(scene);
            }
        });
    }
    private static ImageView displayKrest(){
        Image image = new Image("file:///D:\\tic-tac-toe\\src\\com\\company\\KRESTIK.png");
        ImageView imageView = new ImageView(image);
        imageView.setImage(image);
        imageView.setFitHeight(150);
        imageView.setFitWidth(150);
        return imageView;

    }
    private static ImageView displayNolik(){
        Image image = new Image("file:///D:\\tic-tac-toe\\src\\com\\company\\NOLIK.png");
        ImageView imageView = new ImageView(image);
        imageView.setImage(image);
        imageView.setFitHeight(150);
        imageView.setFitWidth(150);
        return imageView;

    }
    static ArrayList<Button> CreateBoard(GridPane root ,Stage stage){
        ArrayList<Button> board = new ArrayList<>();
        Button first = new Button("First");
        first.setPrefWidth(150);
        first.setPrefHeight(150);
        Button second = new Button("Second");
        second.setPrefWidth(150);
        second.setPrefHeight(150);
        Button third = new Button("Third");
        third.setPrefWidth(150);
        third.setPrefHeight(150);
        Button fourth = new Button("Fourth");
        fourth.setPrefWidth(150);
        fourth.setPrefHeight(150);
        Button five = new Button("five");
        five.setPrefWidth(150);
        five.setPrefHeight(150);
        Button six = new Button("six");
        six.setPrefWidth(150);
        six.setPrefHeight(150);
        Button seven = new Button("seven");
        seven.setPrefWidth(150);
        seven.setPrefHeight(150);
        Button eight = new Button("eight");
        eight.setPrefWidth(150);
        eight.setPrefHeight(150);
        Button nine = new Button("nine");
        nine.setPrefWidth(150);
        nine.setPrefHeight(150);





        ColumnConstraints column1 = new ColumnConstraints();
        column1.setPercentWidth(50);
        root.getColumnConstraints().add(column1);

        ColumnConstraints column2 = new ColumnConstraints();
        column2.setPercentWidth(50);
        root.getColumnConstraints().add(column2);

        ColumnConstraints column3 = new ColumnConstraints();
        column3.setPercentWidth(50);
        root.getColumnConstraints().add(column3);

        RowConstraints row1 = new RowConstraints();
        row1.setPercentHeight(50);
        root.getRowConstraints().add(row1);

        RowConstraints row2 = new RowConstraints();
        row2.setPercentHeight(50);
        root.getRowConstraints().add(row2);

        RowConstraints row3 = new RowConstraints();
        row3.setPercentHeight(50);
        root.getRowConstraints().add(row3);

        root.setGridLinesVisible(true);
        root.add(first, 0, 0);
        root.add(second, 1, 0);
        root.add(third, 2, 0);
        root.add(fourth, 0, 1);
        root.add(five, 1, 1);
        root.add(six, 2, 1);
        root.add(seven, 0, 2);
        root.add(eight, 1, 2);
        root.add(nine, 2, 2);

        board.add(first);
        board.add(second);
        board.add(third);
        board.add(fourth);
        board.add(five);
        board.add(six);
        board.add(seven);
        board.add(eight);
        board.add(nine);
        Move(root,board,stage);
        return board;

    }
    static void Move(GridPane root, ArrayList<Button> board, Stage stage){
        final int[] motion = {0};
        final boolean[] breakMotion1 = {true};
        board.get(0).setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(motion[0] == 0 && breakMotion1[0]) {
                    board.get(0).setText("X");

                    motion[0] = 1;
                    breakMotion1[0] = false;

                    root.add(displayKrest(), 0, 0);
                    LogicGame(board.get(0),board.get(1),board.get(2), board.get(3),board.get(4),board.get(5),board.get(6),
                            board.get(7),board.get(8), stage);


                }
                else if(motion[0] == 1 && breakMotion1[0]) {
                    board.get(0).setText("O");
                    motion[0] = 0;
                    breakMotion1[0] = false;
                    root.add(displayNolik(), 0, 0);
                    LogicGame(board.get(0),board.get(1),board.get(2), board.get(3),board.get(4),board.get(5),board.get(6),
                            board.get(7),board.get(8), stage);

                }
            }
        });
        final boolean[] breakMotion2 = {true};
        board.get(1).setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(motion[0] == 0 && breakMotion2[0]) {
                    board.get(1).setText("X");
                    motion[0] = 1;
                    breakMotion2[0] = false;
                    LogicGame(board.get(0),board.get(1),board.get(2), board.get(3),board.get(4),board.get(5),board.get(6),
                            board.get(7),board.get(8), stage);
                    root.add(displayKrest(), 1, 0);
                }
                else if(motion[0] == 1 && breakMotion2[0]) {
                    board.get(1).setText("O");
                    motion[0] = 0;
                    breakMotion2[0] = false;
                    LogicGame(board.get(0),board.get(1),board.get(2), board.get(3),board.get(4),board.get(5),board.get(6),
                            board.get(7),board.get(8), stage);
                    root.add(displayNolik(), 1, 0);
                }
            }

        });
        final boolean[] breakMotion3 = {true};
        board.get(2).setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(motion[0] == 0 && breakMotion3[0]) {
                    board.get(2).setText("X");
                    motion[0] = 1;
                    breakMotion3[0] = false;
                    LogicGame(board.get(0),board.get(1),board.get(2), board.get(3),board.get(4),board.get(5),board.get(6),
                            board.get(7),board.get(8), stage);
                    root.add(displayKrest(), 2, 0);
                }
                else if(motion[0] == 1 && breakMotion3[0]) {
                    board.get(2).setText("O");
                    motion[0] = 0;
                    breakMotion3[0] = false;
                    LogicGame(board.get(0),board.get(1),board.get(2), board.get(3),board.get(4),board.get(5),board.get(6),
                            board.get(7),board.get(8), stage);
                    root.add(displayNolik(), 2, 0);
                }
            }
        });
        final boolean[] breakMotion4 = {true};
        board.get(3).setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(motion[0] == 0 && breakMotion4[0]) {
                    board.get(3).setText("X");
                    motion[0] = 1;
                    breakMotion4[0] = false;
                    LogicGame(board.get(0),board.get(1),board.get(2), board.get(3),board.get(4),board.get(5),board.get(6),
                            board.get(7),board.get(8), stage);
                    root.add(displayKrest(), 0, 1);
                }
                else if(motion[0] == 1 && breakMotion4[0]) {
                    board.get(3).setText("O");
                    motion[0] = 0;
                    breakMotion4[0] = false;
                    LogicGame(board.get(0),board.get(1),board.get(2), board.get(3),board.get(4),board.get(5),board.get(6),
                            board.get(7),board.get(8), stage);
                    root.add(displayNolik(), 0, 1);
                }
            }
        });
        final boolean[] breakMotion5 = {true};
        board.get(4).setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(motion[0] == 0 && breakMotion5[0]) {
                    board.get(4).setText("X");
                    motion[0] = 1;
                    breakMotion5[0] = false;
                    LogicGame(board.get(0),board.get(1),board.get(2), board.get(3),board.get(4),board.get(5),board.get(6),
                            board.get(7),board.get(8), stage);
                    root.add(displayKrest(), 1, 1);
                }
                else if(motion[0] == 1 && breakMotion5[0]) {
                    board.get(4).setText("O");
                    motion[0] = 0;
                    breakMotion5[0] = false;
                    LogicGame(board.get(0),board.get(1),board.get(2), board.get(3),board.get(4),board.get(5),board.get(6),
                            board.get(7),board.get(8), stage);
                    root.add(displayNolik(), 1, 1);
                }
            }
        });
        final boolean[] breakMotion6 = {true};
        board.get(5).setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(motion[0] == 0 && breakMotion6[0]) {
                    board.get(5).setText("X");
                    motion[0] = 1;
                    breakMotion6[0] = false;
                    LogicGame(board.get(0),board.get(1),board.get(2), board.get(3),board.get(4),board.get(5),board.get(6),
                            board.get(7),board.get(8), stage);
                    root.add(displayKrest(), 2, 1);
                }
                else if(motion[0] == 1 && breakMotion6[0]) {
                    board.get(5).setText("O");
                    motion[0] = 0;
                    breakMotion6[0] = false;
                    LogicGame(board.get(0),board.get(1),board.get(2), board.get(3),board.get(4),board.get(5),board.get(6),
                            board.get(7),board.get(8), stage);
                    root.add(displayNolik(), 2, 1);
                }
            }
        });
        final boolean[] breakMotion7 = {true};
        board.get(6).setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(motion[0] == 0 && breakMotion7[0]) {
                    board.get(6).setText("X");
                    motion[0] = 1;
                    breakMotion7[0] = false;
                    LogicGame(board.get(0),board.get(1),board.get(2), board.get(3),board.get(4),board.get(5),board.get(6),
                            board.get(7),board.get(8), stage);
                    root.add(displayKrest(), 0, 2);
                }
                else if(motion[0] == 1 && breakMotion7[0]) {
                    board.get(6).setText("O");
                    motion[0] = 0;
                    breakMotion7[0] = false;
                    LogicGame(board.get(0),board.get(1),board.get(2), board.get(3),board.get(4),board.get(5),board.get(6),
                            board.get(7),board.get(8), stage);
                    root.add(displayNolik(), 0, 2);
                }
            }
        });
        final boolean[] breakMotion8 = {true};
        board.get(7).setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(motion[0] == 0 && breakMotion8[0]) {
                    board.get(7).setText("X");
                    motion[0] = 1;
                    breakMotion8[0] = false;
                    LogicGame(board.get(0),board.get(1),board.get(2), board.get(3),board.get(4),board.get(5),board.get(6),
                            board.get(7),board.get(8), stage);
                    root.add(displayKrest(), 1, 2);
                }
                else if(motion[0] == 1 && breakMotion8[0]) {
                    board.get(7).setText("O");
                    motion[0] = 0;
                    breakMotion8[0] = false;
                    LogicGame(board.get(0),board.get(1),board.get(2), board.get(3),board.get(4),board.get(5),board.get(6),
                            board.get(7),board.get(8), stage);
                    root.add(displayNolik(), 1, 2);
                }
            }
        });
        final boolean[] breakMotion9 = {true};
        board.get(8).setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(motion[0] == 0 && breakMotion9[0]) {
                    board.get(8).setText("X");
                    motion[0] = 1;
                    breakMotion9[0] = false;
                    LogicGame(board.get(0),board.get(1),board.get(2), board.get(3),board.get(4),board.get(5),board.get(6),
                            board.get(7),board.get(8), stage);
                    root.add(displayKrest(), 2, 2);
                }
                else if(motion[0] == 1 && breakMotion9[0]) {
                    board.get(8).setText("O");
                    motion[0] = 0;
                    breakMotion9[0] = false;
                    root.add(displayNolik(), 2, 2);
                    LogicGame(board.get(0),board.get(1),board.get(2), board.get(3),board.get(4),board.get(5),board.get(6),
                            board.get(7),board.get(8), stage);

                }
            }
        });
    }
    static void Draw(Stage stage){
        stage.close();
        Text text = new Text("Draw");
        Button buttonRestart = new Button("Restart");

        VBox root = new VBox(10, text, buttonRestart);

        root.setAlignment(Pos.CENTER);
        Scene scene1 = new Scene(root, 450, 450);
        stage.setScene(scene1);
        stage.show();
        buttonRestart.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                GridPane root = new GridPane();
                ArrayList<Button> board = CreateBoard(root, stage);
                Scene scene = new Scene(root);
                stage.setScene(scene);
            }
        });

    }

    static void StartMenu(Stage stage){
        stage.close();
        Label label = new Label("Game");
        Button buttonStart = new Button("Start");
        Button buttonExit = new Button("Exit");
        VBox root = new VBox(10, label, buttonStart, buttonExit);
        root.setAlignment(Pos.CENTER);
        Scene scene1 = new Scene(root, 450, 450);
        stage.setScene(scene1);
        stage.show();
        buttonStart.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                GridPane root = new GridPane();
                ArrayList<Button> board = CreateBoard(root, stage);
                Scene scene = new Scene(root);
                stage.setScene(scene);
            }
        });
        buttonExit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stage.close();
            }
        });

    }
}