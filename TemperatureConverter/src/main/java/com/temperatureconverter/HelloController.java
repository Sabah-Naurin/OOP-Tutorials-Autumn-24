package com.temperatureconverter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField celciusField;
    @FXML
    private TextField fahrenheitField;

    @FXML
    public void onCelciusButtonClick(ActionEvent actionEvent) {
        Temperature t = new Temperature(Float.parseFloat(fahrenheitField.getText()));
        celciusField.setText(String.valueOf(t.getCelcius()));
    }

    @FXML
    public void onFahrenheitButtonClick(ActionEvent actionEvent) {
        Temperature t = new Temperature(Float.parseFloat(celciusField.getText()));
        fahrenheitField.setText(String.valueOf(t.getFahrenheit()));
    }
}