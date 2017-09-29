package sample;

import javafx.fxml.FXML;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

import java.util.ArrayList;

public class Controller {
    @FXML
    private GridPane mainGrid;
    private ArrayList<Line> lineList = new ArrayList<>();
    private int listCount = 0;
    private Line line;

    public void initialize(){
        
        lineList.add(new Line(5,50, 7,50));
        mainGrid.getChildren().add(lineList.get(listCount));

        mainGrid.setMinHeight(500);
        mainGrid.setMinWidth(700);

        mainGrid.setOnKeyPressed((event -> {
            line = lineList.get(listCount);
            if(event.getCode() == KeyCode.RIGHT){
                if(line.getEndY() == line.getStartY()){
                    line.setEndX(line.getEndX()+2);
                }
            }
            else if(event.getCode() == KeyCode.LEFT){
                if(line.getEndY() == line.getStartY() && line.getEndX() > 0){
                    line.setEndX(line.getEndX()-2);
                }
            }
            else if(event.getCode() == KeyCode.UP){
                if(line.getEndY() == line.getStartY()){
                    lineList.add(new Line(line.getEndX(),line.getEndY(),line.getEndX(),line.getEndY()+2));
                    listCount++;
                    mainGrid.getChildren().add(lineList.get(listCount));
                }
                else {
                    line.setEndY(line.getEndY()+2);
                }
            }





            System.out.println(line.getEndY()+" & "+line.getStartY());
        }));


        mainGrid.requestFocus();


    }
}
