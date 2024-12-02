package com.employeemanagementsystem;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.io.IOException;

public class editEmployeeDetailsController {
    @javafx.fxml.FXML
    private TextField departmentField;
    @javafx.fxml.FXML
    private ComboBox<Employee> editEmployeeBox;
    @javafx.fxml.FXML
    private TextField positionField;
    @javafx.fxml.FXML
    private TextField nameField;
    private ObservableList<Employee> EmployeeList = FXCollections.observableArrayList();

    private EmployeeDatabaseController emp;

    public void setEmployeeList(ObservableList<Employee> employeeList) {
        EmployeeList = employeeList;
        editEmployeeBox.setItems(EmployeeList);
    }

    public void setEmp(EmployeeDatabaseController emp) {
        this.emp = emp;
    }

    @javafx.fxml.FXML
    public void onGoButtonClick(ActionEvent actionEvent){
        Employee selectedEmployee = editEmployeeBox.getValue();
        nameField.setText(selectedEmployee.getName());
        positionField.setText(selectedEmployee.getPosition());
        departmentField.setText(selectedEmployee.getDepartment());
    }

    @javafx.fxml.FXML
    public void onConfirmButtonClick(ActionEvent actionEvent){
        int index = EmployeeList.indexOf(editEmployeeBox.getValue());
        Employee toChange = EmployeeList.get(index);
        toChange.setName(nameField.getText());
        toChange.setDepartment(departmentField.getText());
        toChange.setPosition(positionField.getText());

        emp.setEmployeeList(EmployeeList);
        emp.refreshTable();

    }
}
