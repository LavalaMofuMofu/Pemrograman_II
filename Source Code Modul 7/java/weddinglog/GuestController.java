package weddinglog;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class GuestController {

    @FXML private TextField txtName;
    @FXML private TextField txtAddress;
    @FXML private ComboBox<String> cmbCategory;

    @FXML private TableView<Guest> table;
    @FXML private TableColumn<Guest, String> colName;
    @FXML private TableColumn<Guest, String> colAddress;
    @FXML private TableColumn<Guest, String> colCategory;

    private GuestService service = new GuestRepository();
    private ObservableList<Guest> observableGuests;

    @FXML
    public void initialize() {
        cmbCategory.setItems(FXCollections.observableArrayList(" - ", "Keluarga", "Teman", "Tetangga"));
        cmbCategory.getSelectionModel().selectFirst();

        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colCategory.setCellValueFactory(new PropertyValueFactory<>("category"));

        observableGuests = FXCollections.observableArrayList(service.getAllGuests());
        table.setItems(observableGuests);

        table.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal != null) {
                txtName.setText(newVal.getName());
                txtAddress.setText(newVal.getAddress());
                cmbCategory.setValue(newVal.getCategory());
            }
        });
    }

    @FXML
    private void handleAdd() {
        if (txtName.getText().isEmpty()) {
            showAlert("Nama harus diisi!");
            return;
        }

        Guest newGuest = new Guest(
                txtName.getText(),
                txtAddress.getText(),
                cmbCategory.getValue()
        );

        service.addGuest(newGuest);
        refreshTable();
        handleClear();
    }

    @FXML
    private void handleUpdate() {
        Guest selected = table.getSelectionModel().getSelectedItem();
        int index = table.getSelectionModel().getSelectedIndex();

        if (selected != null) {
            Guest updatedGuest = new Guest(
                    txtName.getText(),
                    txtAddress.getText(),
                    cmbCategory.getValue()
            );
            service.updateGuest(index, updatedGuest);
            refreshTable();
            handleClear();
        } else {
            showAlert("Pilih data dulu!");
        }
    }

    @FXML
    private void handleDelete() {
        Guest selected = table.getSelectionModel().getSelectedItem();
        if (selected != null) {
            service.deleteGuest(selected);
            refreshTable();
            handleClear();
        } else {
            showAlert("Pilih data yang ingin dihapus!");
        }
    }

    @FXML
    private void handleClear() {
        txtName.clear();
        txtAddress.clear();
        cmbCategory.getSelectionModel().selectFirst();
        table.getSelectionModel().clearSelection();
    }

    private void refreshTable() {
        observableGuests.setAll(service.getAllGuests());
    }

    private void showAlert(String msg) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(msg);
        alert.show();
    }
}