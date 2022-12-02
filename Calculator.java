import java.awt.*;
import java.awt.event.*;
import java.util.regex.*;
import javax.swing.*;

class Calculator

{
    private Container c;
    private JFrame frame;
    private JTextField text1;
    private JTextField text2;
    private JLabel result;
    private JButton add,sub,multi,div,clear;

    public Calculator()
    {
        frame = new JFrame();
        frame.setBounds(100, 100, 300, 400); 
        frame.setResizable(false); 
        c=frame.getContentPane();
        c.setBackground(Color.white);
        
        text1=new JTextField();
        text1.setBounds(10, 10, 250, 50);
        c.add(text1);

        text2=new JTextField();
        text2.setBounds(10, 70, 250, 50);
        c.add(text2);

        add=new JButton("+");
        add.setBounds(10, 150, 50, 50);
        c.add(add);

        sub=new JButton("-");
        sub.setBounds(70, 150, 50, 50);
        c.add(sub);

        multi=new JButton("*");
        multi.setBounds(130, 150, 50, 50);
        c.add(multi);

        div=new JButton("/");
        div.setBounds(190, 150, 50, 50);
        c.add(div);

        clear=new JButton("clear");
        clear.setBounds(10, 270, 250, 50);
        c.add(clear);

        result=new JLabel("result");
        result.setBounds(10, 210, 250, 50);
        result.setBackground(Color.ORANGE);
        c.add(result);

        c.setLayout(null);
        frame.setVisible(true); 
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    
        add.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) 
        {
            if(!Pattern.matches("^[0-9]+$", text1.getText()) || !Pattern.matches("^[0-9]+$", text2.getText()))
            {
                result.setText("Invalid Input");
            }
            else
            {
                int c=Integer.valueOf(text2.getText()) + Integer.valueOf(text1.getText());
                result.setText(String.valueOf(c));
            }
        }
    });

    sub.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) 
        {
            if(!Pattern.matches("^[0-9]+$", text1.getText()) || !Pattern.matches("^[0-9]+$", text2.getText()))
            {
                result.setText("Invalid Input");
            }
            else
            {
                int c=Integer.valueOf(text2.getText()) - Integer.valueOf(text1.getText());
                result.setText(String.valueOf(c));
            }
        }
    });

    multi.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) 
        {
            if(!Pattern.matches("^[0-9]+$", text1.getText()) || !Pattern.matches("^[0-9]+$", text2.getText()))
            {
                result.setText("Invalid Input");
            }
            else
            {
                long c=Integer.valueOf(text2.getText()) * Integer.valueOf(text1.getText());
                result.setText(String.valueOf(c));
            }
        }
    });

    div.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) 
        {
            if(!Pattern.matches("^[0-9]+$", text1.getText()) || !Pattern.matches("^[0-9]+$", text2.getText()))
            {
                result.setText("Invalid Input");
            }
            else
            {
                float c=Integer.valueOf(text2.getText()) / Integer.valueOf(text1.getText());
                result.setText(String.valueOf(c));
            }
        }
    });

    clear.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) 
        {
            text1.setText("");
            text2.setText("");
            result.setText("");
        }
    });
    }

    public static void main(String[] args) 
    {
        new Calculator();
    }
}