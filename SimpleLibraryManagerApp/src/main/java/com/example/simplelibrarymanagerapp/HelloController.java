package com.example.simplelibrarymanagerapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class HelloController {

    @FXML
    private TextField idField;
    @FXML
    private TextField minPriceField;
    @FXML
    private TableColumn<Book, String> genreCol;
    @FXML
    private TextField nameField;
    @FXML
    private TableView<Book> bookTable;
    @FXML
    private ToggleGroup BookConditionGroup;
    @FXML
    private TableColumn<Book, Integer> priceCol;
    @FXML
    private ComboBox<String> genreBox;
    @FXML
    private ComboBox<String> searchGenreBox;
    @FXML
    private TableColumn<Book, Integer> idCol;
    @FXML
    private TextField priceField;
    @FXML
    private TableColumn<Book, String> conditionCol;
    @FXML
    private TextField maxPriceField;
    @FXML
    private TableColumn<Book, String> nameCol;

    private ArrayList<Book> bookArr = new ArrayList<>();

    @FXML
    public void initialize() {
        genreBox.getItems().addAll("Fiction", "Non-Fiction", "Science Fiction", "Drama", "Historical");
        searchGenreBox.getItems().addAll("Fiction", "Non-Fiction", "Science Fiction", "Drama", "Historical");

        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        genreCol.setCellValueFactory(new PropertyValueFactory<>("genre"));
        priceCol.setCellValueFactory(new PropertyValueFactory<>("price"));
        conditionCol.setCellValueFactory(new PropertyValueFactory<>("condition"));
    }

    @FXML
    public void onAddBookClick(ActionEvent actionEvent) {
        int id = Integer.parseInt(idField.getText());
        String name = nameField.getText();
        String genre = genreBox.getSelectionModel().getSelectedItem();
        int price = Integer.parseInt(priceField.getText());
        String condition = ((RadioButton) BookConditionGroup.getSelectedToggle()).getText();

        Book newBook = new Book(name, id, genre, price, condition);
        bookArr.add(newBook);
        System.out.println(bookArr);
    }

    @FXML
    public void onSearchButtonClick(ActionEvent actionEvent) {
        String searchGenre = searchGenreBox.getSelectionModel().getSelectedItem();
        int minPrice = Integer.parseInt(minPriceField.getText());
        int maxPrice = Integer.parseInt(maxPriceField.getText());

        ArrayList<Book> filteredList = new ArrayList<>();
        for (Book i:bookArr) {
            if ((i.getGenre().equals(searchGenre)) && (i.getPrice() >= minPrice) && (i.getPrice() <= maxPrice)) {
                filteredList.add(i);
            }
        }
        bookTable.getItems().clear();

        for (Book j:filteredList) {
            bookTable.getItems().add(j);
        }
    }
}