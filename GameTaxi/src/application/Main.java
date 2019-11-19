package application;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

import javax.sql.rowset.spi.SyncProvider;


public class Main extends Application {

	//@Override
	public void start(Stage primaryStage) {
		try {
			Design window = new Design();
			window.setDesign(primaryStage);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}



	public static void main(String[] args) {
		launch(args);
	}
}
