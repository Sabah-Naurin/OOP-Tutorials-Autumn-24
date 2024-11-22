package com.studentregistrationsystem;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class StudentDirectoryController
{
    @javafx.fxml.FXML
    private TableColumn<Student, String> idCol;
    @javafx.fxml.FXML
    private TableColumn<Student, String> nameCol;
    @javafx.fxml.FXML
    private TableColumn<Student, String> majorCol;
    @javafx.fxml.FXML
    private TableView<Student> studTable;

    private ObservableList<Student> studList;

    public void setStudList(ObservableList<Student> studList) {
        this.studList = studList;
        studTable.setItems(studList);
    }

    @javafx.fxml.FXML
    public void initialize() {
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        majorCol.setCellValueFactory(new PropertyValueFactory<>("major"));
    }

    @javafx.fxml.FXML
    public void onReturnButtonClick(ActionEvent actionEvent) throws IOException {
        HelloController hc = SceneSwitcher.switchScene(actionEvent, "hello-view.fxml", "Entry Creation");
        hc.setStudList(studList);
    }
}