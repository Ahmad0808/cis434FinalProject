package com.example.frogsandworms;

import com.example.frogsandworms.scene;
import javafx.scene.image.Image;

public class SceneManager {
    public scene[] scenes;

    public SceneManager(){
        scenes = new scene[10];

    }

   public scene sceneDungeon1() {
		scene scene = new scene();
		scene.sceneID = 1;
		scene.image = new Image(getClass().getResourceAsStream("dungeonscene1.jpg"));
		scene.text = "The putrid stench of rotting flesh filled my amphibious nose as death surrounds me in the lair of the Skrott. My limbs are shackled and my equipment has been taken away. Good thing I have put lots of practice into:";
		scene.btn1 = "Strength";
		scene.btn2 = "Luck";
		scene.btn3 = "Intelligence";
		return scene;
	}
	
	public scene sceneDungeon2() {
		scene scene = new scene();
		scene.sceneID =2;
		scene.image = new Image(getClass().getResourceAsStream("dungeonscene1.jpg"));
		scene.text = "The Frosks will need their Bog-Lord, what shall I do?";
		scene.btn1 = "Wait";
		scene.btn2 = "Break-Free";
		scene.btn3 = "";
		return scene;
	}
	
	public scene sceneDungeon3() {
		scene scene = new scene();
		scene.sceneID =3;
		scene.image = new Image(getClass().getResourceAsStream("dungeonWSword.jpg"));
		scene.text = "I have found my trusty sword - Zephyr. The sword will protect me but it is all about the wielder. I need to escape so I can replenish my strength. For now I am about as weak as an average Bog-Walker. There is a dimly-lit cavernous path on my right or a wooden door with light breaching out below it:";
		scene.btn1 = "Dimly-lit Path";
		scene.btn2 = "Door";
		scene.btn3 = "";
		return scene;
	}
	
	public scene sceneCatacombs() {
		scene scene = new scene();
		scene.sceneID = 4;
		scene.image = new Image(getClass().getResourceAsStream("catacombsFight.jpg"));
		scene.text = "“I enter the darkly lit caverns, hoping to ascene finding any trouble. The sounds of tortured screams wail from behind me. I think to myself I escaped just in time. Just as the thought materializes, the screeching sounds of the Skrott come. I decide to";
		scene.btn1 = "Run";
		scene.btn2 = "Fight";
		scene.btn3 = "";
		return scene;
	}
	public scene scenePostFightCatacombsRun() {
		scene scene = new scene();
		scene.sceneID = 6;
		scene.image = new Image(getClass().getResourceAsStream("catacombsFight.jpg"));
		scene.text = "I barely managed to outrun the feral beasts of the Catacombs, but I made it away with my life and Zephyr.... barely";
		scene.btn1 = "Continue";
		scene.btn2 = "";
		scene.btn3 = "";
		return scene;
		}
	
	public scene scenePostFightCatacombsFight() {
		scene scene = new scene();
	scene.sceneID = 5;
	scene.image = new Image(getClass().getResourceAsStream("catacombsFight.jpg"));
	scene.text = "You thrashed the first rat that approached. The other lowly rats stared in awe at the carnage you left behind. They scamper away in hopes of seeing the next day. A light peers out from the edge of the tunnel";
	scene.btn1 = "Continue";
	scene.btn2 = "";
	scene.btn3 = "";
	return scene;
	}
	
	public scene sceneUnitePostCatacombs() {
		scene scene = new scene();
		scene.sceneID = 7;
		scene.image = new Image(getClass().getResourceAsStream("postCatacombs.jpg"));
		scene.text = "“I have finally be freed. The choice now lies before me of how to return home. My options lied between the open plains that lie south of Skrottvete or the swamp, Frosk Myr, where my ancestors once ruled before the pestilent Skrotts.";
		scene.btn1 = "Plains";
		scene.btn2 = "Frosk Myr";
		scene.btn3 = "";
		return scene;
	}
	
	public scene scenePlainsOpen() {
		scene scene = new scene();
		scene.sceneID = 8;
		scene.image = new Image(getClass().getResourceAsStream("plainsOpener.jpg"));
		scene.text = "A great sense of relief fell over me as I escaped Skrottevete. I can’t remember how long it had been since those Skrotts took me captive. I can’t remember much of what happened leading up to then, but I know my people are looking for me. The Bog-Lord must return! There seem to be I continue through the open fields as:";
		scene.btn1 = "Continue";
		scene.btn2 = "";
		scene.btn3 = ""; 	
		return scene;
	}
	public scene scenePlainsBattleOne() {
		scene scene = new scene();
		scene.sceneID = 9;
		scene.image = new Image(getClass().getResourceAsStream("battleRats.jpg"));
		scene.text = "Two Rat warriors approach in the distance. I decide to:";
		scene.btn1 = "Fight";  //Pipe to fight mechanic no scene switch
		scene.btn2 = "Run";  // Roll -> Pass = new scene Fail = Fight
		scene.btn3 = "Big Brain";   //Pass = new scene Fail = fight
		return scene;
	}
	
	public scene scenePlains() {
		scene scene = new scene();
		scene.sceneID = 10;
		scene.image = new Image(getClass().getResourceAsStream("sunset.jpg"));
		scene.text = "The sun is setting. I will take my rest for the evening and should land in my home of Froskens Hjem, by end of tomorrow.";
		scene.btn1 = "Continue";  //Pipe to fight mechanic no scene switch
		scene.btn2 = "";  // Roll -> Pass = new scene Fail = Fight
		scene.btn3 = "";   //Pass = new scene Fail = fight
		return scene;  //Consider healing player here?
	}
	
	public scene sceneWorm() {
		scene scene = new scene();
		scene.sceneID = 11;
		scene.image = new Image(getClass().getResourceAsStream("worm.jpg"));
		scene.text = "I set off on my final leg of the Journey, I pray for little difficulties…as a Wyrm bursts through the crust of the Earth. There is no escape. I try to think back on my studies in Academy to remember their weak points.";
		scene.btn1 = "Continue";  //Pipe to fight mechanic no scene switch
		scene.btn2 = "";  // Roll -> Pass = new scene Fail = Fight
		scene.btn3 = "";   //Pass = new scene Fail = fight
		return scene;  //Consider healing player here?
	}
	
	public scene scene3opener() {
		scene scene = new scene();
		scene.sceneID = 12;
		scene.image = new Image(getClass().getResourceAsStream("scene3Opener.jpg"));
		scene.text = "As you have reached the edge of the plains, you slowly see the greens of your home return. You notice as your kin recognize you and know the return of the Bog-lord means the Frosks have a fighting chance";
		scene.btn1 = "Continue";
		scene.btn2 = "";
		scene.btn3 = ""; 	
		return scene;
	}
	
	public scene froskelott() {
		scene scene = new scene();
		scene.sceneID = 13;
		scene.image = new Image(getClass().getResourceAsStream("froskelott.jpg"));
		scene.text = "“I continued down my path to my place of rest, the beautiful Froskeslott. I rush inside to meet with my greatest companion, Durkesh.";
		scene.btn1 = "Continue";
		scene.btn2 = "";
		scene.btn3 = ""; 	
		return scene;
	}
	public scene insideFroskelott() {
		scene scene = new scene();
		scene.sceneID = 14;
		scene.image = new Image(getClass().getResourceAsStream("durkesh.jpg"));
		scene.text = "Durkesh: My lord! You have returned! No one knew where you had gone after the Battle of Mørk Skog.";
		scene.btn1 = "Continue";
		scene.btn2 = "";
		scene.btn3 = ""; 	
		return scene;
	}
	
	public scene insideFroskelott2() {
		scene scene = new scene();
		scene.sceneID = 15;
		scene.image = new Image(getClass().getResourceAsStream("durkesh.jpg"));
		scene.text = "Durkesh:You don’t remember anything? We don’t know much either. You were leading our army against the Skrott’s western infantry. You were leading the front with Zephyr cutting through our foes when the forest exacted its evil intentions. A massive eight-legged monstrosity crawled out seemingly in support of Kelly, the Rat Empress.";
		scene.btn1 = "Continue";
		scene.btn2 = "";
		scene.btn3 = ""; 	
		return scene;
	}
	
	public scene ratQueenPreview() {
		scene scene = new scene();
		scene.sceneID = 16;
		scene.image = new Image(getClass().getResourceAsStream("ratQueen.jpg"));
		scene.text = "Durkesh:Our forces were dispersed and had to retreat. Somehow in all of that we had lost you and had lost all hope for your return. We were beginning preparations to send spies in to survey if they had taken or slain you, however just days before we sent them out you returned";
		scene.btn1 = "Continue";
		scene.btn2 = "";
		scene.btn3 = ""; 	
		return scene;
	}
	public scene returnToDurkesh() {
		scene scene = new scene();
		scene.sceneID = 17;
		scene.image = new Image(getClass().getResourceAsStream("durkesh.jpg"));
		scene.text = "Gylve: Do not fret dear Durkesh. No need for spies, no need for further battles. I have lived to see the inside of Skrottvete. I know the ways and I must be the one to end this feud. The great Kelly haunts me no further. I simply ask for some of your services, friend";
		scene.btn1 = "Continue";
		scene.btn2 = "";
		scene.btn3 = ""; 	
		return scene;
	}
	public scene imLosingIt() {
		scene scene = new scene();
		scene.sceneID = 18;
		scene.image = new Image(getClass().getResourceAsStream("durkesh.jpg"));
		scene.text = "“Durkesh: Of course lord. Lets repair Zephyr. I am only able to do so much with my knowledge of this relic’s abilities.”";
		scene.btn1 = "Ask for Repair";  //regular plus one level for sword
		scene.btn2 = "Big Brain";  //chance for two in one upgrade
		scene.btn3 = ""; 	
		return scene;
	}
	
	public scene swordNew() {
		scene scene = new scene();
		scene.sceneID = 19;
		scene.image = new Image(getClass().getResourceAsStream("swordRenewed.jpg"));
		scene.text = "Durkesh: Here is your new and improved sword my master. The original properties have been restored and its beautiful flaming edges should reappear in times of need.";
		scene.btn1 = "Continue";  //regular plus one level for sword
		scene.btn2 = "";  //chance for two in one upgrade
		scene.btn3 = ""; 	
		return scene;
	}
	public scene swordNew2() {
		scene scene = new scene();
		scene.sceneID = 20;
		scene.image = new Image(getClass().getResourceAsStream("swordRenewed.jpg"));
		scene.text = "Gylve: Thank you my friend. I will rest here tonight and then go by way of the Mørk Skog as few should remain after our battle.";
		scene.btn1 = "Continue";  //regular plus one level for sword
		scene.btn2 = "";  //chance for two in one upgrade
		scene.btn3 = ""; 	
		return scene;
	}
	
	public scene act3() {
		scene scene = new scene();
		scene.sceneID = 21;
		scene.image = new Image(getClass().getResourceAsStream("act3.jpg"));
		scene.text = "The next day came, and my rage grew. I quickly arose, grabbing Zephyr and head out for Mørk Skog. I was prepared for anything that came my way in there, but the gods were on my side as I came out the other side to finally see Skrottvete for what would be my last time";
		scene.btn1 = "Continue";  //regular plus one level for sword
		scene.btn2 = "";  //chance for two in one upgrade
		scene.btn3 = ""; 	
		return scene;
	}
	
	public scene skrotteveteExterior() {
		scene scene = new scene();
		scene.sceneID = 22;
		scene.image = new Image(getClass().getResourceAsStream("skrotteveteExterior.jpg"));
		scene.text = "Seeing Skrottevete sent a chill down my spine.  The cries of tortured victims could be heard from the edge of the forest. The Rat Empress sits at the top of the Castle and I will have to make my way through the floors to reach her.";
		scene.btn1 = "Continue";  //regular plus one level for sword
		scene.btn2 = "";  //chance for two in one upgrade
		scene.btn3 = ""; 	
		return scene;
	}
	
	public scene skrotteveteFight() {
		scene scene = new scene();
		scene.sceneID = 23;
		scene.image = new Image(getClass().getResourceAsStream("skrotteveteFight.jpg"));
		scene.text = "Upon entering, I am greeted by a Rat Warrior and Rat Knight";
		scene.btn1 = "Fight";  //regular plus one level for sword
		scene.btn2 = "";  //chance for two in one upgrade
		scene.btn3 = ""; 	
		return scene;
	}
	
	public scene skrotteveteConnect() {
		scene scene = new scene();
		scene.sceneID = 24;
		scene.image = new Image(getClass().getResourceAsStream("connect.jpg"));
		scene.text = "After defeating the Skrott Scum, I passed through the doors leading out of the current tower and leading towards the evil I sought to vanquish. All that lied before me was her torture chamber, the place I lost a bit of myself";
		scene.btn1 = "Continue";  //regular plus one level for sword
		scene.btn2 = "";  //chance for two in one upgrade
		scene.btn3 = ""; 	
		return scene;
	}
	
	public scene torture() {
		scene scene = new scene();
		scene.sceneID = 25;
		scene.image = new Image(getClass().getResourceAsStream("tort.jpg"));
		scene.text = "I continued forward finally entering Kelly's Fortress of Torture. As I do 2 Rat Knights and 2 Rat Warriors approach for battle";
		scene.btn1 = "Fight";  //regular plus one level for sword
		scene.btn2 = "";  //chance for two in one upgrade
		scene.btn3 = ""; 	
		return scene;
	}
	
	public scene finalBoss() {
		scene scene = new scene();
		scene.sceneID = 26;
		scene.image = new Image(getClass().getResourceAsStream("kelly.jpg"));
		scene.text = "I finally dismantled Kelly's Lackeys. I entered into her throne room. The foul smell of decay and pestilence aerated from Kelly's monsterous body. My time had come I only had one option:";
		scene.btn1 = "Fight";  //regular plus one level for sword
		scene.btn2 = "";  //chance for two in one upgrade
		scene.btn3 = ""; 	
		return scene;
	}
}
