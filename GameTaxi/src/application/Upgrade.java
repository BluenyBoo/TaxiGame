package application;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class Upgrade extends Main
{

	Stage newWindow = new Stage();

	public void openUpgrade()
	{

		if (newWindow.isShowing()) {
			newWindow.toFront();
		}
		else {
			Pane secondaryLayout = new Pane();
			Scene secondScene = new Scene(secondaryLayout, 600, 400);

			newWindow.setTitle("Upgrade Shop");
			newWindow.setScene(secondScene);

			newWindow.setX(secondScene.getX() + 400);
			newWindow.setY(secondScene.getY() + 100);

			newWindow.show();

			// Buttons anlegen
			Button upgradeAssignments = new Button();
			Button upgradeMoney = new Button();
			Button upgradeSpeed = new Button();

			// Buttons erstellen
			secondaryLayout.getChildren().add(upgradeSpeed);
			secondaryLayout.getChildren().add(upgradeMoney);
			secondaryLayout.getChildren().add(upgradeAssignments);

			// Buttons anpassen (Größe, Text, Position)
			upgradeAssignments.setText("Mehr Auftragsannahmen!");
			upgradeAssignments.setPrefSize(400.0, 80.0);
			upgradeAssignments.setLayoutX(10);
			upgradeAssignments.setLayoutY(33);
			upgradeMoney.setText("Doppelter Verdienst!");
			upgradeMoney.setPrefSize(400.0, 80.0);
			upgradeMoney.setLayoutX(10);
			upgradeMoney.setLayoutY(166);
			upgradeSpeed.setText("Doppelte Geschwindigkeit!");
			upgradeSpeed.setPrefSize(400.0, 80.0);
			upgradeSpeed.setLayoutX(10);
			upgradeSpeed.setLayoutY(300);


			// Labels anlegen
			Label labelMoney = new Label("Preis und Effekt: ");
			Label labelSpeed = new Label("Preis und Effekt: ");
			Label labelAssignments = new Label("Preis und Effekt: ");

			// Labels erstellen
			secondaryLayout.getChildren().add(labelMoney);
			secondaryLayout.getChildren().add(labelSpeed);
			secondaryLayout.getChildren().add(labelAssignments);

			// Labels anpassen
			labelMoney.setPrefSize(300.0, 79.0);
			labelMoney.setAlignment(Pos.CENTER_LEFT);
			labelMoney.setLayoutY(60);
			labelMoney.setLayoutX(430);
			labelSpeed.setPrefSize(300.0, 79.0);
			labelSpeed.setAlignment(Pos.CENTER_LEFT);
			labelSpeed.setLayoutY(193);
			labelSpeed.setLayoutX(430);
			labelAssignments.setPrefSize(300.0, 79.0);
			labelAssignments.setAlignment(Pos.CENTER_LEFT);
			labelAssignments.setLayoutY(327);
			labelAssignments.setLayoutX(430);
		}
	}
}
