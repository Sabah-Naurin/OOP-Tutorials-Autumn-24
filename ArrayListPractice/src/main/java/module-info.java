module com.example.arraylistpractice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.arraylistpractice to javafx.fxml;
    exports com.example.arraylistpractice;
}