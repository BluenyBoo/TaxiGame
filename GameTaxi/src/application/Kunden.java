package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.Timer;

import javafx.scene.control.Label;

public class Kunden {

	private Destination destination;
	private String name;
	private int kundeId;
	
	private String[] nameArray = {};
	private String names = "Ben\r\n" + 
			"Jonas\r\n" + 
			"Paul\r\n" + 
			"Leon\r\n" + 
			"Henry\r\n" + 
			"Henri\r\n" + 
			"Finn\r\n" + 
			"Fynn\r\n" + 
			"Felix\r\n" + 
			"Luis\r\n" + 
			"Louis\r\n" + 
			"Elias\r\n" + 
			"Noah\r\n" + 
			"Luca\r\n" + 
			"Luka\r\n" + 
			"Lukas\r\n" + 
			"Lucas\r\n" + 
			"Maximilian\r\n" + 
			"Emil\r\n" + 
			"Theo\r\n" + 
			"Jakob\r\n" + 
			"Jacob\r\n" + 
			"Oskar\r\n" + 
			"Oscar\r\n" + 
			"Liam\r\n" + 
			"Anton\r\n" + 
			"Leo\r\n" + 
			"Milan\r\n" + 
			"Max\r\n" + 
			"Carl\r\n" + 
			"Karl\r\n" + 
			"Moritz\r\n" + 
			"David\r\n" + 
			"Julian\r\n" + 
			"Alexander\r\n" + 
			"Matteo\r\n" + 
			"Jonathan\r\n" + 
			"Linus\r\n" + 
			"Erik\r\n" + 
			"Eric\r\n" + 
			"Tom\r\n" + 
			"Mats\r\n" + 
			"Mads\r\n" + 
			"Leonard\r\n" + 
			"Niklas\r\n" + 
			"Niclas\r\n" + 
			"Rafael\r\n" + 
			"Raphael\r\n" + 
			"Samuel0\r\n" + 
			"Jona\r\n" + 
			"Jonah\r\n" + 
			"Mika\r\n" + 
			"Tim0\r\n" + 
			"Vincent\r\n" + 
			"Jannis\r\n" + 
			"Janis\r\n" + 
			"Yannis\r\n" + 
			"Lennard\r\n" + 
			"Lennart\r\n" + 
			"Hannes\r\n" + 
			"Aaron\r\n" + 
			"Levi\r\n" + 
			"Fabian\r\n" + 
			"Jan\r\n" + 
			"Johannes\r\n" + 
			"Theodor0\r\n" + 
			"Adrian\r\n" + 
			"Maxim\r\n" + 
			"Maksim\r\n" + 
			"Lio0\r\n" + 
			"Philipp\r\n" + 
			"Johann\r\n" + 
			"Jannik\r\n" + 
			"Yannik\r\n" + 
			"Yannick\r\n" + 
			"Yannic\r\n" + 
			"Simon\r\n" + 
			"Till\r\n" + 
			"Bruno\r\n" + 
			"Mattis\r\n" + 
			"Mathis\r\n" + 
			"Matthis\r\n" + 
			"Joshua\r\n" + 
			"Valentin\r\n" + 
			"Artur\r\n" + 
			"Arthur\r\n" + 
			"Benjamin\r\n" + 
			"Constantin\r\n" + 
			"Konstantin\r\n" + 
			"Nick\r\n" + 
			"Damian\r\n" + 
			"Julius\r\n" + 
			"Luke\r\n" + 
			"Luc\r\n" + 
			"Nico\r\n" + 
			"Niko\r\n" + 
			"Fritz\r\n" + 
			"Kilian\r\n" + 
			"Toni\r\n" + 
			"Tony\r\n" + 
			"Adam\r\n" + 
			"Lian\r\n" + 
			"Ole\r\n" + 
			"Fiete\r\n" + 
			"Mateo\r\n" + 
			"Michael\r\n" + 
			"Ludwig\r\n" + 
			"Daniel\r\n" + 
			"Milo\r\n" + 
			"Milow\r\n" + 
			"Dominic\r\n" + 
			"Dominik0\r\n" + 
			"Marlon0\r\n" + 
			"Nils\r\n" + 
			"Niels\r\n" + 
			"Malte\r\n" + 
			"Phil\r\n" + 
			"Gabriel\r\n" + 
			"Pepe\r\n" + 
			"Timo\r\n" + 
			"Levin\r\n" + 
			"Sebastian0\r\n" + 
			"Jayden\r\n" + 
			"Jaden0\r\n" + 
			"Lasse\r\n" + 
			"Lias\r\n" + 
			"Florian\r\n" + 
			"Franz\r\n" + 
			"Lenny\r\n" + 
			"Lenni\r\n" + 
			"Matti\r\n" + 
			"Noel\r\n" + 
			"Jannes\r\n" + 
			"Sam\r\n" + 
			"Benedikt\r\n" + 
			"Emilio\r\n" + 
			"Matheo0\r\n" + 
			"Alessio0\r\n" + 
			"Tobias\r\n" + 
			"John\r\n" + 
			"Justus\r\n" + 
			"Amir\r\n" + 
			"Emilian\r\n" + 
			"Henrik\r\n" + 
			"Malik\r\n" + 
			"Colin\r\n" + 
			"Collin\r\n" + 
			"Leopold\r\n" + 
			"Piet\r\n" + 
			"Ilias\r\n" + 
			"Ilyas\r\n" + 
			"Ali\r\n" + 
			"Luan\r\n" + 
			"Emir\r\n" + 
			"Joel\r\n" + 
			"Oliver\r\n" + 
			"Robin\r\n" + 
			"Marc\r\n" + 
			"Mark\r\n" + 
			"Silas\r\n" + 
			"Bela\r\n" + 
			"Carlo\r\n" + 
			"Karlo\r\n" + 
			"Enno0\r\n" + 
			"Jasper\r\n" + 
			"Richard\r\n" + 
			"Jonte\r\n" + 
			"Aras\r\n" + 
			"Frederik\r\n" + 
			"Frederic\r\n" + 
			"Jason\r\n" + 
			"Joris\r\n" + 
			"Thilo\r\n" + 
			"Tilo\r\n" + 
			"Ferdinand\r\n" + 
			"Friedrich\r\n" + 
			"Alex\r\n" + 
			"Lars\r\n" + 
			"Nicolas\r\n" + 
			"Nikolas\r\n" + 
			"Elyas\r\n" + 
			"Leano\r\n" + 
			"Arian\r\n" + 
			"Charlie\r\n" + 
			"Charly\r\n" + 
			"Bastian\r\n" + 
			"Connor\r\n" + 
			"Conner\r\n" + 
			"Elia\r\n" + 
			"Eliah\r\n" + 
			"Lion\r\n" + 
			"Hamza\r\n" + 
			"Len\r\n" + 
			"Lenn\r\n" + 
			"Finnley\r\n" + 
			"Finley\r\n" + 
			"Finlay0\r\n" + 
			"Leonardo\r\n" + 
			"Lorenz\r\n" + 
			"Manuel\r\n" + 
			"Mohammad\r\n" + 
			"Elian0\r\n" + 
			"Willi\r\n" + 
			"Willy\r\n" + 
			"Josef\r\n" + 
			"Joseph\r\n" + 
			"Lennox\r\n" + 
			"Mattheo\r\n" + 
			"Eddie\r\n" + 
			"Eddy\r\n" + 
			"Fabio\r\n" + 
			"Kian\r\n" + 
			"Bennet\r\n" + 
			"Konrad\r\n" + 
			"Maik\r\n" + 
			"Meik\r\n" + 
			"Mike\r\n" + 
			"Nikita\r\n" + 
			"Eymen\r\n" + 
			"Gustav0\r\n" + 
			"Lino\r\n" + 
			"Mohammed\r\n" + 
			"Muhammad\r\n" + 
			"Nathan\r\n" + 
			"Magnus\r\n" + 
			"Matthias\r\n" + 
			"Yunus\r\n" + 
			"Christian\r\n" + 
			"Lionel\r\n" + 
			"Ryan\r\n" + 
			"Tristan\r\n" + 
			"Yusuf\r\n" + 
			"Adem\r\n" + 
			"Aron\r\n" + 
			"Dean\r\n" + 
			"Elija\r\n" + 
			"Elijah\r\n" + 
			"Hugo\r\n" + 
			"Marvin\r\n" + 
			"Marwin\r\n" + 
			"Michel\r\n" + 
			"Miran\r\n" + 
			"Omar\r\n" + 
			"Deniz\r\n" + 
			"Diego\r\n" + 
			"Janosch\r\n" + 
			"Leandro\r\n" + 
			"Yasin\r\n" + 
			"Yigit\r\n" + 
			"Arne\r\n" + 
			"Filip\r\n" + 
			"Leonhard\r\n" + 
			"Robert\r\n" + 
			"Mia\r\n" + 
			"Emma\r\n" + 
			"Hannah\r\n" + 
			"Hanna\r\n" + 
			"Emilia\r\n" + 
			"Sofia\r\n" + 
			"Sophia\r\n" + 
			"Lina\r\n" + 
			"Lea\r\n" + 
			"Leah\r\n" + 
			"Mila\r\n" + 
			"Marie\r\n" + 
			"Emily\r\n" + 
			"Emilie\r\n" + 
			"Mathilda\r\n" + 
			"Matilda\r\n" + 
			"Lena\r\n" + 
			"Ella\r\n" + 
			"Leni\r\n" + 
			"Charlotte\r\n" + 
			"Frieda\r\n" + 
			"Frida\r\n" + 
			"Clara\r\n" + 
			"Klara\r\n" + 
			"Anna\r\n" + 
			"Luisa\r\n" + 
			"Louisa\r\n" + 
			"Johanna\r\n" + 
			"Leonie\r\n" + 
			"Amelie\r\n" + 
			"Lia\r\n" + 
			"Liah\r\n" + 
			"Lya\r\n" + 
			"Sophie\r\n" + 
			"Sofie\r\n" + 
			"Maja\r\n" + 
			"Maya\r\n" + 
			"Lara\r\n" + 
			"Ida\r\n" + 
			"Nele\r\n" + 
			"Neele\r\n" + 
			"Laura\r\n" + 
			"Greta\r\n" + 
			"Lilly\r\n" + 
			"Lilli\r\n" + 
			"Lotta\r\n" + 
			"Elisa\r\n" + 
			"Sarah\r\n" + 
			"Sara\r\n" + 
			"Melina\r\n" + 
			"Juna\r\n" + 
			"Yuna\r\n" + 
			"Victoria\r\n" + 
			"Viktoria\r\n" + 
			"Pia\r\n" + 
			"Nora\r\n" + 
			"Elina\r\n" + 
			"Paula\r\n" + 
			"Alina\r\n" + 
			"Elena\r\n" + 
			"Lisa\r\n" + 
			"Mara\r\n" + 
			"Marah\r\n" + 
			"Marlene\r\n" + 
			"Mira\r\n" + 
			"Luise\r\n" + 
			"Louise\r\n" + 
			"Maria\r\n" + 
			"Zoe\r\n" + 
			"Pauline\r\n" + 
			"Luna\r\n" + 
			"Isabella\r\n" + 
			"Romy\r\n" + 
			"Tilda\r\n" + 
			"Finja\r\n" + 
			"Finnja\r\n" + 
			"Julia\r\n" + 
			"Helena\r\n" + 
			"Rosalie\r\n" + 
			"Antonia\r\n" + 
			"Josephine\r\n" + 
			"Josefine0\r\n" + 
			"Merle\r\n" + 
			"Isabell\r\n" + 
			"Isabel\r\n" + 
			"Isabelle\r\n" + 
			"Valentina\r\n" + 
			"Mina\r\n" + 
			"Eva\r\n" + 
			"Jana\r\n" + 
			"Carlotta\r\n" + 
			"Karlotta\r\n" + 
			"Emely\r\n" + 
			"Emelie\r\n" + 
			"Amelia\r\n" + 
			"Anni\r\n" + 
			"Annie\r\n" + 
			"Anny\r\n" + 
			"Carla\r\n" + 
			"Karla\r\n" + 
			"Fiona0\r\n" + 
			"Martha\r\n" + 
			"Marta\r\n" + 
			"Paulina\r\n" + 
			"Theresa\r\n" + 
			"Teresa\r\n" + 
			"Lucy\r\n" + 
			"Lucie\r\n" + 
			"Malia\r\n" + 
			"Thea0\r\n" + 
			"Amalia\r\n" + 
			"Maila\r\n" + 
			"Mayla\r\n" + 
			"Elisabeth\r\n" + 
			"Elli\r\n" + 
			"Elly\r\n" + 
			"Nina\r\n" + 
			"Stella\r\n" + 
			"Luana\r\n" + 
			"Olivia\r\n" + 
			"Amy\r\n" + 
			"Ronja\r\n" + 
			"Chiara\r\n" + 
			"Kiara0\r\n" + 
			"Hailey\r\n" + 
			"Haylie\r\n" + 
			"Linda\r\n" + 
			"Milena\r\n" + 
			"Melissa\r\n" + 
			"Amira0\r\n" + 
			"Liya0\r\n" + 
			"Katharina\r\n" + 
			"Marleen\r\n" + 
			"Marlen\r\n" + 
			"Emmi\r\n" + 
			"Emmy\r\n" + 
			"Alma\r\n" + 
			"Jule\r\n" + 
			"Kira\r\n" + 
			"Kyra\r\n" + 
			"Annika\r\n" + 
			"Lotte\r\n" + 
			"Elif\r\n" + 
			"Ava\r\n" + 
			"Magdalena\r\n" + 
			"Malina\r\n" + 
			"Zoey\r\n" + 
			"Alessia\r\n" + 
			"Leila\r\n" + 
			"Leyla\r\n" + 
			"Livia\r\n" + 
			"Anastasia\r\n" + 
			"Elise\r\n" + 
			"Annabell\r\n" + 
			"Annabelle\r\n" + 
			"Lucia\r\n" + 
			"Jette\r\n" + 
			"Liana\r\n" + 
			"Liv\r\n" + 
			"Ariana\r\n" + 
			"Tessa\r\n" + 
			"Cataleya\r\n" + 
			"Miriam\r\n" + 
			"Alicia\r\n" + 
			"Aurelia\r\n" + 
			"Evelyn\r\n" + 
			"Evelin\r\n" + 
			"Eveline\r\n" + 
			"Ela\r\n" + 
			"Rosa\r\n" + 
			"Selina\r\n" + 
			"Jasmin\r\n" + 
			"Yasmin\r\n" + 
			"Alea0\r\n" + 
			"Alexandra\r\n" + 
			"Diana\r\n" + 
			"Liliana\r\n" + 
			"Lilliana\r\n" + 
			"Valerie\r\n" + 
			"Aaliyah\r\n" + 
			"Aliya\r\n" + 
			"Alice\r\n" + 
			"Amina\r\n" + 
			"Alisa\r\n" + 
			"Lene\r\n" + 
			"Jonna\r\n" + 
			"Talia\r\n" + 
			"Thalia\r\n" + 
			"Vanessa\r\n" + 
			"Franziska\r\n" + 
			"Milla\r\n" + 
			"Samira\r\n" + 
			"Sina\r\n" + 
			"Sinah\r\n" + 
			"Smilla\r\n" + 
			"Aurora\r\n" + 
			"Celine\r\n" + 
			"Medina\r\n" + 
			"Elin\r\n" + 
			"Lenja\r\n" + 
			"Lenya\r\n" + 
			"Milana\r\n" + 
			"Svea\r\n" + 
			"Edda\r\n" + 
			"Lynn\r\n" + 
			"Linn\r\n" + 
			"Ylvi\r\n" + 
			"Ylvie\r\n" + 
			"Eliana0\r\n" + 
			"Freya\r\n" + 
			"Marla\r\n" + 
			"Alya\r\n" + 
			"Aylin\r\n" + 
			"Eileen\r\n" + 
			"Aileen\r\n" + 
			"Ayleen\r\n" + 
			"Helene\r\n" + 
			"Leana\r\n" + 
			"Nika\r\n" + 
			"Aleyna\r\n" + 
			"Carolina\r\n" + 
			"Karolina\r\n" + 
			"Lana0\r\n" + 
			"Enna\r\n" + 
			"Annelie\r\n" + 
			"Kaja\r\n" + 
			"Kaya\r\n" + 
			"Caja\r\n" + 
			"Linea\r\n" + 
			"Linnea\r\n" + 
			"Mariam\r\n" + 
			"Maryam\r\n" + 
			"Ayla\r\n" + 
			"Clea\r\n" + 
			"Giulia0\r\n" + 
			"Melisa\r\n" + 
			"Valeria0\r\n" + 
			"Zeynep\r\n" + 
			"Ellie\r\n" + 
			"Florentine\r\n" + 
			"Jara\r\n" + 
			"Yara\r\n" + 
			"Laila\r\n" + 
			"Layla\r\n" + 
			"Leona\r\n" + 
			"Ruby\r\n" + 
			"Vivien\r\n" + 
			"Vivienne\r\n" + 
			"Hilda0\r\n" + 
			"Ina\r\n" + 
			"Leonora\r\n" + 
			"Lorena\r\n" + 
			"Lou\r\n" + 
			"Mathea\r\n" + 
			"Matea\r\n" + 
			"Meryem\r\n" + 
			"Miray\r\n" + 
			"Nisa\r\n" + 
			"Palina\r\n" + 
			"Azra\r\n" + 
			"Delia\r\n" + 
			"Eleni";

	


	public Kunden(Destination destination, String name, int kundeId) {
		this.destination = destination;
		this.name = name;
		this.kundeId = kundeId;
		
		nameArray = names.split("[\\r\\n]+");
		for(int i = 0;i < nameArray.length;i++)
		{
			System.out.println(nameArray[i]);
		}
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
		/*
		for(int i=0; i < nameArray.length; i++){
			System.out.println(nameArray[i]);
			
		}*/
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
