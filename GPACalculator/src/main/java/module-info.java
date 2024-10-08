module com.gpacalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.gpacalculator to javafx.fxml;
    exports com.gpacalculator;
}