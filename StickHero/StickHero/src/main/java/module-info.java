module test.stickzero {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens test.stickzero to javafx.fxml;
    exports test.stickzero;
}