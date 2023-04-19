/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.viewMan;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author 01
 */
public class systemPageController extends Stage implements Initializable {

    @FXML
    private Button logOut;
    @FXML
    private Button convert;
    @FXML
    private TextField usd;
    @FXML
    private TextField nis;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void logOutA(ActionEvent event) throws IOException {
        viewMan.closeSystem();
        viewMan.openLogin();
        
        
        
        
    }
 
    

    @FXML
    private void convertA(ActionEvent event) {
    
        if(usd.getText().isEmpty()){
               
        double ni=   Double.parseDouble(nis.getText());
     double result1=ni*0.27;
     usd.setText(result1+" ");
        
         }
    else if(nis.getText().isEmpty()){
        
         
     
        
        double us=   Double.parseDouble(usd.getText());
     double result=us*3.65;
     nis.setText(result+" ");
        
    }
    }
}
