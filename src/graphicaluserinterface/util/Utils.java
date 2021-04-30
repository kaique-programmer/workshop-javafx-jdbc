package graphicaluserinterface.util;

import javafx.scene.Node;
import javafx.stage.Stage;

import javafx.event.ActionEvent;

public class Utils {
    public static Stage currentStage(ActionEvent event) {
        return (Stage) ((Node) event.getSource()).getScene().getWindow();
    }
}
