/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author MoHammeD
 */
public class LoginPage extends Stage {

    private Scene loginScene;

    LoginPage() throws IOException {
        super();

        FXMLLoader loaderCreate = new FXMLLoader(getClass().getResource("FXMLViews/LoginPage.fxml"));
        Parent root = loaderCreate.load();
        loginScene = new Scene(root);
    }

    public void changeSceneToLoginScene() {
        this.setScene(loginScene);
    }
}
