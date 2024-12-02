module com.employeemanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.employeemanagementsystem to javafx.fxml;
    exports com.employeemanagementsystem;
}