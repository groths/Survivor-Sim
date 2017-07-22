package main;


import static com.googlecode.lanterna.gui2.Panels.grid;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rachel
 */
public class SurvivorStage extends Stage{
    
    public SurvivorStage(){
        
    }
    {GridPane grid = new GridPane();
    
        grid.setGridLinesVisible(true);
        RowConstraints top = new RowConstraints();
        top.setPercentHeight(50);
        RowConstraints bottom = new RowConstraints();
        bottom.setPercentHeight(50);
        grid.getRowConstraints().addAll(top, bottom);
        ColumnConstraints left = new ColumnConstraints();
        left.setPercentWidth(50);
        ColumnConstraints right = new ColumnConstraints();
        right.setPercentWidth(50);
        grid.getColumnConstraints().addAll(left, right);
        Label label = new Label("hi my name is label");
        grid.add(label, 0, 0);
        Button button = new Button("button shmutton");
        grid.add(button, 0, 1);
        TextField textField = new TextField();
        grid.add(textField, 1, 0);
        Rectangle rectangle = new Rectangle(10, 20);
        grid.add(rectangle, 1, 1);
        button.setOnAction((e)->
        {
           label.setText(textField.getText());
        });
//        
           
        
        Scene scene = new Scene(grid);
        setScene(scene);
        
        
        centerOnScreen();
    }
}
