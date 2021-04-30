package gui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.Department;
import models.services.DepartmentService;
import sample.Main;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class DepartmentListController implements Initializable {
    private DepartmentService departmentService;

    @FXML
    private TableView<Department> departmentTableView;

    @FXML
    private TableColumn<Department, Integer> tableColumnId;

    @FXML
    private TableColumn<Department, String> tableColumnName;

    @FXML
    private Button buttonNew;

    private ObservableList<Department> observableList;

    @FXML
    public void onButtonNewAction() {
        System.out.println("onButtonNewAction");
    }

    public void setDepartmentService(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initializeNodes();
    }

    private void initializeNodes() {
        tableColumnId.setCellValueFactory(new PropertyValueFactory<>("id"));
        tableColumnName.setCellValueFactory(new PropertyValueFactory<>("name"));

        Stage stage = (Stage) Main.getMainScene().getWindow();
        departmentTableView.prefHeightProperty().bind(stage.heightProperty());
    }

    public void updateTableView() {
        if (departmentService == null) {
            throw new IllegalStateException("Service was null");
        }
        List<Department> list = departmentService.findAll();
        observableList = FXCollections.observableArrayList(list);
        departmentTableView.setItems(observableList);
    }
}
