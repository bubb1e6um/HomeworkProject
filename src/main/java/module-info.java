module com.example.homework {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.poi.ooxml;


    opens com.example.homework to javafx.fxml;
    exports com.example.homework;
}