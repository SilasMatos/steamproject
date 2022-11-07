package mains;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main1 extends Application {
 
 @Override
 public void start(Stage stage) throws IOException {
   Parent root = FXMLLoader.load(getClass().getResource("/view/telalogin.fxml"));
   Scene scene = new Scene(root);
   stage.setScene(scene);
   stage.show();
   
 } 

 public static void main(String[] args) {
  launch(args);
 }
}