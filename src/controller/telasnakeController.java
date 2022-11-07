package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import snakegame.GameFrame;
import snakegame.SnakeGame;

public class telasnakeController extends SnakeGame {

    public static void GameFrame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private Button btncomecar;

    @FXML
    public void chamarjogo(ActionEvent event) {
         GameFrame frame = new GameFrame();
    }
}
