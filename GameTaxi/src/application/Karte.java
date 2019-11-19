package application;

import java.util.HashMap;
import java.util.Map;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

public class Karte {
	
	private Player player = new Player();
	int customerCount = player.getMaxCustomers();
	Image unselectedMarker = new Image("application/images/marker_unselected.png");
	Image markerimg = new Image("application/images/marker_selected.png");
	ImageView oldSelect = new ImageView();
	int oldButtonId;
	//
	
	void newMarker(StackPane root, Kunden[] kunden,Map<Integer, Button> allButtons2)
	{
		for(int i = 0;i < kunden.length; i++)
		{
			Image markerimg = new Image("application/images/marker_unselected.png");
			ImageView markerImg = new ImageView();
			markerImg.setImage(markerimg);
			Button markerEvent = new Button();
			markerEvent.setId("kunde"+i+1);
			
			double ranX = Math.random()*850+0;
			double ranY = Math.random()*370+0;
			markerEvent.setTranslateX(-250+ranX);
			markerEvent.setTranslateY(-195+ranY);
			markerEvent.setPrefSize(40, 60);
			markerEvent.setId("marker");
			markerImg.setTranslateX(-250+ranX);
			markerImg.setTranslateY(-200+ranY);
			markerImg.setId(""+i);
			
			
			markerEvent.setOnAction(event -> {
				player.increaseMoney();
				changeMarkerimg(root, markerImg, markerEvent, allButtons2);
			});
				
			root.getChildren().addAll(markerImg,markerEvent);
		}
	}
	void changeMarkerimg(StackPane root, ImageView marker, Button markerButton,Map<Integer, Button> allButtons2)
	{
		Design design = new Design();
		
		if(customerCount >= player.getMaxCustomers())
		{
			marker.setImage(markerimg);
			//root.getChildren().remove(marker);
			//root.getChildren().addAll(marker);
			design.activateButton(Integer.valueOf(marker.getId()), allButtons2);
			customerCount--;
			oldSelect = marker;
			oldButtonId = Integer.valueOf(marker.getId());
		}
		else if(1==0)//add selected marker gets unselected
		{
			
		}
		
		else
		{
			oldSelect.setImage(unselectedMarker);
			marker.setImage(markerimg);
		
			design.deactivateButton(oldButtonId, allButtons2);
			//root.getChildren().remove(marker);
			//root.getChildren().addAll(marker);
			design.activateButton(Integer.valueOf(marker.getId()), allButtons2);
			//customerCount--;
			oldButtonId = Integer.valueOf(marker.getId());
			oldSelect = marker;
		}
		
	}
}
