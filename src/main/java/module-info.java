module com.bookmanagement1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.bookmanagement1 to javafx.fxml;
    exports com.bookmanagement1;
}