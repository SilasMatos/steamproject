package controller;

import conexao.Conexao_DB;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class telaloginController  implements Initializable{
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private Button btnlogin;

    @FXML
    private TextField inputname;

    @FXML
    private PasswordField inputpassword;

    @FXML
    void chamarTelaCadastro(ActionEvent event) throws SQLException, IOException {
        root = FXMLLoader.load(getClass().getResource("/view/telacadastro.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void handleButtonAction(ActionEvent event) throws SQLException {
        
       
        try{
            
            Connection conn = Conexao_DB.conectar_db();
            String sql = "Select * from dados_db where usuario = ? and senha = ? ";
            
            PreparedStatement stnt = conn.prepareStatement(sql);
            
            stnt.setString(1, inputname.getText());
            stnt.setString(2, inputpassword.getText());
            
            ResultSet rs = stnt.executeQuery();              
              
              
              
            if(rs.next()){
                 root = FXMLLoader.load(getClass().getResource("/view/telasteam.fxml"));
                 stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                 scene = new Scene(root);
                 stage.setScene(scene);
                 stage.show();
                  
            }else{
                JOptionPane.showMessageDialog(null, "Invalido");
            }
            
            stnt.close();
            conn.close();
            
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // todo
    }

  
}
