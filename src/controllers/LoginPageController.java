/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author MoHammeD
 */
public class LoginPageController implements Initializable {

    @FXML
    private TextField usernameField;
    @FXML
    private TextField passwordField;
    @FXML
    private Button loginButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void login(ActionEvent event) throws IOException {
        String username = usernameField.getText();
        String password = passwordField.getText();

        // Check if the username and password are correct
        if (username.equals("admin") && password.equals("admin")) {
            // Load the Currency Conversion Page
            views.ViewManager.openConvertingPage();
        } else {
            // Display an alert message to the user
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Login Error");
            alert.setHeaderText("Invalid username or password");
            alert.setContentText("Please enter valid credentials.");
            alert.showAndWait();
        }
    }

}
