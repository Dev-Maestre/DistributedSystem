package com.example.dsystem.Controllers.Admin;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class AdminController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}