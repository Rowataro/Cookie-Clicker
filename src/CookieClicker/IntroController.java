/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CookieClicker;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author jreyr
 */
public class IntroController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    
    /*
        Changes scene to howToPlay
    */
    
    @FXML
    public void changeToHowToPlayWhenButtonPushed(ActionEvent event) throws IOException
    {
        Parent parent = FXMLLoader.load(getClass().getResource("HowToPlay.fxml"));
        Scene scene= new Scene(parent);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene);
        window.show();
    }
    
    @FXML
    public void changeToPlayWhenButtonPushed(ActionEvent event) throws IOException
    {
        Parent parent = FXMLLoader.load(getClass().getResource("Play.fxml"));
        Scene scene = new Scene(parent);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene);
        window.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
