module org.example.drawgraphics {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.drawgraphics to javafx.fxml;
    exports org.example.drawgraphics;
}