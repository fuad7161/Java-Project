package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
	// write your code here
        new frame();
    }
}
class frame extends JFrame implements ActionListener {
    //Lable
    JLabel heading,result,check,fontpic;
    //button
    JButton find,Submit;
    //textFild
    JTextField TextHere;
    //text area
    JTextArea text;
    //redio Button
    JRadioButton b1,b2,b3,b4,b5;
    public frame(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500,50,500,450);
        setLayout(null);
        //Lable
        heading = new JLabel("write something here: ");
        check = new JLabel("what you have done today?");
        heading.setBounds(10,5,400,30);
        check.setBounds(10,205,400,30);
        add(heading);
        add(check);
        //Button
        Submit = new JButton("Submit");
        Submit.setBounds(320,40,100,30);
        add(Submit);
        find = new JButton("Check your results.");
        find.setBounds(10,240,400,30);
        add(find);
        Submit.addActionListener(this);
        find.addActionListener(this);
        //TextFild
        TextHere = new JTextField();
        TextHere.setBounds(10,40,300,30);
        add(TextHere);
        //text area
        text = new JTextArea();
        text.setBounds(10,280,400,100);
        add(text);
        //RadioButton
        b1 = new JRadioButton();
        b1.setBounds(10,75,400,30);
        b2 = new JRadioButton();
        b2.setBounds(10,110,400,30);
        b3 = new JRadioButton();
        b3.setBounds(10,145,400,30);
        b4 = new JRadioButton();
        b4.setBounds(10,180,400,30);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == Submit){
            String text = TextHere.getText();
            if(b1.getText() == ""){
                b1.setText(text);
            }else if(b2.getText() == ""){
                b2.setText(text);
            }else if(b3.getText() == ""){
                b3.setText(text);
            }else if(b4.getText() == ""){
                b4.setText(text);
            }
            TextHere.setText("");
        }
        if(e.getSource() == find){
            JRadioButton[]  anArray = new JRadioButton[4];
            anArray[0] = b1;
            anArray[1] = b2;
            anArray[2] = b3;
            anArray[3] = b4;
            int cnt = 0;
            for(int i=0;i<4;i++){
                if(anArray[i].isSelected()==true){
                    cnt++;
                }
            }
            if(cnt == 0){
                String text1 = "you are such a loser."+"\n"+" you even don't complete a single task from your check list." +
                        "\n"+" It's high time to change yourself."+"\n"+" Otherwise you will be ruin one day";
                text.setText(text1);
            }else if(cnt == 1){
                String text1 = "you are a bad student."+"\n"+" you complete a single task from your check list." +
                        "\n"+" You should do better next time."+"\n"+" Otherwise you will be ruin one day";
                text.setText(text1);
            }else if(cnt == 2){
                String text1 = "you are neither a good student nor a bad student."+"\n"+" you complete half of " +
                        "your task from your check list." +
                        "\n"+" You should try to do better next time."+"\n"+" Otherwise you will be ruin one day";
                text.setText(text1);
            }else if(cnt == 3){
                String text1 = "you are a little good student."+"\n"+" you complete most of your task from your check list." +
                        "\n"+" You should try to do better next time."+"\n"+" And have fun with your life.:)";
                text.setText(text1);
            }else if(cnt == 4){
                String text1 = "you are a very good student"+"\n"+" you complete all of your task from your check list." +
                        "\n"+" And have fun with your life and enjoy yourself.:)";
                text.setText(text1);
            }
        }
    }
}
