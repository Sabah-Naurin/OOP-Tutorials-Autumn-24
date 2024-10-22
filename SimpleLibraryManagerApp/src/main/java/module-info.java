module com.example.simplelibrarymanagerapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.simplelibrarymanagerapp to javafx.fxml;
    exports com.example.simplelibrarymanagerapp;
}