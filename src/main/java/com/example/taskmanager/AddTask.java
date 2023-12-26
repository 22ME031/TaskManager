package com.example.taskmanager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.*;

public class AddTask {

    @FXML
    private Button backbtn;

    public void back(ActionEvent event) throws IOException {
//        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Hello-view.fxml")));
//        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        Scene scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
    }

    @FXML
    private TextField taskName;

    @FXML
    private TextArea taskDes;

    @FXML
    private TextField taskEndTime;

    @FXML
    private Button add;


//    public List<String> tasks = new ArrayList<>();

    public void addTask(ActionEvent event) throws IOException, CloneNotSupportedException {
        String name = taskName.getText();
        String des = taskDes.getText();
        String endTime = taskEndTime.getText();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        Parent root = loader.load();

        HelloController hc = loader.getController();



        Tasks ts = new Tasks();
        ts.t.add(name);
        hc.displayName(ts.t);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

}