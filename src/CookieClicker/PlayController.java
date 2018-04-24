/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CookieClicker;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Bounds;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;


/**
 * FXML Controller class
 *
 * @author jreyr
 */
public class PlayController implements Initializable 
{
    @FXML
    AnchorPane anchorPane;
    
    @FXML
    Label cookie;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        
    }    
    
    private void translateCookie(ActionEvent event) throws IOException
    {
        TranslateTransition transition = new TranslateTransition();
        transition.setDuration(Duration.seconds(1));
        transition.setNode(cookie);
        
        final Bounds bounds = anchorPane.getLayoutBounds();
        
        transition.setToY
        (
                getRandomValueFromTo
                (
                        (int)bounds.getMinY() + (int)cookie.getBoundsInParent().getHeight()/2,
                        (int)bounds.getMaxY() - (int)cookie.getBoundsInParent().getHeight()/2
                )
        );
        transition.setToX
        (
                getRandomValueFromTo
                (
                        (int)bounds.getMinX() + (int)cookie.getBoundsInParent().getHeight()/2,
                        (int)bounds.getMaxX() - (int)cookie.getBoundsInParent().getHeight()/2
                )
        );
        
        transition.setAutoReverse(true);
        transition.setCycleCount(TranslateTransition.INDEFINITE);
        transition.play();
    }
    private int getRandomValueFromTo(int max, int min)
    {
        if(min > max)
        {
            int temp = max;
            max = min;
            min = temp;
        }
     
        Random rand = new Random(); 
        return rand.nextInt((max - min) + 1) + min;
    }
}
