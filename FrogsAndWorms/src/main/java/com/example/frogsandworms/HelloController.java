package com.example.frogsandworms;


import java.io.File;

import javafx.event.ActionEvent;
import java.io.File;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class HelloController {

    @FXML
    private ImageView imageView;

    @FXML
    private Text gameText;

    @FXML
    private ToggleGroup radioGroup;

    @FXML

    private ImageView imageView;

    @FXML
    private Text gameText;

    @FXML
    private ToggleGroup radioGroup;

    @FXML
    private RadioButton option1;

    @FXML
    private RadioButton option2;

    @FXML
    private RadioButton option3;

    private scene currentScene;
    private SceneManager sceneManager = null;

    public void switchTextAndImage() {
        // Update the text and image based on some logic
        gameText.setText("New game text!");
        File file = new File("images/pussyRat.png");
        Image image = new Image(file.toURI().toString());
        imageView.setImage(image);

        // Update the text of radio buttons
        option1.setText("New Option 1");
        option2.setText("New Option 2");
        option3.setText("New Option 3");
    }

    @FXML
    void Option1 (ActionEvent event) {
        SwitchScene(currentScene.sceneOp1);
    }
    @FXML
    void Option2 (ActionEvent event) {
        SwitchScene(currentScene.sceneOp2);
    }
    @FXML
    void Option3 (ActionEvent event) {
        SwitchScene(currentScene.sceneOp3);
    }

    public void SwitchScene(int sceneID){
        if (sceneID == -1){ return; }
        if (sceneManager == null)
        {
            sceneManager = new SceneManager();
        }
        currentScene = sceneManager.GetScene(sceneID);
        LoadScene();
    }

    public void LoadScene()
    {
        gameText.setText(currentScene.text);
        imageView.setImage(currentScene.image);
        option1.setText(currentScene.btn1);
        option2.setText(currentScene.btn2);
        option3.setText(currentScene.btn3);
    }
}