module com.example.studentrecordsystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.studentrecordsystem to javafx.fxml;
    exports com.example.studentrecordsystem;
}