package sample;

import javafx.fxml.FXML;

import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;



public class Controller {
    @FXML
    private Button btnadd;
    @FXML
    private Button btnsub;
    @FXML
    private Button btndiv;
    @FXML
    private Button btntimes;
    @FXML
    private Button btnclr;

    @FXML
    private TextField txt1;
    @FXML
    private TextField txt2;
    @FXML
    private Label lbl;
    int num1, num2, answer;
    char symbol;

    @FXML
    private void handleButtonAction(ActionEvent e){
        int num1, num2, answer=0;
        char symbol = '+';
     //e tells what button was clicked
     if(e.getSource()==btnclr){
         txt1.setText(" ");
         txt2.setText(" ");
         lbl.setText(" ");
         txt1.requestFocus();
         return;
        }
     //read numbers in from Textfields
     num1=Integer.parseInt(txt1.getText());
     num2=Integer.parseInt(txt2.getText());
        if(e.getSource()==btnadd)
        {
            symbol='+';
            answer=num1+num2;
        }
        else if(e.getSource()==btnsub)
        {
            symbol='-';
            answer=num1-num2;
        }
        else if(e.getSource()==btntimes)
        {
            symbol='x';
            answer=num1*num2;
        }
        else if (e.getSource()==btndiv)
        {
            symbol='/';
            answer=num1/num2;
        }
        //display answer
            if (answer==420){
                lbl.setText("AYYY LMAO");
            }else if (answer==69) {
                lbl.setText("Its a sex thing");
            }else{
            lbl.setText("" + num1 + symbol + num2 + "=" + answer);
            }
    }



}


