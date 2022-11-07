package controller;

import conexao.Conexao_DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class telacadastroController {
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private Button btnsingup;

    @FXML
    private TextField inputNomeCadastro;

    @FXML
    private TextField inputSenhaCadastro;

    @FXML
    void chamarlog(ActionEvent event) throws SQLException {
        try { 
            Connection conn = Conexao_DB.conectar_db();
        
            String sql = "insert into dados_db(usuario, senha) value (?, ?)";
            PreparedStatement stnt = conn.prepareStatement(sql);
        
         
            stnt.setString(1, inputNomeCadastro.getText());
            stnt.setString(2, inputSenhaCadastro.getText());
            
         
            
            stnt.execute();
            stnt.close();
            conn.close();
            JOptionPane.showMessageDialog(null, "Cadastrado!!");
            
            root = FXMLLoader.load(getClass().getResource("/view/telalogin.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
    } catch (Exception e){

}

    }

}