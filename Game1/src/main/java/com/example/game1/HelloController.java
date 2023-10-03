package com.example.game1;

import javafx.css.Style;
import javafx.css.StyleClass;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

import java.util.Objects;

public class HelloController {

    boolean step = true;

    @FXML
    private Pane p1;
    @FXML
    private Pane p2;
    @FXML
    private Pane p3;
    @FXML
    private Pane p4;
    @FXML
    private Pane p5;
    @FXML
    private Pane p6;
    @FXML
    private Pane p7;
    @FXML
    private Pane p8;
    @FXML
    private Pane p9;
    @FXML
    private Label l1;
    @FXML
    private Button Button1;
    @FXML
    private Circle c1;
    @FXML
    private Circle c2;
    @FXML
    private Circle c3;
    @FXML
    private Circle c4;
    @FXML
    private Circle c5;
    @FXML
    private Circle c6;
    @FXML
    private Circle c7;
    @FXML
    private Circle c8;
    @FXML
    private Circle c9;
    @FXML
    private Line l11;
    @FXML
    private Line l12;
    @FXML
    private Line l21;
    @FXML
    private Line l22;
    @FXML
    private Line l31;
    @FXML
    private Line l32;
    @FXML
    private Line l41;
    @FXML
    private Line l42;
    @FXML
    private Line l51;
    @FXML
    private Line l52;
    @FXML
    private Line l61;
    @FXML
    private Line l62;
    @FXML
    private Line l71;
    @FXML
    private Line l72;
    @FXML
    private Line l81;
    @FXML
    private Line l82;
    @FXML
    private Line l91;
    @FXML
    private Line l92;
    @FXML
    private Line w1;
    @FXML
    private Line w2;
    @FXML
    private Line w3;
    @FXML
    private Line w4;
    @FXML
    private Line w5;
    @FXML
    private Line w6;
    @FXML
    private Line w7;
    @FXML
    private Line w8;

    @FXML
    private void press1(){
        setColor(1);
        winCheck();
    }
    @FXML
    private void press2(){
        setColor(2);
        winCheck();
    }
    @FXML
    private void press3(){
        setColor(3);
        winCheck();
    }
    @FXML
    private void press4(){
        setColor(4);
        winCheck();
    }
    @FXML
    private void press5(){
        setColor(5);
        winCheck();
    }
    @FXML
    private void press6(){
        setColor(6);
        winCheck();
    }
    @FXML
    private void press7(){
        setColor(7);
        winCheck();
    }
    @FXML
    private void press8(){
        setColor(8);
        winCheck();
    }
    @FXML
    private void press9(){
        setColor(9);
        winCheck();
    }

    @FXML
    private void ButtonClick(){
        l1.setText("");
        p1.setStyle("-fx-background-color: #FFFFFF;");
        p2.setStyle("-fx-background-color: #FFFFFF;");
        p3.setStyle("-fx-background-color: #FFFFFF;");
        p4.setStyle("-fx-background-color: #FFFFFF;");
        p5.setStyle("-fx-background-color: #FFFFFF;");
        p6.setStyle("-fx-background-color: #FFFFFF;");
        p7.setStyle("-fx-background-color: #FFFFFF;");
        p8.setStyle("-fx-background-color: #FFFFFF;");
        p9.setStyle("-fx-background-color: #FFFFFF;");
        w1.setVisible(false);
        w2.setVisible(false);
        w3.setVisible(false);
        w4.setVisible(false);
        w5.setVisible(false);
        w6.setVisible(false);
        w7.setVisible(false);
        w8.setVisible(false);
        c1.setVisible(false);
        c2.setVisible(false);
        c3.setVisible(false);
        c4.setVisible(false);
        c5.setVisible(false);
        c6.setVisible(false);
        c7.setVisible(false);
        c8.setVisible(false);
        c9.setVisible(false);
        l11.setVisible(false);
        l12.setVisible(false);
        l21.setVisible(false);
        l22.setVisible(false);
        l31.setVisible(false);
        l32.setVisible(false);
        l41.setVisible(false);
        l42.setVisible(false);
        l51.setVisible(false);
        l52.setVisible(false);
        l61.setVisible(false);
        l62.setVisible(false);
        l71.setVisible(false);
        l72.setVisible(false);
        l81.setVisible(false);
        l82.setVisible(false);
        l91.setVisible(false);
        l92.setVisible(false);
    }
    private void winCheck(){
        if (c1.isVisible()&&c5.isVisible()&&c9.isVisible()){win(); l1.setText("Circle win"); w1.setVisible(true);}
        if (c3.isVisible()&&c5.isVisible()&&c7.isVisible()){win(); l1.setText("Circle win"); w2.setVisible(true);}
        if (c1.isVisible()&&c2.isVisible()&&c3.isVisible()){win(); l1.setText("Circle win"); w6.setVisible(true);}
        if (c4.isVisible()&&c5.isVisible()&&c6.isVisible()){win(); l1.setText("Circle win"); w7.setVisible(true);}
        if (c7.isVisible()&&c8.isVisible()&&c9.isVisible()){win(); l1.setText("Circle win"); w8.setVisible(true);}
        if (c1.isVisible()&&c4.isVisible()&&c7.isVisible()){win(); l1.setText("Circle win"); w3.setVisible(true);}
        if (c2.isVisible()&&c5.isVisible()&&c8.isVisible()){win(); l1.setText("Circle win"); w4.setVisible(true);}
        if (c3.isVisible()&&c6.isVisible()&&c9.isVisible()){win(); l1.setText("Circle win"); w5.setVisible(true);}

        if (l11.isVisible()&&l51.isVisible()&&l91.isVisible()){win(); l1.setText("Cross win"); w1.setVisible(true);}
        if (l31.isVisible()&&l51.isVisible()&&l71.isVisible()){win(); l1.setText("Cross win"); w2.setVisible(true);}
        if (l11.isVisible()&&l21.isVisible()&&l31.isVisible()){win(); l1.setText("Cross win"); w6.setVisible(true);}
        if (l41.isVisible()&&l51.isVisible()&&l61.isVisible()){win(); l1.setText("Cross win"); w7.setVisible(true);}
        if (l71.isVisible()&&l81.isVisible()&&l91.isVisible()){win(); l1.setText("Cross win"); w8.setVisible(true);}
        if (l11.isVisible()&&l41.isVisible()&&l71.isVisible()){win(); l1.setText("Cross win"); w3.setVisible(true);}
        if (l21.isVisible()&&l51.isVisible()&&l81.isVisible()){win(); l1.setText("Cross win"); w4.setVisible(true);}
        if (l31.isVisible()&&l61.isVisible()&&l91.isVisible()){win(); l1.setText("Cross win"); w5.setVisible(true);}
    }
    private void win(){
        p1.setStyle("-fx-background-color: #FFFFFE;");
        p2.setStyle("-fx-background-color: #FFFFFE;");
        p3.setStyle("-fx-background-color: #FFFFFE;");
        p4.setStyle("-fx-background-color: #FFFFFE;");
        p5.setStyle("-fx-background-color: #FFFFFE;");
        p6.setStyle("-fx-background-color: #FFFFFE;");
        p7.setStyle("-fx-background-color: #FFFFFE;");
        p8.setStyle("-fx-background-color: #FFFFFE;");
        p9.setStyle("-fx-background-color: #FFFFFE;");
    }
    private void setColor(int pan){

        switch (pan){
            case 1:
                if (Objects.equals(p1.getStyle(), "-fx-background-color: #FFFFFF;")){ //#FFFFFE
                if (step){
                    p1.setStyle("-fx-background-color: #FFFFFE;");
                    l1.setText("Cross turn");
                    c1.setVisible(true);
                    step = false;
            }
                else {
                    p1.setStyle("-fx-background-color: #FFFFFE;");
                    l1.setText("Circle turn");
                    l11.setVisible(true);
                    l12.setVisible(true);
                    step = true;
                }}
                break;
            case 2:
                if (Objects.equals(p2.getStyle(), "-fx-background-color: #FFFFFF;")){
                if (step){
                    p2.setStyle("-fx-background-color: #FFFFFE;");
                    l1.setText("Cross turn");
                    c2.setVisible(true);
                    step = false;
                }
                else {
                    p2.setStyle("-fx-background-color: #FFFFFE;");
                    l1.setText("Circle turn");
                    l21.setVisible(true);
                    l22.setVisible(true);
                    step = true;
                }}
                break;
            case 3:
                if (Objects.equals(p3.getStyle(), "-fx-background-color: #FFFFFF;")){
                if (step){
                    p3.setStyle("-fx-background-color: #FFFFFE;");
                    l1.setText("Cross turn");
                    c3.setVisible(true);
                    step = false;
                }
                else {
                    p3.setStyle("-fx-background-color: #FFFFFE;");
                    l1.setText("Circle turn");
                    l31.setVisible(true);
                    l32.setVisible(true);
                    step = true;
                }}
                break;
            case 4:
                if (Objects.equals(p4.getStyle(), "-fx-background-color: #FFFFFF;")){
                if (step){
                    p4.setStyle("-fx-background-color: #FFFFFE;");
                    l1.setText("Cross turn");
                    c4.setVisible(true);
                    step = false;
                }
                else {
                    p4.setStyle("-fx-background-color: #FFFFFE;");
                    l1.setText("Circle turn");
                    l41.setVisible(true);
                    l42.setVisible(true);
                    step = true;
                }}
                break;
            case 5:
                if (Objects.equals(p5.getStyle(), "-fx-background-color: #FFFFFF;")){
                if (step){
                    p5.setStyle("-fx-background-color: #FFFFFE;");
                    l1.setText("Cross turn");
                    c5.setVisible(true);
                    step = false;
                }
                else {
                    p5.setStyle("-fx-background-color: #FFFFFE;");
                    l1.setText("Circle turn");
                    l51.setVisible(true);
                    l52.setVisible(true);
                    step = true;
                }}
                break;
            case 6:
                if (Objects.equals(p6.getStyle(), "-fx-background-color: #FFFFFF;")){
                if (step){
                    p6.setStyle("-fx-background-color: #FFFFFE;");
                    l1.setText("Cross turn");
                    c6.setVisible(true);
                    step = false;
                }
                else {
                    p6.setStyle("-fx-background-color: #FFFFFE;");
                    l1.setText("Circle turn");
                    l61.setVisible(true);
                    l62.setVisible(true);
                    step = true;
                }}
                break;
            case 7:
                if (Objects.equals(p7.getStyle(), "-fx-background-color: #FFFFFF;")){
                if (step){
                    p7.setStyle("-fx-background-color: #FFFFFE;");
                    l1.setText("Cross turn");
                    c7.setVisible(true);
                    step = false;
                }
                else {
                    p7.setStyle("-fx-background-color: #FFFFFE;");
                    l1.setText("Circle turn");
                    l71.setVisible(true);
                    l72.setVisible(true);
                    step = true;
                }}
                break;
            case 8:
                if (Objects.equals(p8.getStyle(), "-fx-background-color: #FFFFFF;")){
                if (step){
                    p8.setStyle("-fx-background-color: #FFFFFE;");
                    l1.setText("Cross turn");
                    c8.setVisible(true);
                    step = false;
                }
                else {
                    p8.setStyle("-fx-background-color: #FFFFFE;");
                    l1.setText("Circle turn");
                    l81.setVisible(true);
                    l82.setVisible(true);
                    step = true;
                }}
                break;
            case 9:
                if (Objects.equals(p9.getStyle(), "-fx-background-color: #FFFFFF;")){
                if (step){
                    p9.setStyle("-fx-background-color: #FFFFFE;");
                    l1.setText("Cross turn");
                    c9.setVisible(true);
                    step = false;
                }
                else {
                    p9.setStyle("-fx-background-color: #FFFFFE;");
                    l1.setText("Circle turn");
                    l91.setVisible(true);
                    l92.setVisible(true);
                    step = true;
                }}
                break;
        }
    }
}