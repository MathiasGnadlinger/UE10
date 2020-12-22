package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.util.Stack;
/**
 * @author Mathias Gnadlinger
 * @version 10, 22.12.2020
 */
public class Controller
{
    private Stack<String> stack = new Stack<String>();

    StringBuilder sbTF = new StringBuilder();                                        //StringBuilder für das TextField
    StringBuilder sbTA = new StringBuilder();                                        //StringBuilder für das TextArea


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


    public void inputNumbers()                                  //Hier werden die Nummern und das Vorzeichen und Komma ausgelesen
    {
        if (btn0.isHover())
        {
            sbTF.append(0);                                     //Um StringBuilder zu sagen das er den Wert xy ausgeben soll
            TextF_I_O.setText(sbTF.toString());                 //Ausgabe in das Textfeld
        } else if (btn1.isHover())
        {
            sbTF.append(1);
            TextF_I_O.setText(sbTF.toString());
        } else if (btn2.isHover())
        {
            sbTF.append(2);
            TextF_I_O.setText(sbTF.toString());
        } else if (btn3.isHover())
        {
            sbTF.append(3);
            TextF_I_O.setText(sbTF.toString());
        } else if (btn4.isHover())
        {
            sbTF.append(4);
            TextF_I_O.setText(sbTF.toString());
        } else if (btn5.isHover())
        {
            sbTF.append(5);
            TextF_I_O.setText(sbTF.toString());
        } else if (btn6.isHover())
        {
            sbTF.append(6);
            TextF_I_O.setText(sbTF.toString());
        } else if (btn7.isHover())
        {
            sbTF.append(7);
            TextF_I_O.setText(sbTF.toString());
        } else if (btn8.isHover())
        {
            sbTF.append(8);
            TextF_I_O.setText(sbTF.toString());
        } else if (btn9.isHover())
        {
            sbTF.append(9);
            TextF_I_O.setText(sbTF.toString());
        }
        else if(btnComma.isHover())
        {
            sbTF.append(".");
            TextF_I_O.setText(sbTF.toString());
        }
        else if(btnPlus_Minus.isHover())
        {
            sbTF.append("-");
            TextF_I_O.setText(sbTF.toString());
        }
    }


    public void enter()                                             //Wert wird in den Stack geladen und anschließend in TextArea ausgegeben, auch wird die Eingabe von dem TextField gelöscht.
    {
        if (btnEnter.isHover())
        {
            stack.push(sbTF.toString());
            sbTA.append(String.format("%s \n", sbTF));
            TextArea.setText(sbTA.toString());

            TextF_I_O.clear();
            sbTF.delete(0, sbTF.length());                          //Der WErt muss noch extra gelöscht werden da sonst mit dem Wert der im StringBuilder hinterlegt ist weitergeschrieben wird
        }
    }

    public void clear_C()
    {
        if (btnClear.isHover())
        {
            stack.clear();
            TextArea.clear();
            TextF_I_O.clear();
            sbTF.delete(0, sbTF.length());
            sbTA.delete(0, sbTA.length());
        }
    }

    public void clear_CE()
    {
        if (btnClearEntry.isHover())
        {
            TextF_I_O.clear();
            sbTF.delete(0, sbTF.length());
        }
    }

    public void plus()
    {
        if (btnPlus.isHover())
        {
            try {
                double Output1 = Double.parseDouble(stack.pop());   //Wert wird ausgelesen
                double Output2 = Double.parseDouble(stack.pop());

                double sum = Output2 + Output1;                     //Lösung wird berechnet
                stack.push(String.valueOf(sum));                    //Wert wird wieder in den Stack geladen und anschließend wieder ausgegeben
                TextArea.setText(String.valueOf(sum));
            } catch (Exception e)
            {
                TF_Error.setText("Geben Sie mehr Werte ein!");
            }
        }
    }

    public void minus()
    {
        if (btnMinus.isHover())
        {
            try {
                double Output1 = Double.parseDouble(stack.pop());
                double Output2 = Double.parseDouble(stack.pop());

                double sum = Output2 - Output1;
                stack.push(String.valueOf(sum));
                TextArea.setText(String.valueOf(sum));
            } catch (Exception e)
            {
                TF_Error.setText("Geben Sie mehr Werte ein!");
            }
        }
    }

    public void multiply()
    {
        if (btnMultiply.isHover())
        {
            try {
                double Output1 = Double.parseDouble(stack.pop());
                double Output2 = Double.parseDouble(stack.pop());

                double sum = Output2 * Output1;
                stack.push(String.valueOf(sum));
                TextArea.setText(String.valueOf(sum));
            } catch (Exception e)
            {
                TF_Error.setText("Geben Sie mehr Werte ein!");
            }
        }
    }

    public void divide()
    {
        if (btnDivide.isHover())
        {
            try {
                double Output1 = Double.parseDouble(stack.pop());
                double Output2 = Double.parseDouble(stack.pop());

                double sum = Output2 / Output1;
                stack.push(String.valueOf(sum));
                TextArea.setText(String.valueOf(sum));
            } catch (Exception e)
            {
                TF_Error.setText("Geben Sie mehr Werte ein!");
            }
        }
    }

    public void reciprocal()
    {
        if (btnReciprocal.isHover())
        {
            try {
                double Output1 = Double.parseDouble(stack.pop());

                double sum = 1 / Output1;
                stack.push(String.valueOf(sum));
                TextArea.setText(String.valueOf(sum));
            } catch (Exception e)
            {
                TF_Error.setText("Geben Sie einen Wert ein!");
            }
        }
    }

    public void change()
    {
        if (btnChange.isHover())
        {
            try {
                double Output1 = Double.parseDouble(stack.pop());
                double Output2 = Double.parseDouble(stack.pop());

                stack.push(String.valueOf(Output2));                        //Stack wird eingelesen und umgekehrt ausgegeben
                stack.push(String.valueOf(Output1));
                TextArea.setText(String.valueOf(stack));                    //Ausgabe nicht mit TextArea.setText(String.valueOf(Output1)); und TextArea.setText(String.valueOf(Output1)); da sonst nu einer der beiden Werte ausgegeben wird

            } catch (Exception e)
            {
                TF_Error.setText("Geben Sie mehr Werte ein!");
            }
        }
    }
}