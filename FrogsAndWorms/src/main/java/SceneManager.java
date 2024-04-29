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
	
	
}
