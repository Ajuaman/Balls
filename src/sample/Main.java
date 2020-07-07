package sample;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import java.util.Random;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.Button;


public class Main extends Application {

    /**
     * @param args the command line arguments
     */
    static Random rand = new Random();

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World");
        Group root = new Group();
        Scene scene = new Scene(root, 300, 300);
        Button btn = new Button();
        Circle ball1 = new Circle();
        Circle ball2 = new Circle();
        Circle ball3 = new Circle();
        Circle ball4 = new Circle();
        Circle ball5 = new Circle();
        Circle ball6 = new Circle();

        ball1.setRadius(20);
        ball1.setCenterY(150);
        ball1.setCenterX(150);

        ball2.setRadius(20);
        ball2.setCenterY(150);
        ball2.setCenterX(150);

        ball3.setRadius(20);
        ball3.setCenterY(150);
        ball3.setCenterX(150);

        ball4.setRadius(20);
        ball4.setCenterY(150);
        ball4.setCenterX(150);

        ball5.setRadius(20);
        ball5.setCenterY(150);
        ball5.setCenterX(150);
        ball6.setRadius(20);

        btn.setLayoutX(80);
        btn.setLayoutY(80);
        btn.setText("Click to relocate the ball");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {

                ball1.relocate(rand.nextFloat() * 300, rand.nextFloat() * 300);
                ball2.relocate(rand.nextFloat() * 300, rand.nextFloat() * 300);
                ball3.relocate(rand.nextFloat() * 300, rand.nextFloat() * 300);
                ball4.relocate(rand.nextFloat() * 300, rand.nextFloat() * 300);
                ball5.relocate(rand.nextFloat() * 300, rand.nextFloat() * 300);

            }
        });
        root.getChildren().add(btn);
        root.getChildren().add(ball1);
        root.getChildren().add(ball2);
        root.getChildren().add(ball3);
        root.getChildren().add(ball4);
        root.getChildren().add(ball5);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}