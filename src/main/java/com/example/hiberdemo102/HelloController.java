package com.example.hiberdemo102;

import dao.SiswaDAO;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.SiswaEntity;

public class HelloController {

    @FXML
    TableView<SiswaEntity> table1;

    ObservableList<SiswaEntity> slist;

    public void initialize() {
        SiswaDAO dao = new SiswaDAO();

        slist = dao.getData();
        table1.setItems(slist);

        TableColumn col1 = new TableColumn();
        col1.setText("id");
        col1.setCellValueFactory(new PropertyValueFactory("id"));

        table1.getColumns().add(col1);

    }
}