package com.employeemanagementsystem;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class EmployeeDatabaseController {
    @javafx.fxml.FXML
    private TableColumn<Employee,String> deptCol;
    @javafx.fxml.FXML
    private TableView<Employee> employeeTable;
    @javafx.fxml.FXML
    private TableColumn<Employee,String> nameCol;
    @javafx.fxml.FXML
    private TableColumn<Employee,String> posCol;

    private ObservableList<Employee> EmployeeList = FXCollections.observableArrayList();

    public void setEmployeeList(ObservableList<Employee> employeeList) {
        EmployeeList = employeeList;
        employeeTable.setItems(EmployeeList);
    }

    @FXML
    public void initialize() {
        deptCol.setCellValueFactory(new PropertyValueFactory<>("department"));
        posCol.setCellValueFactory(new PropertyValueFactory<>("position"));
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
    }
    @javafx.fxml.FXML
    public void onGoBackButtonClick(ActionEvent actionEvent) throws IOException {
        AdminDashboardController adc = SceneSwitcher.switchScene("User1/AdminDashboard.fxml", actionEvent);
        adc.setEmployeeList(EmployeeList);
    }

    @javafx.fxml.FXML
    public void onEditButtonClick(ActionEvent actionEvent) throws IOException {
        editEmployeeDetailsController eedc = SceneSwitcher.switchSceneNewStage("User1/Goal 3/editEmployeeDetails-view.fxml");
        eedc.setEmployeeList(EmployeeList);
        eedc.setEmp(this);
    }

    public void refreshTable() {
        employeeTable.refresh();
    }
}
