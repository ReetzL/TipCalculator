module com.mycompany.tipcalculatorapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.tipcalculatorapp to javafx.fxml;
    exports com.mycompany.tipcalculatorapp;
}
