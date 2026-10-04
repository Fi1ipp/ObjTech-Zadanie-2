package com.example.zadanie2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML private Label mg,g,kg,t;
    @FXML private TextField tf;

    @FXML
    protected void Convert() {
        double lb;
        if (tf.getText().isEmpty()) {
            lb = 1;
        } else {
            lb = Double.parseDouble(tf.getText());
        }
        double k = lb * 0.45359237;

        kg.setText(String.valueOf((double)(int)(k*100)/100)+"kg   ");
        g.setText(String.valueOf((double)((int)((k*1000)*100))/100)+"g   ");
        mg.setText(String.valueOf((double)((int)((k*1000000)*100))/100)+"mg   ");
        t.setText(String.valueOf(((k/1000)))+"t   ");

    }
}
