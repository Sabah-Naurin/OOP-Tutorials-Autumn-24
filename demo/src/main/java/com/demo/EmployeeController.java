package com.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class EmployeeController {

    @FXML
    private TextField idField;
    @FXML
    private DatePicker dojPicker;
    @FXML
    private TableColumn<Employee, Integer> salaryCol;
    @FXML
    private ComboBox<String> desigBox;
    @FXML
    private ComboBox<Employee> idBox;
    @FXML
    private TextField minSalaryField;
    @FXML
    private ToggleGroup genderGroup;
    @FXML
    private TextField nameField;
    @FXML
    private TableView<Employee> empTable;
    @FXML
    private TableColumn<Employee, Integer> empIdCol;
    @FXML
    private TableColumn<Employee, String> deptCol;
    @FXML
    private TableColumn<Employee, LocalDate> dojCol;
    @FXML
    private TableColumn<Employee, String> namecol;
    @FXML
    private TextField salaryField;

    private ArrayList<Employee> empList = new ArrayList<>();

    @FXML
    public void initialize() {
        desigBox.getItems().addAll("Manager", "CEO", "HR Officer", "IT Officer");

        empIdCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        namecol.setCellValueFactory(new PropertyValueFactory<>("name"));
        salaryCol.setCellValueFactory(new PropertyValueFactory<>("salary"));
        deptCol.setCellValueFactory(new PropertyValueFactory<>("designation"));
        dojCol.setCellValueFactory(new PropertyValueFactory<>("doj"));
    }

    @FXML
    public void onShowDetailsButtonClick(ActionEvent actionEvent) {
        if (idBox.getSelectionModel().getSelectedItem() == null) {
            return;
        }

        Employee e = idBox.getSelectionModel().getSelectedItem();
        Alert employeeInformation  = new Alert(Alert.AlertType.INFORMATION);
        String content = "Employee Name: " + e.getName() + " Employee ID: " + e.getId();
        employeeInformation.setContentText(content);

        employeeInformation.show();
    }

    @FXML
    public void loadTableButtonClick(ActionEvent actionEvent) {
        int minSalary = Integer.parseInt(minSalaryField.getText());

        ArrayList<Employee> filterList = new ArrayList<>();

        empTable.getItems().clear();
        for (Employee i: empList) {
            if (i.getSalary() >= minSalary) {
                filterList.add(i);
            }
        }

        for (Employee i: filterList) {
            empTable.getItems().add(i);
        }
    }

    @FXML
    public void onAddEmployeeButtonClick(ActionEvent actionEvent) {
        int id;
        if (!idField.getText().isEmpty()) {
            id = Integer.parseInt(idField.getText());

            for (Employee i:empList) {
                if (i.getId() == id) {
                    return;
                }
            }
        } else {
            return;
        }

        String name;
        if (!nameField.getText().isEmpty()) {
            name = nameField.getText();
        } else {
            return;
        }

        String designation;
        if (!desigBox.getSelectionModel().getSelectedItem().isEmpty()) {
            designation = desigBox.getSelectionModel().getSelectedItem();
        } else { return; }

        int salary;
        if (!salaryField.getText().isEmpty()) {
            salary = Integer.parseInt(salaryField.getText());

            if (salary <= 0) {
                return;
            }

        } else {
            return;
        }
        LocalDate doj;
        if (!(dojPicker.getValue() == null)) {
            doj = dojPicker.getValue();

            if (doj.isAfter(LocalDate.now())) {
                return;
            }

        } else { return; }

        // Type-casting
        RadioButton genderButton = (RadioButton) genderGroup.getSelectedToggle();
        String gender;
        if (!(genderButton == null)) {
            gender = genderButton.getText();
        } else {
            return;
        }

        Employee temp = new Employee(id, name, designation, salary, doj, gender);
        empList.add(temp);

        idBox.getItems().add(temp);
    }
}