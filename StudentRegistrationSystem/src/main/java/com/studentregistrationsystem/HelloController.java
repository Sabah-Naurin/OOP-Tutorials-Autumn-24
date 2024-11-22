package com.studentregistrationsystem;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private TextField idField;
    @FXML
    private TextField majorField;
    @FXML
    private TextField nameField;

    private ObservableList<Student> studList = FXCollections.observableArrayList();

    public void setStudList(ObservableList<Student> studList) {
        this.studList = studList;
    }

    @FXML
    public void onViewButtonClick(ActionEvent actionEvent) throws IOException {
        StudentDirectoryController sdc = SceneSwitcher.switchScene(actionEvent, "studentDirectory-view.fxml", "Student Directory");
        sdc.setStudList(studList);
    }

    @FXML
    public void onCreateEntryButtonClick(ActionEvent actionEvent) {
        Student newStudent = new Student(nameField.getText(), idField.getText(), majorField.getText());
        studList.add(newStudent);
    }
}