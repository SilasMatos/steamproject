package controller;


import FlappyBird.FlappyBird;
import FlappyBird.Motor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Button;


public class telaflappyController extends FlappyBird{
    
    @FXML
    private Button btnstart;

    @FXML
    void chamarflappy(ActionEvent event){
        roda();
    }
        
    public static void main(String[] args) {
        roda();
    }
    
    private static void roda() {
    	new Motor(new FlappyBird());
    }
	

}
