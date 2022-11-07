package controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class telasteamController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private Button btnFlappy;

    @FXML
    private Button btnRecords;

    @FXML
    private Button btnsair;

    @FXML
    private Button btnsnake;

    @FXML
    void ChamarFlappy(ActionEvent event)  throws IOException {
    root = FXMLLoader.load(getClass().getResource("/view/telaflappy.fxml"));
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
    }

    @FXML
    void chamagameSnake(ActionEvent event) throws IOException {
    root = FXMLLoader.load(getClass().getResource("/view/telasnake.fxml"));
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
    }

    @FXML
    void chamarRecords(ActionEvent event) {
        
    }

}
