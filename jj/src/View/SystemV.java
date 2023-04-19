/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author 01
 */
public class SystemV extends Stage {

    public SystemV() throws IOException {
        
        FXMLLoader o = new FXMLLoader(getClass().getResource("/View/AdminFXML/systemPage.fxml"));
        Parent rootCreate = o.load();
        Scene scen = new Scene(rootCreate);
        this.setScene(scen);
    }

}
