package org.example.drawgraphics;

import javafx.application.Application;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

// This application demonstrates drawing lines, rectangles, and ovals, arcs, polygons, and text.

// Aaron Pelto
// CST-283
// Winter 2024

public class DrawGraphics extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        // Constants for the scene size
        final double SCENE_WIDTH = 500.0;
        final double SCENE_HEIGHT = 600.0;

        // Designate the primary drawing pane.  Drawing objects added
        // subsequently to this pane below.
        Pane pane = new Pane();

        // Draw 20 random circles
        for (int i = 0; i < 20; i++) {
            // Random Radius
            // * 50 + 10 to ensure the radius is at least 10 and at most 60
            // this ensures the circle is not too small or too large
            double radius = Math.random() * 50 + 10;

            // Random Location within the scene width and height
            // - 2 * radius to ensure the circle is not drawn outside the scene
            double x = Math.random() * (SCENE_WIDTH - 2 * radius) + radius;
            double y = Math.random() * (SCENE_HEIGHT - 2 * radius) + radius;

            // Create a Circle
            Circle aCircle = new Circle(x, y, radius);
            // Random Color
            aCircle.setFill(Color.color(Math.random(), Math.random(), Math.random()));
            // Add the Circle to the Pane
            pane.getChildren().add(aCircle);
        }

        // Create a Scene and display drawing
        Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Drawing");
        primaryStage.show();
    }
}