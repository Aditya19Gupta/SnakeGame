module com.adi.snakegame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.adi.snakegame to javafx.fxml;
    exports com.adi.snakegame;
}