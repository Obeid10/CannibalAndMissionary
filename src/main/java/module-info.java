module com.example.ai_proj {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.ai_proj to javafx.fxml;
    exports com.example.ai_proj;
}