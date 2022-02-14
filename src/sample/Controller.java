package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Procent;

public class Controller {
    public TextField SumTextField;
    public Button BigPrBtn;
    public Label BigTipsLbl;
    public Button MiddlePrBtn;
    public Label MiddleTipsLbl;
    public Button SmallPrBtn;
    public Label SmallTipsLbl;

    public void BigOnClick(ActionEvent actionEvent) {
        double sum = Double.parseDouble(SumTextField.getText());
        int pr = 15;
        Procent bigPr = new Procent(sum, pr);
        BigTipsLbl.setText(String.valueOf(bigPr.countSumTrunc(sum, pr)));
    }

    public void MiddleOnClick(ActionEvent actionEvent) {
        double sum = Double.parseDouble(SumTextField.getText());
        int pr = 10;
        Procent midPr = new Procent(sum, pr);
        MiddleTipsLbl.setText(String.valueOf(midPr.countSumTrunc(sum, pr)));
    }

    public void SmallOnClick(ActionEvent actionEvent) {
        double sum = Double.parseDouble(SumTextField.getText());
        int pr = 3;
        Procent smallPr = new Procent(sum, pr);
        SmallTipsLbl.setText(String.valueOf(smallPr.countSumTrunc(sum, pr)));
    }
}
