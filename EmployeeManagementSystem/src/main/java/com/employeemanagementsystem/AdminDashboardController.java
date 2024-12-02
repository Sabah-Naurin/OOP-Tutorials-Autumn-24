package com.employeemanagementsystem;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminDashboardController {
    private ObservableList<Employee> EmployeeList = FXCollections.observableArrayList();

    public void setEmployeeList(ObservableList<Employee> employeeList) {
        EmployeeList = employeeList;
    }

    @javafx.fxml.FXML
    public void onAddButtonClick(ActionEvent actionEvent) throws IOException {
        AddEmployeeController aec = SceneSwitcher.switchScene("User1/Goal1/AddEmployee-view.fxml", actionEvent, "Employee Add Window");
        aec.setEmployeeList(EmployeeList);
    }

    @javafx.fxml.FXML
    public void onViewDatabaseButtonClick(ActionEvent actionEvent) throws IOException {
        EmployeeDatabaseController edc = SceneSwitcher.switchScene("User1/Goal2/EmployeeDatabase-view.fxml", actionEvent, "View Employee Database");
        edc.setEmployeeList(EmployeeList);
    }
}
