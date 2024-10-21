package com.example.arraylistpractice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class HelloController {


    @FXML
    private TextField IdField;
    @FXML
    private TextField nameField;
    @FXML
    private ComboBox<String> majorBox;
    @FXML
    private TableColumn<Student, Integer> IdCol;
    @FXML
    private TableColumn<Student, String> nameCol;
    @FXML
    private TableColumn<Student, String> majorCol;
    @FXML
    private TableView<Student> studTable;

    private ArrayList<Student> studList = new ArrayList<>();

    @FXML
    public void initialize() {
        majorBox.getItems().addAll("CSE", "EEE", "BBA", "Math", "Physics");

        IdCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        majorCol.setCellValueFactory(new PropertyValueFactory<>("major"));
    }

    @FXML
    public void onAddButtonClick(ActionEvent actionEvent) {
        String studName = nameField.getText();
        String major = majorBox.getSelectionModel().getSelectedItem();
        int id = Integer.parseInt(IdField.getText());

        Student s = new Student(studName, major, id);

        studTable.getItems().add(s);
    }
}