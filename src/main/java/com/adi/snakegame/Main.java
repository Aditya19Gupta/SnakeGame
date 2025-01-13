package com.adi.snakegame;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main extends Application {

    static int width = 20;
    static int height = 20;
    static int blockSize = 25;
    static int speed = 5;

    List<Point> snake = new ArrayList<>();
    Point fruit = new Point();
    int score = 0;
    boolean gameOver = false;
    String direction = "RIGHT";

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        Canvas canvas = new Canvas(width * blockSize, height * blockSize);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        root.getChildren().add(canvas);

        Scene scene = new Scene(root, width * blockSize, height * blockSize);
        scene.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.W && !direction.equals("DOWN")) direction = "UP";
            if (e.getCode() == KeyCode.S && !direction.equals("UP")) direction = "DOWN";
            if (e.getCode() == KeyCode.A && !direction.equals("RIGHT")) direction = "LEFT";
            if (e.getCode() == KeyCode.D && !direction.equals("LEFT")) direction = "RIGHT";
        });

        initializeGame();

        new Thread(() -> {
            while (!gameOver) {
                try {
                    Thread.sleep(1000 / speed);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                run(gc);
            }
        }).start();

        primaryStage.setTitle("Snake Game");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void initializeGame() {
        snake.clear();
        snake.add(new Point(width / 2, height / 2));
        generateFruit();
    }

    public void generateFruit() {
        Random rand = new Random();
        fruit.setX(rand.nextInt(width));
        fruit.setY(rand.nextInt(height));
    }

    public void run(GraphicsContext gc) {
        if (!gameOver) {
            update();
            draw(gc);
        }
    }

    public void update() {
        Point head = new Point(snake.get(0).getX(), snake.get(0).getY());

        switch (direction) {
            case "UP" -> head.setY(head.getY() - 1);
            case "DOWN" -> head.setY(head.getY() + 1);
            case "LEFT" -> head.setX(head.getX() - 1);
            case "RIGHT" -> head.setX(head.getX() + 1);
        }

        if (head.equals(fruit)) {
            snake.add(fruit);
            score++;
            generateFruit();
            if (score % 5 == 0) speed++;
        } else {
            snake.remove(snake.size() - 1);
        }

        if (head.getX() < 0 || head.getY() < 0 || head.getX() >= width || head.getY() >= height || snake.contains(head)) {
            gameOver = true;
        }

        snake.add(0, head);
    }

    public void draw(GraphicsContext gc) {
        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, width * blockSize, height * blockSize);

        gc.setFill(Color.GREEN);
        for (Point p : snake) {
            gc.fillRect(p.getX() * blockSize, p.getY() * blockSize, blockSize - 1, blockSize - 1);
        }

        gc.setFill(Color.RED);
        gc.fillRect(fruit.getX() * blockSize, fruit.getY() * blockSize, blockSize - 1, blockSize - 1);

        gc.setFill(Color.WHITE);
        gc.setFont(new Font(20));
        gc.fillText("Score: " + score, 10, 20);

        if (gameOver) {
            gc.setFill(Color.RED);
            gc.setFont(new Font(50));
            gc.fillText("GAME OVER", width * blockSize / 4.0, height * blockSize / 2.0);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
