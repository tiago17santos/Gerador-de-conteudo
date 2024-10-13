module com.ic.geradordeconteudo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ic.geradordeconteudo to javafx.fxml;
    exports com.ic.geradordeconteudo;
}