package graphicaluserinterface.util;

import javafx.scene.Node;
import javafx.stage.Stage;

import javafx.event.ActionEvent;

public class Utils {
    public static Stage currentStage(ActionEvent event) {
        return (Stage) ((Node) event.getSource()).getScene().getWindow();
    }

    public static Integer tryParseToInt(String string) {
        try {
            return Integer.parseInt(string);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
