package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.util.Stack;

public class Controller
{
    private Stack<String> stack = new Stack<String>();

    StringBuilder sb1 = new StringBuilder();                                        //StringBuilder for the TextField
    


    @FXML private Button btn0;
    @FXML private Button btn1;
    @FXML private Button btn2;
    @FXML private Button btn3;
    @FXML private Button btn4;
    @FXML private Button btn5;
    @FXML private Button btn6;
    @FXML private Button btn7;
    @FXML private Button btn8;
    @FXML private Button btn9;

    @FXML private Button btnComma;
    @FXML private Button btnPlus_Minus;
    @FXML private Button btnEnter;
    @FXML private Button btnClear;
    @FXML private Button btnClearEntry;
    @FXML private Button btnPlus;
    @FXML private Button btnMinus;
    @FXML private Button btnMultiply;
    @FXML private Button btnDivide;
    @FXML private Button btnReciprocal;
    @FXML private Button btnChange;

    @FXML private TextField TextF_I_O;
    @FXML private TextField TF_Error;

    @FXML private TextArea TextArea;


    public void inputNumbers()
    {
        if (btn0.isHover())
        {
            sb1.append(0);
            TextF_I_O.setText(sb1.toString());
        } else if (btn1.isHover())
        {
            sb1.append(1);
            TextF_I_O.setText(sb1.toString());
        } else if (btn2.isHover())
        {
            sb1.append(2);
            TextF_I_O.setText(sb1.toString());
        } else if (btn3.isHover())
        {
            sb1.append(3);
            TextF_I_O.setText(sb1.toString());
        } else if (btn4.isHover())
        {
            sb1.append(4);
            TextF_I_O.setText(sb1.toString());
        } else if (btn5.isHover())
        {
            sb1.append(5);
            TextF_I_O.setText(sb1.toString());
        } else if (btn6.isHover())
        {
            sb1.append(6);
            TextF_I_O.setText(sb1.toString());
        } else if (btn7.isHover())
        {
            sb1.append(7);
            TextF_I_O.setText(sb1.toString());
        } else if (btn8.isHover())
        {
            sb1.append(8);
            TextF_I_O.setText(sb1.toString());
        } else if (btn9.isHover())
        {
            sb1.append(9);
            TextF_I_O.setText(sb1.toString());
        }
        else if(btnComma.isHover())
        {
            sb1.append(".");
            TextF_I_O.setText(sb1.toString());
        }
        else if(btnPlus_Minus.isHover())
        {
            sb1.append("-");
            TextF_I_O.setText(sb1.toString());
        }
    }

}