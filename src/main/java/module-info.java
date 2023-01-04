module com.example.latihan2_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.latihan2_javafx to javafx.fxml;
    exports com.example.latihan2_javafx;
}