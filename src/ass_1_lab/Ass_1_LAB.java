/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass_1_lab;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import views.ViewManager;

/**
 *
 * @author MoHammeD
 */
public class Ass_1_LAB extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        ViewManager.loginPage();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
