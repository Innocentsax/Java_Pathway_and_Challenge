module com.example.javafx_project {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx_project to javafx.fxml;
    exports com.example.javafx_project;
}