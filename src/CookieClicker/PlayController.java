/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CookieClicker;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;


/**
 * FXML Controller class
 *
 * @author jreyr
 */
public class PlayController implements Initializable 
{
   
    /**
     * Initializes the controller class.
     */
   
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        updateCookie();
    }    
    
    @FXML
    private void updateCookie()
    {       
        
        ++totalClicks;
        
        if(totalClicks <= 10)
        {
            System.out.println("Cookie clicked! Counter: " + totalClicks);
        }
        
        Group[] cookies = {cookie1, cookie2, cookie3, cookie4, cookie5};
        
        for(int index = 0; index < cookies.length; ++index)
        {
            TranslateTransition transition = new TranslateTransition();
            
            if(totalClicks == 10)
            {
                System.out.println("Congratulations you won! Cookie Monster is proud of you.");
                
            }
            
            transition.setDuration(new Duration(500));
            transition.setNode(cookies[index]);


            transition.setToY
            (
                   getRandomValueFromTo(-200, 200)
            );
            transition.setToX
            (
                    getRandomValueFromTo(-200, 200)
            );

            transition.setAutoReverse(false);
            transition.setCycleCount(TranslateTransition.INDEFINITE);

            transition.play();
        }
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
    
    @FXML
    AnchorPane anchorPane;
    
    @FXML
     Group cookie1;
    
    @FXML
     Group cookie2;
    
    @FXML
     Group cookie3;
    
    @FXML
     Group cookie4;
    
    @FXML
     Group cookie5;
    
    private int totalClicks = 10;
}
    
    
   
