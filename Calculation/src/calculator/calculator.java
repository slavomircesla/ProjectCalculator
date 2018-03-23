package calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator {
    private JTextField Answer;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton a6Button;
    private JButton a9Button;
    private JButton button7;
    private JButton a0Button;
    private JButton a1;
    private JButton a2;
    private JButton a3;
    private JButton a4;
    private JButton a6;
    private JButton a5;
    private JButton a7;
    private JButton a8;
    private JLabel Label;

    double num,ans;
    int calculation;

    public void arithmetic_operation()
    {
        switch (calculation)
        {
            case 1: ans = num+Double.parseDouble(Answer.getText()); //+
                Answer.setText(Double.toString(ans));
                break;
            case 2: ans = num-Double.parseDouble(Answer.getText()); // -
                Answer.setText(Double.toString(ans));
                break;

            case 3: ans = num*Double.parseDouble(Answer.getText()); // *
                Answer.setText(Double.toString(ans));
                break;

            case 4: ans = num/Double.parseDouble(Answer.getText()); // /
                Answer.setText(Double.toString(ans));
                break;
        }
    }



    public calculator() {
        a1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Answer.setText(Answer.getText()+"1");
            }
        });
        a4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Answer.setText(Answer.getText()+"2");
            }
        });
        a3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Answer.setText(Answer.getText()+"3");
            }
        });
        a6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Answer.setText(Answer.getText()+"4");
            }
        });
        a8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Answer.setText(Answer.getText()+"5");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Answer.setText(Answer.getText()+"6");
            }
        });
        a5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Answer.setText(Answer.getText()+"7");
            }
        });
        a7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Answer.setText(Answer.getText()+"8");
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Answer.setText(Answer.getText()+"9");
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Answer.setText(Answer.getText()+"0");
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                arithmetic_operation();
                Label.setText("");
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(Answer.getText());
                calculation=4;
                Answer.setText("");
                Label.setText(num + "/");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(Answer.getText());
                calculation=3;
                Answer.setText("");
                Label.setText(num + "*");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(Answer.getText());
                calculation=2;
                Answer.setText("");
                Label.setText(num + "-");
            }
        });
        a2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(Answer.getText());
                calculation=1;
                Answer.setText("");
                Label.setText(num + "+");

            }
        });

    }
}
