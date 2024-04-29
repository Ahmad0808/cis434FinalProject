package com.example.frogsandworms;

import javafx.scene.image.Image;

public class SceneManager {
    public scene[] scenes;

    public SceneManager(){
        scenes = new scene[10];

    }

    public scene GetScene(int sceneID){
        return scenes[sceneID];
    }

    public scene sceneDungeon1() {
        scene s = new scene();
        s.sceneID = 1;
        s.image = new Image(getClass().getResourceAsStream("dungeonscene1.jpg"));
        s.text = "The putrid stench of rotting flesh filled my amphibious nose as death surrounds me in the lair of the Skrott. My limbs are shackled and my equipment has been taken away. Good thing I have put lots of practice into:";
        s.btn1 = "Strength";
        s.btn2 = "Luck";
        s.btn3 = "Intelligence";
        return s;
    }

    public scene sceneDungeon2() {
        scene s = new scene();
        s.sceneID =2;
        s.image = new Image(getClass().getResourceAsStream("dungeonscene1.jpg"));
        s.text = "The Frosks will need their Bog-Lord, what shall I do?";
        s.btn1 = "Wait";
        s.btn2 = "Break-Free";
        s.btn3 = "";
        return s;
    }

    public scene sceneDungeon3() {
        scene s = new scene();
        s.sceneID =3;
        s.image = new Image(getClass().getResourceAsStream("dungeonWSword.jpg"));
        s.text = "I have found my trusty sword - Zephyr. The sword will protect me but it is all about the wielder. I need to escape so I can replenish my strength. For now I am about as weak as an average Bog-Walker. There is a dimly-lit cavernous path on my right or a wooden door with light breaching out below it:";
        s.btn1 = "Dimly-lit Path";
        s.btn2 = "Door";
        s.btn3 = "";
        return s;
    }
}
