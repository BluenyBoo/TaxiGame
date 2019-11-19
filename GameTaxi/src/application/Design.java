package application;


import java.util.HashMap;
import java.util.Map;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Design{
	

	private StackPane root = new StackPane();
	private Map<Integer, Button> allButtons = new HashMap<Integer, Button>();
	private Scene scene = new Scene(root,1280,800);
	private Player player = new Player();
	private Label currentMoney = new Label(player.getMoney() + " MÃ¼nzen");
	private Karte karte = new Karte();
	
	
	public void setDesign(Stage primaryStage){
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
		
		//MoneySign
		Label moneySign = new Label("Money:");
		moneySign.setId("fonts");
		moneySign.setPrefSize(150.0,120.0);
		moneySign.setAlignment(Pos.CENTER_LEFT);
		moneySign.setLayoutY(660);
		moneySign.setLayoutX(10);
		root.getChildren().add(moneySign);
		StackPane.setAlignment(moneySign, Pos.BOTTOM_LEFT);
		
		//CurrentMoney
		Main main = new Main();
		String currMoney = Integer.toString(player.getMoney());
		//Label currentMoney = new Label(currMoney); 
		currentMoney.setId("fonts");
		currentMoney.setAlignment(Pos.CENTER_RIGHT);
		currentMoney.setLayoutY(660);
		currentMoney.setLayoutX(180);
		currentMoney.setPrefSize(1100.0,120.0);
		root.getChildren().add(currentMoney);
		StackPane.setAlignment(currentMoney, Pos.BOTTOM_RIGHT);

		
		//Kunden-Instanzen
		
		Kunden kunde1, kunde2, kunde3, kunde4, kunde5, kunde6;
		
		Kunden[] kunden = {	
				 kunde1 = new Kunden(new Destination(30, "Gifhorn"), "Hans GlÃ¼ck", 1),
				 kunde2 = new Kunden(new Destination(228_000_000, "Mars"), "Elon Musk", 2),
				 kunde3 = new Kunden(new Destination(228_000_000, "Mars"), "Elon Musk", 3),
			   	 kunde4 = new Kunden(new Destination(228_000_000, "Mars"), "Elon Musk", 4),
				 kunde5 = new Kunden(new Destination(228_000_000, "Mars"), "Elon Musk", 5),
				 kunde6 = new Kunden(new Destination(228_000_000, "Mars"), "Elon Musk", 6)
						};	
		
		//Kunden-Position etc.
		
		for(int i = 0;i < kunden.length;i++)
		{
			if(i<3){
				erstelleKundenButton(kunden[i],i*427.0-420-6, 25-388,i);
			}
			else {
				erstelleKundenButton(kunden[i],(i-3)*427.0-420-6, 100-388,i);
			}
		}
		
		//Berechnung von Kilometer und Geld
		float kilometer= (float)((Math.random()) * 100.00+0.1);
		double roundkilometer = Math.round(kilometer * 100.0) / 100.0;
		int geld = 0;
		if(roundkilometer<=50) 
		{
			 geld= (int)((Math.random()* 50) + 0);
		}
		else if(roundkilometer<=100) 
		{
			 geld= (int)((Math.random()* 50) + 50);
		}

		//Stackpane für die Map heißt Karte		
		Image mapimg = new Image("application/images/karte.jpg", 920, 420,false,false);
		ImageView map = new ImageView();
		map.setImage(mapimg);
		StackPane.setAlignment(map, Pos.CENTER_RIGHT);
		root.getChildren().addAll(map);


		
		
		//ShopButton
		Button shopButton = new Button("SHOP");
		shopButton.setPrefSize(269.0,121.0);
		shopButton.setTranslateX(0.0);
		shopButton.setTranslateY(250.0);
		shopButton.setId("shops");
		root.getChildren().add(shopButton);
		Shop shop = new Shop();
		shopButton.setOnAction(shopEvent -> {
			shop.main();
		});
		StackPane.setAlignment(shopButton, Pos.TOP_LEFT);
		
		//UpgradeButton
		Button upgradeButton = new Button("UPGRADE");
		upgradeButton.setPrefSize(269.0,121.0);
		upgradeButton.setTranslateX(0.0);
		upgradeButton.setTranslateY(400.0);
		upgradeButton.setId("shops");
			root.getChildren().add(upgradeButton);
		Upgrade upgradeClick = new Upgrade();
		upgradeButton.setOnAction(upgradeEvent -> {
			        upgradeClick.openUpgrade();
		});
		StackPane.setAlignment(upgradeButton, Pos.TOP_LEFT);	
		
		makeMarker(kunden, allButtons);
	}
	

	
	
	void markerRan(StackPane root)
	{
		Image markerimg = new Image("application/images/marker_unselected.png");
		ImageView marker = new ImageView();
		marker.setImage(markerimg);
	
		
		double ranX = Math.random()*850+0;
		double ranY = Math.random()*370+0;
		marker.setTranslateX(-250+ranX);
		marker.setTranslateY(-200+ranY);
		root.getChildren().addAll(marker);
	}
	
	//Kunden kunde = new Kunden(new Destination(30, "Gifhorn"), "Karl", 1);

	public void erstelleKundenButton(Kunden kunde,double x, double y, int index) {
		Button button = new Button();
		button.setText("Kunde: " + kunde.getName() + ", " +
				       "Ziel: " + kunde.getDestination().getName() + "\n" +
					   "Strecke: " + kunde.getDestination().getKilometer() + "km");
		button.setPrefSize(426.0, 73.0);
		button.setId("kunde"+index);
		button.setAlignment(Pos.TOP_CENTER);
		button.setTranslateX(x);
		button.setTranslateY(y);
		button.setDisable(true);
		

		button.setOnAction(event -> {
			player.increaseMoney();
			currentMoney.setText(player.getMoney() + " Money"
					+ "");
		});
		
		//allButtons-Map funktioniert nicht?
		//System.out.print(index);
		allButtons.put(index, button);
		//System.out.println(allButtons.keySet());
	
		
		root.getChildren().addAll(button);
	}
	
	void activateButton(int buttonId, Map<Integer, Button> allButtons2)
	{
		Button button = new Button();
		//System.out.println(allButtons2.keySet());
		
		button = allButtons2.get(buttonId);
		//root.getChildren().remove(button);
		button.setDisable(false);
		//root.getChildren().add(button);
		//System.out.println(button.getText());
	}
	
	void deactivateButton(int buttonId, Map<Integer, Button> allButtons2)
	{
		Button button = new Button();
		//System.out.println(allButtons2.keySet());
		
		button = allButtons2.get(buttonId);
		//root.getChildren().remove(button);
		button.setDisable(true);
		//root.getChildren().add(button);
		//System.out.println(button.getText());
	}




	public Map<Integer, Button> getAllButtons() {
		return allButtons;
	}
	
	void makeMarker(Kunden[] kunden, Map<Integer, Button> allButtons2)
	{
	//Stackpane für die Kunden-Marker
		karte.newMarker(root, kunden,allButtons2);
	}



	
		
}
