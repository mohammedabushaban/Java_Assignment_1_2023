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
public class Converting extends Stage {

    private Scene convertingScene;

    public Converting() throws IOException {
        super();

        FXMLLoader loaderCreate = new FXMLLoader(getClass().getResource("FXMLViews/currencyConversion.fxml"));
        Parent rootCreate = loaderCreate.load();
        convertingScene = new Scene(rootCreate);
    }

    public void changeSceneToConvertingScene() {
        this.setScene(convertingScene);
    }
}
