package com.gpacalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField course1Credit;
    @FXML
    private TextField course2Credit;
    @FXML
    private TextField course1GPA;
    @FXML
    private TextField course2GPA;
    @FXML
    private TextField course3GPA;
    @FXML
    private TextField course3Credit;
    @FXML
    private TextField nameField;
    @FXML
    private Label gpaLabel;

    @FXML
    public void onCalculateButtonClick(ActionEvent actionEvent) {
        Student s = new Student();

        String studentName = nameField.getText();
        s.name = studentName;
        s.creditArray[0] = Integer.parseInt(course1Credit.getText());
        s.creditArray[1] = Integer.parseInt(course2Credit.getText());
        s.creditArray[2] = Integer.parseInt(course3Credit.getText());

        s.gradeArray[0] = Double.parseDouble(course1GPA.getText());
        s.gradeArray[1] = Double.parseDouble(course2GPA.getText());
        s.gradeArray[2] = Double.parseDouble(course3GPA.getText());

        double gpa = s.calculateGPA();

        gpaLabel.setText(s.name + "'s GPA is " + gpa);
    }
}