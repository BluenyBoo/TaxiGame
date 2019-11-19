package application;

import java.nio.file.Files;
import java.util.Timer;

import javax.xml.stream.events.Namespace;

import javafx.scene.control.Label;

public class Kunden {

	private Destination destination;
	private String name;
	private int kundeId;
	
	String names = String(Files.readAllLines("resources/names.txt"));
	String nameStr = names.
	String nameArray[] = names.split(" ");
	//namelist[] = 
	

	public Kunden(Destination destination, String name, int kundeId) {
		this.destination = destination;
		this.name = name;
		this.kundeId = kundeId;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}
	public Destination getDestination() {
		return destination;
	}


	public void setKundeId(int kundeId) {
		this.kundeId = kundeId;
	}
	public int getKundeId() {
		return kundeId;
	}

	public void setName(String name) {
		this.name = name;
		
		//TEST
		for(int i=0; i < namelist.length; i++){
			System.out.println(namelist[i]);
		}
	}
	public String getName() {
		return name;
	}
}

class Destination {
	private int kilometer;
	private String name;

	public Destination(int kilometer, String name) {
		this.kilometer = kilometer;
		this.name = name;
		}
	

	public void setKilometer(int kilometer) {
		this.kilometer = kilometer;
	}
	public int getKilometer() {
		return kilometer;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
