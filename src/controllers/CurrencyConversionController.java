/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author MoHammeD
 */
public class CurrencyConversionController implements Initializable {

    @FXML
    private Label btn;
    @FXML
    private Button logout;
    @FXML
    private TextField nis;
    @FXML
    private TextField usd;
    @FXML
    private Button convertBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void logOut(ActionEvent event) {
        views.ViewManager.closeConvertingPage();
    }

    @FXML
    private void convert(ActionEvent event) {
        try {
            double usdValue = Double.parseDouble(usd.getText());
            if (usdValue <= 0) {
                throw new NumberFormatException();
            }
            double nisValue = usdValue * 3.5;
            nis.setText(String.valueOf(nisValue));
        } catch (NumberFormatException ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Invalid Input");
            alert.setHeaderText(null);
            alert.setContentText("Please enter a valid positive number.");
            alert.showAndWait();
            usd.setText("");
            nis.setText("");
        }

    }
}
