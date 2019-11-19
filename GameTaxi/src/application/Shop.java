package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Shop extends Main{

    private Button button = new Button("Shop");
    private Button button2 = new Button("Test");
    private Button button3 = new Button("Test2");
    private Button button4 = new Button("Test3");

    private Stage shopWindow = new Stage();


    public void button()
    {
        button.setOnAction(actionEvent -> {
            System.out.println("button");
        });
    }
    public void button2()
    {
        button2.setOnAction(actionEvent -> {
            System.out.println("button2");
        });
    }
    public void button3()
    {
        button3.setOnAction(actionEvent -> {
            System.out.println("button3");
        });
    }
    public void button4()
    {
        button4.setOnAction(actionEvent -> {
            System.out.println("button4");
        });
    }


    public void showShop()
    {
        if (shopWindow.isShowing()) {
            shopWindow.toFront();
        }
        else {

            Pane shopPane = new Pane();
            Scene shopScene = new Scene(shopPane, 600, 400);

            button.setTranslateX(0);
            button.setTranslateY(0);
            button.setPrefSize(50, 20);
            shopPane.getChildren().add(button);
            button2.setTranslateX(0);
            button2.setTranslateY(25);
            button2.setPrefSize(50, 20);
            shopPane.getChildren().add(button2);
            button3.setTranslateX(0);
            button3.setTranslateY(50);
            button3.setPrefSize(50, 20);
            shopPane.getChildren().add(button3);
            button4.setTranslateX(0);
            button4.setTranslateY(75);
            button4.setPrefSize(50, 20);
            shopPane.getChildren().add(button4);


            shopWindow.setTitle("Shop");
            shopWindow.setScene(shopScene);

            shopWindow.show();

        }

    }

    public void main()
    {
        button();
        button2();
        button3();
        button4();
        showShop();
    }



}
