package com.employeemanagementsystem;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class AddEmployeeController {
    @javafx.fxml.FXML
    private TextField departmentField;
    @javafx.fxml.FXML
    private TextField positionField;
    @javafx.fxml.FXML
    private TextField nameField;

    ObservableList<Employee> EmployeeList = FXCollections.observableArrayList();

    public void setEmployeeList(ObservableList<Employee> employeeList) {
        EmployeeList = employeeList;
    }

    @javafx.fxml.FXML
    public void onAddButtonClick(ActionEvent actionEvent) {
        Employee newEmployee = new Employee(nameField.getText(), positionField.getText(), departmentField.getText());
        EmployeeList.add(newEmployee);
    }

    @javafx.fxml.FXML
    public void onBackButtonClick(ActionEvent actionEvent) throws IOException {
        AdminDashboardController adc = SceneSwitcher.switchScene("User1/AdminDashboard.fxml", actionEvent);
        adc.setEmployeeList(EmployeeList);
    }
}
