module com.studentregistrationsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.studentregistrationsystem to javafx.fxml;
    exports com.studentregistrationsystem;
}