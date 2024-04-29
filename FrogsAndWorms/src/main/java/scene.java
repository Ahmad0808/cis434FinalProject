package com.example.frogsandworms;
import javafx.fxml.FXML;
import javafx.scene.image.Image;

public class scene{
	int sceneID;
	Image image;
	String text;
	String btn1;
	String btn2;
	String btn3;
	
	
	public void sceneDungeon1() {
		this.sceneID = 1;
		this.image = new Image(getClass().getResourceAsStream("dungeonScene1.jpg"));
		this.text = "The putrid stench of rotting flesh filled my amphibious nose as death surrounds me in the lair of the Skrott. My limbs are shackled and my equipment has been taken away. Good thing I have put lots of practice into:";
		this.btn1 = "Strength";
		this.btn2 = "Luck";
		this.btn3 = "Intelligence";
	}
	
	public void sceneDungeon2() {
		this.sceneID =2;
		this.image = new Image(getClass().getResourceAsStream("dungeonScene1.jpg"));
		this.text = "The Frosks will need their Bog-Lord, what shall I do?";
		this.btn1 = "Wait";
		this.btn2 = "Break-Free";
		this.btn3 = "";
	}
	
	public void sceneDungeon3() {
		this.sceneID =3;
		this.image = new Image(getClass().getResourceAsStream("dungeonWSword.jpg"));
		this.text = "I have found my trusty sword - Zephyr. The sword will protect me but it is all about the wielder. I need to escape so I can replenish my strength. For now I am about as weak as an average Bog-Walker. There is a dimly-lit cavernous path on my right or a wooden door with light breaching out below it:";
		this.btn1 = "Dimly-lit Path";
		this.btn2 = "Door";
		this.btn3 = "";
	}
