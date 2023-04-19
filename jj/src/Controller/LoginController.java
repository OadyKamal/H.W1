/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controller;

import View.viewMan;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author pc
 */
public class LoginController implements Initializable {

    @FXML
    private AnchorPane mnm;
    @FXML
    private ImageView image;
    @FXML
    private Label nameLabel;
    @FXML
    private TextField user;
    @FXML
    private Label passwordLabel;
    @FXML
    private TextField password;
    @FXML
    private Button button;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void buttonA(ActionEvent event) throws IOException {
        if (user.getText().equals("user") && password.getText().equals("userpass")) {
            viewMan.openSystem();
            viewMan.closeLogin();
        }else{
             Alert alert = new Alert(Alert.AlertType.ERROR);
    alert.setTitle("Mistake");
    alert.setHeaderText("Incorrect username or password");
   alert.showAndWait();
    }
    }   
}
