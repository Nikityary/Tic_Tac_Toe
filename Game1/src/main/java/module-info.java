module com.example.game1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.game1 to javafx.fxml;
    exports com.example.game1;
}